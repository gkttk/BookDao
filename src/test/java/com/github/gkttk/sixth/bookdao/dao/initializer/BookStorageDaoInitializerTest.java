package com.github.gkttk.sixth.bookdao.dao.initializer;

import com.github.gkttk.sixth.bookdao.dao.BookDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookStorageDaoInitializerTest {

    public final static BookDaoInitializer BOOK_DAO_INITIALIZER = new BookStorageDaoInitializer();

    @Test
    public void testInitializeBookDaoShouldFillBookStorageByBooks(){
        //given
        BookDao bookDao = BOOK_DAO_INITIALIZER.initializeBookDao();
        int expectedCount = 12;
        //when
        int result = bookDao.count();
        //then
        Assertions.assertEquals(expectedCount, result);
    }

}
