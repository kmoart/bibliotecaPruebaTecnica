package com.biblioteca.prestamoLibros.repository;

import com.biblioteca.prestamoLibros.domain.Loan;
import org.springframework.data.repository.CrudRepository;

public interface LoanRepository extends CrudRepository<Loan,Integer> {
}
