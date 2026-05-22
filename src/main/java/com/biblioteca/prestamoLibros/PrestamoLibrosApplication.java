package com.biblioteca.prestamoLibros;

import com.biblioteca.prestamoLibros.domain.Book;
import com.biblioteca.prestamoLibros.domain.Loan;
import com.biblioteca.prestamoLibros.repository.BookRepository;
import com.biblioteca.prestamoLibros.repository.LoanRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.Month;

@SpringBootApplication
public class PrestamoLibrosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrestamoLibrosApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(
			BookRepository bookRepository,
			LoanRepository loanRepository
	){
		return args -> {
			Book book1 = bookRepository.save(new Book(null,"Algebra 1","Matemáticas",7));
			Loan loan1 = loanRepository.save(new Loan(null,1346587, "2026-04-01","2026-04-15",true,book1));

			//Mostramos la infomración en la consola
			System.out.println("=============BIBLIOTECA======================");
			System.out.println("Lista de libros=============");
			System.out.println("Nombre del libro: "+ book1.getTitle());
			System.out.println("Area de conocimiento: " + book1.getArea());
			System.out.println("Numero de ejemplares disponibles: " + book1.getNumberAvailable());

			System.out.println("Lista de prestamos===========");
			System.out.println("ISBN del libro: " + loan1.getBook().getId());
			System.out.println("Identificacion del usuario: "+ loan1.getIdentUser());
			System.out.println("Fecha del préstamo: " + loan1.getLoanInitialDate());
			System.out.println("Fecha de vencimiento: " + loan1.getLoanFinalDate());
			System.out.println("Estado: " + loan1.getState());
		};
	}

}
