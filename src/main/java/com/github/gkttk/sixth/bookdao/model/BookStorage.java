package com.github.gkttk.sixth.bookdao.model;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a storage for books.
 */
public class BookStorage {

    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public boolean containBook(Book book) {
        return books.contains(book);
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }

    public int size(){
        return books.size();
    }


}
