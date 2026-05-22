package com.biblioteca.prestamoLibros.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="loan")
@Entity
public class Loan {

    @Id
    @SequenceGenerator(
            name="loan_sequence",
            sequenceName="loan_sequence",
            allocationSize = 1,
            initialValue=777
    )//Una vez creada la secuencia se la asignamos al id con GeneratedValue
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "loan_sequence"
    )
    private Integer id;

    @Column(name="ident_user")
    private Integer identUser;

    @Column(name="loanInitialDate")
    private String loanInitialDate;

    @Column(name="loanFinalDate")
    private String loanFinalDate;

    @Column(name="state")
    private Boolean state;

    @OneToOne
    private Book book;
}
