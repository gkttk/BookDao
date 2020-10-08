package com.github.gkttk.sixth.bookdao.exception;

import com.github.gkttk.sixth.bookdao.model.Book;

public class BookStorageDaoException extends Exception {

    public BookStorageDaoException(String message, Book book) {
        super(message);
        System.out.println(book);
    }
}
