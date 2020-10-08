package com.github.gkttk.sixth.bookdao.dao.specification.search;

import com.github.gkttk.sixth.bookdao.model.Book;

/**
 * Search by title.
 */
public class TitleSearchSpecification extends AbstractSearchSpecification {


    @Override
    protected String getData(Book book) {
        return book.getTitle();
    }
}
