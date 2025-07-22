package com.devsenior.yecm.services;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.devsenior.yecm.exception.NotFoundException;

public class BookServicesTest {
    private BookServices bookServices;
    @BeforeEach
    public void setup() {
        bookServices = new BookServices();
    }
    @Test
    void testAddBok() throws NotFoundException {
        // Given - preparar los datos de entrada
         var isbn = "12345";
         var title = "Pruebas unitarias 1";
         var author = "Yecm";
        // When - ejecutar la operación
        bookServices.addBook(title, author, isbn);
        // Then - validar los resultados
        var book = bookServices.getBookIsbn(isbn);
        var expectedTitle = "Pruebas unitarias 1";
        var expectedAuthor = "Yecm";
        var expectedIsbn = "12345";
        assert book.getTitle().equals(expectedTitle);
        assert book.getAuthor().equals(expectedAuthor);
        assert book.getIsbn().equals(expectedIsbn);
    }

    @Test
    void testDeleteBook() throws NotFoundException {
        // GIVEN
        var isbn = "12345";
        var title = "Pruebas unitarias 1";
        var author = "Yecm";
        bookServices.addBook(title, author, isbn);
        // WHEN
        bookServices.deleteBook(isbn);
        // THEN
        assertThrows(NotFoundException.class, () -> bookServices.getBookIsbn(isbn));
    }

    @Test
    void testGetBookIsbn() throws NotFoundException {
        // GIVEN
        var isbn = "12345";
        var title = "Pruebas unitarias 1";
        var author = "Yecm";
        // WHEN
        bookServices.addBook(title, author, isbn);
        // THEN
        var book = bookServices.getBookIsbn(isbn);
        var expectedTitle = "Pruebas unitarias 1";
        var expectedAuthor = "Yecm";
        var expectedIsbn = "12345";
        assert book.getTitle().equals(expectedTitle);
        assert book.getAuthor().equals(expectedAuthor);
        assert book.getIsbn().equals(expectedIsbn);

        
    }

    @Test
    void testGetBooks() throws NotFoundException {
        // GIVEN
        var isbn1 = "12345";
        var title1 = "Pruebas unitarias 1";
        var author1 = "Yecm";
        var isbn2 = "12235";
        var title2 = "Pruebas unitarias 2";
        var author2 = "Jones";

        // WHEN
        bookServices.addBook(title1, author1, isbn1);
        bookServices.addBook(title2, author2, isbn2);
        // THEN
        var books = bookServices.getBooks();
        var book = bookServices.getBookIsbn(isbn2);
        assert books.size() == 2;
        assert book.getTitle().equals(title2);
        assert book.getAuthor().equals(author2);
        assert book.getIsbn().equals(isbn2);
        


    }
}
