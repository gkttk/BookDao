package com.github.gkttk.sixth.bookdao.exception;

public class PagesSpecificationException extends Exception {

    public PagesSpecificationException(String message, Throwable cause, String wrongValue) {
        super(message, cause);
        System.out.println("Wrong value: " + wrongValue);
    }
}
