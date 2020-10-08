package com.github.gkttk.sixth.bookdao.dao.specification.sort;

import com.github.gkttk.sixth.bookdao.model.Book;
import com.github.gkttk.sixth.bookdao.logic.comparator.PagesBookComparator;

import java.util.Comparator;

/**
 * Sort by number of pages in a book.
 */
public class PagesSortSpecification extends AbstractSortSpecification {
    @Override
    protected Comparator<Book> getComparator() {
        return new PagesBookComparator();
    }
}
