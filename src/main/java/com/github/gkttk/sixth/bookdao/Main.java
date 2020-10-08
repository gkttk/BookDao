package com.github.gkttk.sixth.bookdao;

import com.github.gkttk.sixth.bookdao.dao.BookDao;
import com.github.gkttk.sixth.bookdao.dao.enums.Criteria;
import com.github.gkttk.sixth.bookdao.dao.initializer.BookDaoInitializer;
import com.github.gkttk.sixth.bookdao.dao.initializer.BookStorageDaoInitializer;
import com.github.gkttk.sixth.bookdao.exception.SpecificationFactoryException;
import com.github.gkttk.sixth.bookdao.model.Book;
import com.github.gkttk.sixth.bookdao.view.ResultPrinter;
import com.github.gkttk.sixth.bookdao.view.factory.ConsoleResultPrinterFactory;
import com.github.gkttk.sixth.bookdao.view.factory.ResultPrinterFactory;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;


public class Main {

    static {
        ResultPrinterFactory resultPrinterFactory = new ConsoleResultPrinterFactory();
        RESULT_PRINTER = resultPrinterFactory.createResultPrinter();

        BookDaoInitializer bookDAOInitializer = new BookStorageDaoInitializer();
        BOOK_DAO = bookDAOInitializer.initializeBookDao();
    }

    private static final Logger LOGGER = LogManager.getLogger(Main.class);
    private static final ResultPrinter RESULT_PRINTER;
    private static final BookDao BOOK_DAO;


    public static void main(String[] args) {

        try {
            checkFind(Criteria.AUTHOR, "FirstAuthor");
            checkSort(Criteria.AUTHOR);

            checkFind(Criteria.TITLE, "FirstMysteryBook");
            checkSort(Criteria.TITLE);

            checkFind(Criteria.GENRE, "HORROR");
            checkSort(Criteria.GENRE);

            checkFind(Criteria.YEAR, "2000");
            checkSort(Criteria.YEAR);

            checkFind(Criteria.PAGES, "550");
            checkSort(Criteria.PAGES);
        } catch (SpecificationFactoryException exception) {
            LOGGER.error("Trouble with SpecificationFactory", exception);
        }


    }


    private static void checkFind(Criteria criteria, String value) throws SpecificationFactoryException {
        LOGGER.log(Level.INFO, "Finding books by " + criteria.name());
        List<Book> booksByAuthor = BOOK_DAO.findByTag(criteria, value);
        RESULT_PRINTER.print(booksByAuthor);
    }

    private static void checkSort(Criteria criteria) throws SpecificationFactoryException {
        LOGGER.log(Level.INFO, "Sorting books by " + criteria.name());
        List<Book> booksByAuthor = BOOK_DAO.sortBooksByTag(criteria);
        RESULT_PRINTER.print(booksByAuthor);
    }

}
