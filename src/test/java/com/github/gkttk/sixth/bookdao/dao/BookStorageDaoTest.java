package com.github.gkttk.sixth.bookdao.dao;

import com.github.gkttk.sixth.bookdao.dao.enums.Criteria;
import com.github.gkttk.sixth.bookdao.dao.initializer.BookDaoInitializer;
import com.github.gkttk.sixth.bookdao.dao.initializer.BookStorageDaoInitializer;
import com.github.gkttk.sixth.bookdao.exception.BookStorageDaoException;
import com.github.gkttk.sixth.bookdao.exception.SpecificationFactoryException;
import com.github.gkttk.sixth.bookdao.model.Book;
import com.github.gkttk.sixth.bookdao.model.BookStorage;
import com.github.gkttk.sixth.bookdao.model.enums.Genre;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

public class BookStorageDaoTest {


    private static BookDao bookStorageDao;

    @BeforeAll
    static void init() {
        BookDaoInitializer bookDAOInitializer = new BookStorageDaoInitializer();
        bookStorageDao = bookDAOInitializer.initializeBookDao();
    }

    @Test
    public void testAddBookShouldAddBookIntoBookStorageIfBookIsNotInStorage() throws BookStorageDaoException {
        //given
        BookStorage bookStorage = new BookStorage();
        BookStorageDao bookStorageDAO = new BookStorageDao(bookStorage);
        Book bookForAdding = new Book("TestBook", Genre.THRILLER, "TestAuthor", 2020, 10000);
        int expectedSize = 1;
        //when
        bookStorageDAO.addBook(bookForAdding);
        //then
        List<Book> booksFromStorage = bookStorage.getBooks();
        Assertions.assertEquals(expectedSize, booksFromStorage.size());
    }

    @Test
    public void testAddBookShouldThrowExceptionIfTheBookIsAlreadyInStorage() {
        //given
        BookStorage bookStorage = new BookStorage();
        Book bookForAdding = new Book("TestBook", Genre.THRILLER, "TestAuthor", 2020, 10000);
        bookStorage.addBook(bookForAdding);
        BookStorageDao bookStorageDAO = new BookStorageDao(bookStorage);
        //when
        //then
        Assertions.assertThrows(BookStorageDaoException.class, () -> bookStorageDAO.addBook(bookForAdding));
    }

    @Test
    public void testRemoveBookShouldRemoveBookFromBookStorage() throws BookStorageDaoException {
        //given
        BookStorage bookStorage = new BookStorage();
        Book bookForRemoving = new Book("TestBook", Genre.THRILLER, "TestAuthor", 2020, 10000);
        bookStorage.addBook(bookForRemoving);
        BookStorageDao bookStorageDAO = new BookStorageDao(bookStorage);
        int expectedSize = 0;
        //when
        bookStorageDAO.removeBook(bookForRemoving);
        //then
        List<Book> booksFromStorage = bookStorage.getBooks();
        Assertions.assertEquals(expectedSize, booksFromStorage.size());
    }

    @Test
    public void testRemoveBookShouldThrowExceptionThereIsNoSuchBookInStorage() {
        //given
        BookStorage bookStorage = new BookStorage();
        Book bookForRemoving = new Book("TestBook", Genre.THRILLER, "TestAuthor", 2020, 10000);
        BookStorageDao bookStorageDAO = new BookStorageDao(bookStorage);
        //when
        //then
        Assertions.assertThrows(BookStorageDaoException.class, () -> bookStorageDAO.removeBook(bookForRemoving));
    }


    @Test
    public void testFindByTagShouldFindBooksWithTitleCriteria() throws SpecificationFactoryException {
        //given
        Criteria criteria = Criteria.TITLE;
        String title = "FirstMysteryBook";
        List<Book> expectedBook = Collections.singletonList(new Book("FirstMysteryBook", Genre.MYSTERY, "FifthAuthor", 1990, 550));
        //when
        List<Book> foundedBooks = bookStorageDao.findByTag(criteria, title);
        //then
        Assertions.assertEquals(expectedBook, foundedBooks);

    }

    @Test
    public void testFindByTagShouldFindBooksWithAuthorCriteria() throws SpecificationFactoryException {
        //given
        Criteria criteria = Criteria.AUTHOR;
        String expectedAuthor = "FifthAuthor";
        //when
        List<Book> foundedBooks = bookStorageDao.findByTag(criteria, expectedAuthor);
        //then
        for (Book book : foundedBooks) {
            Assertions.assertEquals(book.getAuthor(), expectedAuthor);
        }
    }

    @Test
    public void testFindByTagShouldFindBooksWithGenreCriteria() throws SpecificationFactoryException {
        //given
        Criteria criteria = Criteria.GENRE;
        Genre expectedGenre = Genre.HORROR;
        String expectedGenreString = Genre.HORROR.name();
        //when
        List<Book> foundedBooks = bookStorageDao.findByTag(criteria, expectedGenreString);
        //then
        for (Book book : foundedBooks) {
            Assertions.assertEquals(book.getGenre(), expectedGenre);
        }
    }

    @Test
    public void testFindByTagShouldFindBooksWithPagesCriteria() throws SpecificationFactoryException {
        //given
        Criteria criteria = Criteria.PAGES;
        int expectedPages = 550;
        String expectedPagesString = "550";
        //when
        List<Book> foundedBooks = bookStorageDao.findByTag(criteria, expectedPagesString);
        //then
        for (Book book : foundedBooks) {
            Assertions.assertEquals(book.getPages(), expectedPages);
        }
    }

    @Test
    public void testFindByTagShouldFindBooksWithYearCriteria() throws SpecificationFactoryException {
        //given
        Criteria criteria = Criteria.YEAR;
        int expectedYear = 2000;
        String expectedYearString = "2000";
        //when
        List<Book> foundedBooks = bookStorageDao.findByTag(criteria, expectedYearString);
        //then
        for (Book book : foundedBooks) {
            Assertions.assertEquals(book.getYear(), expectedYear);
        }
    }


}
