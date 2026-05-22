package com.biblioteca.prestamoLibros.service;

import com.biblioteca.prestamoLibros.domain.Loan;
import com.biblioteca.prestamoLibros.repository.LoanRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoanServiceImpl implements LoanService{

    private final LoanRepository loanRepository;


    public LoanServiceImpl(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }


    @Override
    public Optional<Loan> findById(Integer id) {
        return this.loanRepository.findById(id);
    }

    @Override
    public Iterable<Loan> findAll() {
        return this.loanRepository.findAll();
    }

    @Override
    public Loan save(Loan book) {
        return this.loanRepository.save(book);
    }

    @Override
    public void deleteById(Integer id) {
        this.loanRepository.deleteById(id);
    }
}
