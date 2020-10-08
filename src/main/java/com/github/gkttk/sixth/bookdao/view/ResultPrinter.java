package com.github.gkttk.sixth.bookdao.view;

import com.github.gkttk.sixth.bookdao.model.Book;

import java.util.List;

/**
 * Common interface for ResultPrinter.
 */
public interface ResultPrinter {
    void print(List<Book> books);

}
