package com.bookmarker.domain;


import java.util.List;

public record BookmarksDTO(List<BookmarkDTO> data, PageDto page) {

}
