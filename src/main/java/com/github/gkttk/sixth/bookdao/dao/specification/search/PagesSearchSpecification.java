package com.github.gkttk.sixth.bookdao.dao.specification.search;

import com.github.gkttk.sixth.bookdao.model.Book;

/**
 * Search by number of pages in a book.
 */
public class PagesSearchSpecification extends AbstractSearchSpecification {


    @Override
    protected String getData(Book book) {
        int pages = book.getPages();
        return String.valueOf(pages);
    }
}
