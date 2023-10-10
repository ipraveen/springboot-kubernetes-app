package com.bookmarker.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class BookmarkService {

    private final BookmarkRepository repository;


    @Transactional(readOnly = true)
    public BookmarksDTO getBookmarks(Integer page){

        int pageNo = page < 1? 0: page -1;

        Pageable pagable = PageRequest.of(pageNo, 5, Sort.Direction.DESC, "createdAt");

        Page<BookmarkDTO> bookmarkPage = repository.findBookmarks(pagable);

        PageDto pageDto = new PageDto(bookmarkPage);
        return new BookmarksDTO(bookmarkPage.getContent(), pageDto);
    }
}
