package com.github.gkttk.sixth.bookdao.dao.initializer;

import com.github.gkttk.sixth.bookdao.dao.BookDao;
import com.github.gkttk.sixth.bookdao.dao.BookStorageDao;
import com.github.gkttk.sixth.bookdao.model.Book;
import com.github.gkttk.sixth.bookdao.model.BookStorage;
import com.github.gkttk.sixth.bookdao.model.enums.Genre;


/**
 * This class initialise stub for database.
 */
public class BookStorageDaoInitializer implements BookDaoInitializer {
    @Override
    public BookDao initializeBookDao() {
        BookStorage bookStorage = new BookStorage();
        Book book1 = new Book("FirstThrillerBook", Genre.THRILLER, "FirstAuthor", 2000, 400);
        Book book2 = new Book("SecondThrillerBook", Genre.THRILLER, "SecondAuthor", 2010, 800);
        Book book3 = new Book("FirstAdventureBook", Genre.ADVENTURE, "FirstAuthor", 1990, 250);
        Book book4 = new Book("SecondAdventureBook", Genre.ADVENTURE, "ThirdAuthor", 2005, 550);
        Book book5 = new Book("FirstFantasyBook", Genre.FANTASY, "SecondAuthor", 2000, 800);
        Book book6 = new Book("SecondFantasyBook", Genre.FANTASY, "ThirdAuthor", 1990, 550);
        Book book7 = new Book("FirstHorrorBook", Genre.HORROR, "FourthAuthor", 2000, 200);
        Book book8 = new Book("SecondHorrorBook", Genre.HORROR, "SixthAuthor", 2015, 250);
        Book book9 = new Book("FirstMysteryBook", Genre.MYSTERY, "FifthAuthor", 1990, 550);
        Book book10 = new Book("SecondMysteryBook", Genre.MYSTERY, "SixthAuthor", 2015, 1000);
        Book book11 = new Book("FirstRomanceBook", Genre.ROMANCE, "FifthAuthor", 2005, 800);
        Book book12 = new Book("SecondRomanceBook", Genre.ROMANCE, "FourthAuthor", 2010, 1000);

        bookStorage.addBook(book1);
        bookStorage.addBook(book2);
        bookStorage.addBook(book3);
        bookStorage.addBook(book4);
        bookStorage.addBook(book5);
        bookStorage.addBook(book6);
        bookStorage.addBook(book7);
        bookStorage.addBook(book8);
        bookStorage.addBook(book9);
        bookStorage.addBook(book10);
        bookStorage.addBook(book11);
        bookStorage.addBook(book12);

        return new BookStorageDao(bookStorage);
    }
}
