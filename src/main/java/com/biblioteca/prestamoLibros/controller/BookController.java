package com.biblioteca.prestamoLibros.controller;

import com.biblioteca.prestamoLibros.domain.Book;
import com.biblioteca.prestamoLibros.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/v1/books")
public class BookController {

    private final BookService bookService;


    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Book>> findById(@PathVariable Integer id){
        return ResponseEntity.ok(this.bookService.findById(id));
    }

    @GetMapping
    public ResponseEntity<Iterable<Book>> findAll(){
        return ResponseEntity.ok(this.bookService.findAll());
    }

    @PostMapping
    public ResponseEntity<Book> save(@RequestBody Book book){
        return new ResponseEntity<>(
                this.bookService.save(book), HttpStatus.CREATED
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Book> deleteById(@PathVariable Integer id){
        this.bookService.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
