package com.github.gkttk.sixth.bookdao.dao.initializer;

import com.github.gkttk.sixth.bookdao.dao.BookDao;

/**
 * Interface for initializing of database.
 */
public interface BookDaoInitializer {
    BookDao initializeBookDao();

}
