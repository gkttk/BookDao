package com.github.gkttk.sixth.bookdao.logic.comparator;

import com.github.gkttk.sixth.bookdao.model.Book;
import com.github.gkttk.sixth.bookdao.model.enums.Genre;

import java.util.Comparator;

/**
 * Comparator for sorting books by genre.
 */
public class GenreBookComparator implements Comparator<Book> {
    @Override
    public int compare(Book firstBook, Book secondBook) {
        Genre firstGenre = firstBook.getGenre();
        Genre secondGenre = secondBook.getGenre();
        Integer firstBookOrdinal = firstGenre.ordinal();
        Integer secondBookOrdinal = secondGenre.ordinal();
        return firstBookOrdinal.compareTo(secondBookOrdinal);
    }
}
