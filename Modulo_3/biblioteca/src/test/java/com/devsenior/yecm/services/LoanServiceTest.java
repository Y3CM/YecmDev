package com.devsenior.yecm.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.devsenior.yecm.exception.NotFoundException;
import com.devsenior.yecm.model.Book;
import com.devsenior.yecm.model.LoanState;
import com.devsenior.yecm.model.User;

public class LoanServiceTest {
    private UserServices userServices;
    private BookServices bookServices;
    private LoanService loanService;
    @BeforeEach
    public void setup() {
        this.bookServices = Mockito.mock(BookServices.class);
        this.userServices = Mockito.mock(UserServices.class);
        this.loanService = new LoanService(bookServices, userServices);
    }
    @Test
    void testAddloanWithExistingBookAndUser() throws NotFoundException {
        // GIVEN
        var id = "1235";
        var isbn = "12345";
        var mockUser = new User(id, "Yecm", "Yecm@gmail.com");
        var mockBook = new Book("Libro", "Yecm", isbn);
        Mockito.when(userServices.getUserById(id)).thenReturn(mockUser);    
        Mockito.when(bookServices.getBookIsbn(isbn)).thenReturn(mockBook);
        // WHEN
        loanService.addloan(id, isbn);
        // THEN
        var loans = loanService.getLoans();
        assertEquals(1, loans.size()); 
        var loan = loans.get(0);
        assertNotNull(loan.getUser());
        assertEquals(LoanState.STARTED, loan.getState());
        assertNotNull(loan.getBook());
    }

   @Test
void testReturnBookMovesLoanToFinished() throws NotFoundException {
    // GIVEN
    var id = "1234";
    var isbn = "5678";
    var user = new User(id, "Yecm", "email");
    var book = new Book("Título", "Autor", isbn);
    when(userServices.getUserById(id)).thenReturn(user);
    when(bookServices.getBookIsbn(isbn)).thenReturn(book);

    loanService.addloan(id, isbn);
    assertEquals(1, loanService.getLoans().size());

    // WHEN
    loanService.returnBook(id, isbn);

    // THEN
    assertEquals(0, loanService.getLoans().size()); // ya no está en préstamos activos
    assertEquals(1, loanService.getFinishedLoans().size()); // está en terminados
    assertEquals(LoanState.FINISHED, loanService.getFinishedLoans().get(0).getState());
}

}
