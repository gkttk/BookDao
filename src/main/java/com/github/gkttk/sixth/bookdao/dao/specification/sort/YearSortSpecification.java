package com.github.gkttk.sixth.bookdao.dao.specification.sort;

import com.github.gkttk.sixth.bookdao.model.Book;
import com.github.gkttk.sixth.bookdao.logic.comparator.YearBookComparator;

import java.util.Comparator;

/**
 * Sort by year of book release.
 */
public class YearSortSpecification extends AbstractSortSpecification {
    @Override
    protected Comparator<Book> getComparator() {
        return new YearBookComparator();
    }
}
