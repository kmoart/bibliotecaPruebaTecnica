package com.biblioteca.prestamoLibros.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="book")
public class Book {

    @Id
    @SequenceGenerator(
            name="book_sequence",
            sequenceName="book_sequence",
            allocationSize = 1,
            initialValue=111
    )//Una vez creada la secuencia se la asignamos al id con GeneratedValue
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "book_sequence"
    )
    private Integer id;

    @Column(name="title")
    private String title;

    @Column(name="area")
    private String area;

    @Column(name="available")
    private Integer numberAvailable;

}
