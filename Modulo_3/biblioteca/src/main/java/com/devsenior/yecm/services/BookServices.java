package com.devsenior.yecm.services;

import java.util.ArrayList;
import java.util.List;

import com.devsenior.yecm.exception.NotFoundException;
import com.devsenior.yecm.model.Book;

public class BookServices {
    private List<Book> books;

    public BookServices() {
        books = new ArrayList<>();
    }

    public void addBook(String title, String author, String isbn) {
        books.add(new Book(title, author, isbn));
    }

    public List<Book> getBooks() {
        return books;
    }

    public Book getBookIsbn(String isbn) throws NotFoundException {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        throw new NotFoundException("Libro con el isbn: " + isbn + " no encontrado");
    }

    public void deleteBook(String isbn) throws NotFoundException {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                books.remove(book);
                return;
            }
        }
        throw new NotFoundException("Libro con el isbn: " + isbn + " no encontrado");
    }
}
