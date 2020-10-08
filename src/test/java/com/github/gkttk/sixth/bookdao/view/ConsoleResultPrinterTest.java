package com.github.gkttk.sixth.bookdao.view;

import com.github.gkttk.sixth.bookdao.model.Book;
import com.github.gkttk.sixth.bookdao.model.enums.Genre;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

public class ConsoleResultPrinterTest {

    private final static ByteArrayOutputStream NEW_OUT = new ByteArrayOutputStream();
    private final static PrintStream DEFAULT_OUT = System.out;
    private final ConsoleResultPrinter consoleResultPrinter = new ConsoleResultPrinter();

    @BeforeAll
    static void init() {
        System.setOut(new PrintStream(NEW_OUT));
    }

    @Test
    public void testPrintResultShouldPrintCorrectLine() {
        //given
        Book bookForTest = new Book("testTitle", Genre.THRILLER, "testAuthor", 2000, 100);
        List<Book> books = Arrays.asList(bookForTest);
        String expectedResult = "-----\r\n" + bookForTest.toString() + "\r\n-----\r\n";
        //when
        consoleResultPrinter.print(books);
        //then
        Assertions.assertEquals(expectedResult, NEW_OUT.toString());
    }

    @AfterAll
    static void destroy() {
        System.setOut(DEFAULT_OUT);
    }
}
