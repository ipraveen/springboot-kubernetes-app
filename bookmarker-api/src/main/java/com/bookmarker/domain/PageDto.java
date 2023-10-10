package com.bookmarker.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Page;

@Getter
@Setter
public class PageDto {

    private Long itemsCount;

    private Integer pagesCount;
    private Integer currentPage;
    @JsonProperty("isFirst")
    private boolean isFirst;
    @JsonProperty("isLast")
    private boolean isLast;
    private boolean hasNext;
    private boolean hasPrevious;

    public PageDto(Page page) {


        this.itemsCount = page.getTotalElements();
        this.pagesCount = page.getTotalPages();
        this.currentPage = page.getNumber();
        this.hasNext = page.hasNext();
        this.hasPrevious = page.hasPrevious();

        // this.isFirst = page.isFirst();
        // this.isLast = page.isLast();


        // This will help in proper naming of variable in JSON output.
        this.setFirst(page.isFirst());
        this.setLast(page.isLast());

    }


    //
}
