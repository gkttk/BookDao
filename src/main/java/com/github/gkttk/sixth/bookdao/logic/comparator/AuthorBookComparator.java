package com.github.gkttk.sixth.bookdao.logic.comparator;

import com.github.gkttk.sixth.bookdao.model.Book;

import java.util.Comparator;

/**
 * Comparator for sorting books by author.
 */
public class AuthorBookComparator implements Comparator<Book> {
    @Override
    public int compare(Book firstBook, Book secondBook) {
        String firstAuthor = firstBook.getAuthor();
        String secondAuthor = secondBook.getAuthor();

        return firstAuthor.compareTo(secondAuthor);
    }
}
