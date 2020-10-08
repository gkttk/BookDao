package com.github.gkttk.sixth.bookdao.dao.specification.search;

import com.github.gkttk.sixth.bookdao.model.Book;

/**
 * Search by year of book release.
 */
public class YearSearchSpecification extends AbstractSearchSpecification {


    @Override
    protected String getData(Book book) {
        int year = book.getYear();
        return String.valueOf(year);
    }
}
