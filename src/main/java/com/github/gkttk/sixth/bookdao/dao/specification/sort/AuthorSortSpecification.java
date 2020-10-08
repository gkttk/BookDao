package com.github.gkttk.sixth.bookdao.dao.specification.sort;

import com.github.gkttk.sixth.bookdao.model.Book;
import com.github.gkttk.sixth.bookdao.logic.comparator.AuthorBookComparator;

import java.util.Comparator;

/**
 * Sort by author.
 */
public class AuthorSortSpecification extends AbstractSortSpecification {


    @Override
    protected Comparator<Book> getComparator() {
        return new AuthorBookComparator();
    }
}
