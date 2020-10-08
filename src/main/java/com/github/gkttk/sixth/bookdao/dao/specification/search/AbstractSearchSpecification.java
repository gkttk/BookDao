package com.github.gkttk.sixth.bookdao.dao.specification.search;

import com.github.gkttk.sixth.bookdao.model.Book;
import com.github.gkttk.sixth.bookdao.model.BookStorage;

import java.util.ArrayList;
import java.util.List;

/**
 * Common class for search specifications. Method getData() depends on realization of the class.
 */
public abstract class AbstractSearchSpecification {

    public List<Book> find(BookStorage bookStorage, String requiredData) {
        List<Book> books = bookStorage.getBooks();
        List<Book> resultBooks = new ArrayList<>();
        for (Book book : books) {
            String currentData = getData(book);
            if (currentData.equals(requiredData)) {
                resultBooks.add(book);
            }
        }
        return resultBooks;
    }

    protected abstract String getData(Book book);


}
