package com.biblioteca.prestamoLibros.controller;

import com.biblioteca.prestamoLibros.domain.Book;
import com.biblioteca.prestamoLibros.domain.Loan;
import com.biblioteca.prestamoLibros.service.BookService;
import com.biblioteca.prestamoLibros.service.LoanService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/v1/loans")
public class LoanController {

    private final LoanService loanService;

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Loan>> findById(@PathVariable Integer id){
        return ResponseEntity.ok(this.loanService.findById(id));
    }

    @GetMapping
    public ResponseEntity<Iterable<Loan>> findAll(){
        return ResponseEntity.ok(this.loanService.findAll());
    }

    @PostMapping
    public ResponseEntity<Loan> save(@RequestBody Loan loan){
        return new ResponseEntity<>(
                this.loanService.save(loan), HttpStatus.CREATED
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Loan> deleteById(@PathVariable Integer id){
        this.loanService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
