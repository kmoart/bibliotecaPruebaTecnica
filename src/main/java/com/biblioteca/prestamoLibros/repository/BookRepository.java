package com.biblioteca.prestamoLibros.repository;

import com.biblioteca.prestamoLibros.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Integer> {
}
