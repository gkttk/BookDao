package com.github.gkttk.sixth.bookdao.dao.specification.sort;

import com.github.gkttk.sixth.bookdao.model.Book;
import com.github.gkttk.sixth.bookdao.logic.comparator.TitleBookComparator;

import java.util.Comparator;

/**
 * Sort by title.
 */
public class TitleSortSpecification extends AbstractSortSpecification {
    @Override
    protected Comparator<Book> getComparator() {
        return new TitleBookComparator();
    }
}
