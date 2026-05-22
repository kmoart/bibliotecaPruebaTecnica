package com.biblioteca.prestamoLibros.service;

import com.biblioteca.prestamoLibros.domain.Book;
import com.biblioteca.prestamoLibros.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Optional<Book> findById(Integer id) {
        return this.bookRepository.findById(id);
    }

    @Override
    public Iterable<Book> findAll() {
        return this.bookRepository.findAll();
    }

    @Override
    public Book save(Book book) {
        return this.bookRepository.save(book);
    }

    @Override
    public void deleteById(Integer id) {
        this.bookRepository.deleteById(id);
    }
}
