package com.github.gkttk.sixth.bookdao.dao;

import com.github.gkttk.sixth.bookdao.dao.enums.Criteria;
import com.github.gkttk.sixth.bookdao.dao.specification.search.AbstractSearchSpecification;
import com.github.gkttk.sixth.bookdao.dao.specification.search.factory.SearchSpecificationFactory;
import com.github.gkttk.sixth.bookdao.dao.specification.sort.AbstractSortSpecification;
import com.github.gkttk.sixth.bookdao.dao.specification.sort.factory.SortSpecificationFactory;
import com.github.gkttk.sixth.bookdao.exception.BookStorageDaoException;
import com.github.gkttk.sixth.bookdao.exception.SpecificationFactoryException;
import com.github.gkttk.sixth.bookdao.model.Book;
import com.github.gkttk.sixth.bookdao.model.BookStorage;

import java.util.List;

/**
 * This class is linked with book storage and it responses for find/sort/add/remove operations with this book storage.
 */
public class BookStorageDao implements BookDao {

    private final BookStorage bookStorage;
    private static final SearchSpecificationFactory SEARCH_SPECIFICATION_FACTORY = new SearchSpecificationFactory();
    private static final SortSpecificationFactory SORT_SPECIFICATION_FACTORY = new SortSpecificationFactory();

    public BookStorageDao(BookStorage bookStorage) {
        this.bookStorage = bookStorage;
    }

    public void addBook(Book book) throws BookStorageDaoException {
        if (!bookStorage.containBook(book)) {
            bookStorage.addBook(book);
        } else {
            throw new BookStorageDaoException("This book is already in book storage", book);
        }
    }

    @Override
    public void removeBook(Book book) throws BookStorageDaoException {
        if (bookStorage.containBook(book)) {
            bookStorage.removeBook(book);
        } else {
            throw new BookStorageDaoException("There is no this book in current book storage.", book);
        }
    }

    @Override
    public List<Book> findByTag(Criteria criteria, String value) throws SpecificationFactoryException {
        AbstractSearchSpecification searchSpecification = SEARCH_SPECIFICATION_FACTORY.createSpecification(criteria);
        return searchSpecification.find(bookStorage, value);
    }

    @Override
    public List<Book> sortBooksByTag(Criteria criteria) throws SpecificationFactoryException {
        AbstractSortSpecification sortSpecification = SORT_SPECIFICATION_FACTORY.createSpecification(criteria);
        return sortSpecification.sort(bookStorage);
    }

    @Override
    public int count() {
        return bookStorage.size();
    }
}
