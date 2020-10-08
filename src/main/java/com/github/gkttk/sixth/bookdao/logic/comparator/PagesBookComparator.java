package com.github.gkttk.sixth.bookdao.logic.comparator;

import com.github.gkttk.sixth.bookdao.model.Book;

import java.util.Comparator;

/**
 * Comparator for sorting books by number of pages.
 */
public class PagesBookComparator implements Comparator<Book> {
    @Override
    public int compare(Book firstBook, Book secondBook) {
        Integer firstPages = firstBook.getYear();
        Integer secondPages = secondBook.getYear();
        return firstPages.compareTo(secondPages);
    }
}
