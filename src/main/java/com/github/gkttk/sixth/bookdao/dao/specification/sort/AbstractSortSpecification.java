package com.github.gkttk.sixth.bookdao.dao.specification.sort;

import com.github.gkttk.sixth.bookdao.model.Book;
import com.github.gkttk.sixth.bookdao.model.BookStorage;

import java.util.Comparator;
import java.util.List;
/**
 * Common class for sort specifications. Method getComparator() depends on realization of the class.
 */
public abstract class AbstractSortSpecification {

    protected final Comparator<Book> comparator;

    protected AbstractSortSpecification() {
        this.comparator = getComparator();
    }

    public List<Book> sort(BookStorage bookStorage) {
        List<Book> books = bookStorage.getBooks();
        books.sort(comparator);
        return books;
    }

    protected abstract Comparator<Book> getComparator();


}
