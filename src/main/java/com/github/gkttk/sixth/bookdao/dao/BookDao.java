package com.github.gkttk.sixth.bookdao.dao;

import com.github.gkttk.sixth.bookdao.dao.enums.Criteria;
import com.github.gkttk.sixth.bookdao.exception.BookStorageDaoException;
import com.github.gkttk.sixth.bookdao.exception.SpecificationFactoryException;
import com.github.gkttk.sixth.bookdao.model.Book;

import java.util.List;

/**
 * Common BookDao interface.
 */
public interface BookDao {

    void addBook(Book book) throws BookStorageDaoException;

    void removeBook(Book book) throws BookStorageDaoException;

    List<Book> findByTag(Criteria criteria, String value) throws SpecificationFactoryException;

    List<Book> sortBooksByTag(Criteria criteria) throws SpecificationFactoryException;

    int count();
}
