package com.github.gkttk.sixth.bookdao.dao.specification.sort;

import com.github.gkttk.sixth.bookdao.model.Book;
import com.github.gkttk.sixth.bookdao.logic.comparator.GenreBookComparator;

import java.util.Comparator;

/**
 * Sort by genre of a book.
 */
public class GenreSortSpecification extends AbstractSortSpecification {
    @Override
    protected Comparator<Book> getComparator() {
        return new GenreBookComparator();
    }
}
