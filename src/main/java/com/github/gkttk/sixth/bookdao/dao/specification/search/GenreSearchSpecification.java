package com.github.gkttk.sixth.bookdao.dao.specification.search;

import com.github.gkttk.sixth.bookdao.model.Book;
import com.github.gkttk.sixth.bookdao.model.enums.Genre;

/**
 * Search by genre of book.
 */
public class GenreSearchSpecification extends AbstractSearchSpecification {


    @Override
    protected String getData(Book book) {
        Genre genre = book.getGenre();
        return genre.name();
    }
}
