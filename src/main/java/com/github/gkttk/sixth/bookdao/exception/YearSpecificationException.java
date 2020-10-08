package com.github.gkttk.sixth.bookdao.exception;

public class YearSpecificationException extends Exception {

    public YearSpecificationException(String message, Throwable cause, String wrongValue) {
        super(message, cause);
        System.out.println("Wrong value: " + wrongValue);
    }
}
