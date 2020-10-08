package com.github.gkttk.sixth.bookdao.model;

import com.github.gkttk.sixth.bookdao.model.enums.Genre;

import java.util.Objects;

public class Book {
    private final String title;
    private final Genre genre;
    private final String author;
    private final int year;
    private final int pages;

    public Book(String title, Genre genre, String author, int year, int pages) {
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.year = year;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return year == book.year &&
                pages == book.pages &&
                title.equals(book.title) &&
                genre == book.genre &&
                author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, genre, author, year, pages);
    }


    @Override
    public String toString() {
        return "Title: " + title + ", Genre: " + genre.name() +
                ", Author: " + author +
                ", Year: " + year +
                ", Pages: " + pages;
    }
}
