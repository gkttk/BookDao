package com.github.gkttk.sixth.bookdao.logic.comparator;

import com.github.gkttk.sixth.bookdao.model.Book;

import java.util.Comparator;

/**
 * Comparator for sorting books by year.
 */
public class YearBookComparator implements Comparator<Book> {
    @Override
    public int compare(Book firstBook, Book secondBook) {
        Integer firstYear = firstBook.getYear();
        Integer secondYear = secondBook.getYear();
        return firstYear.compareTo(secondYear);
    }
}
