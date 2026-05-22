package com.biblioteca.prestamoLibros.service;

import com.biblioteca.prestamoLibros.domain.Book;

import java.util.Optional;

public interface BookService {

    Optional<Book> findById(Integer id);

    Iterable<Book> findAll();

    Book save(Book book);

    void deleteById(Integer id);
}
