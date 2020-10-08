package com.github.gkttk.sixth.bookdao.view;

import com.github.gkttk.sixth.bookdao.model.Book;

import java.util.List;

/**
 * This class is responsible for console output.
 */
public class ConsoleResultPrinter implements ResultPrinter {
    @Override
    public void print(List<Book> books) {
        System.out.println("-----");
        for (Book book: books){
            System.out.println(book);
        }
        System.out.println("-----");
    }
}
