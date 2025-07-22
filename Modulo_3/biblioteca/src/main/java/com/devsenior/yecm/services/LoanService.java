package com.devsenior.yecm.services;

import java.util.ArrayList;
import java.util.List;

import com.devsenior.yecm.exception.NotFoundException;
import com.devsenior.yecm.model.Loan;
import com.devsenior.yecm.model.LoanState;

public class LoanService {

    private List<Loan> finishedLoans;
private List<Loan> loans;
private BookServices bookServices;
private UserServices userServices;


public LoanService(BookServices bookServices, UserServices userServices) {
    this.bookServices = bookServices;
    this.userServices = userServices;
    loans = new ArrayList<>();
    finishedLoans = new ArrayList<>();
}

public void  addloan(String id, String isbn) throws NotFoundException{
 var user = userServices.getUserById(id);
 var book = bookServices.getBookIsbn(isbn);
 loans.add(new Loan(user, book));
}

public void returnBook(String id, String isbn) throws NotFoundException {
    var user = userServices.getUserById(id);
    var book = bookServices.getBookIsbn(isbn);

    Loan loanToReturn = null;

    for (Loan loan : loans) {
        if (loan.getUser().equals(user) &&
                loan.getBook().equals(book) &&
                loan.getState().equals(LoanState.STARTED)) {

            loan.setState(LoanState.FINISHED); // actualizamos el estado
            loanToReturn = loan; // lo guardamos para removerlo después
            break;
        }
    }

    if (loanToReturn != null) {
        loans.remove(loanToReturn); // fuera del for-each: seguro
        finishedLoans.add(loanToReturn); // lo movemos a la lista de finalizados
        return;
    }

    throw new NotFoundException("Préstamo no encontrado");
}

public List<Loan> getLoans() {
    return loans;
}

public BookServices getBookServices() {
    return bookServices;
}

public UserServices getUserServices() {
    return userServices;
}

public List<Loan> getFinishedLoans() {
    return finishedLoans;
}

}
