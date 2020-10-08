package com.github.gkttk.sixth.bookdao.logic.comparator;

import com.github.gkttk.sixth.bookdao.model.Book;

import java.util.Comparator;

/**
 * Comparator for sorting books by title.
 */
public class TitleBookComparator implements Comparator<Book> {
    @Override
    public int compare(Book firstBook, Book secondBook) {
        String firstTitle = firstBook.getTitle();
        String secondTitle = secondBook.getTitle();
        return firstTitle.compareTo(secondTitle);
    }
}
