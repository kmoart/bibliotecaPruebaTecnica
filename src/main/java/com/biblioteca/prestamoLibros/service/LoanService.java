package com.biblioteca.prestamoLibros.service;

import com.biblioteca.prestamoLibros.domain.Book;
import com.biblioteca.prestamoLibros.domain.Loan;

import java.util.Optional;

public interface LoanService {

    Optional<Loan> findById(Integer id);

    Iterable<Loan> findAll();

    Loan save(Loan book);

    void deleteById(Integer id);
}
