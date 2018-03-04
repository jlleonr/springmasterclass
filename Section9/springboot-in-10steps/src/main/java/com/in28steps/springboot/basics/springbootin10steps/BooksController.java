package com.in28steps.springboot.basics.springbootin10steps;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

		@GetMapping(path="/books", produces = "application/json")
		public List<Book> getAllBooks() {			
			return Arrays.asList(new Book(1l, "The Lord of the Rings", "Tolkien"),
								new Book(2l, "100 Años de Soledad", "Márquez"));
		}
		
		@GetMapping(path="/book", produces = "application/json")
		public Book getBook() {
			return new Book(2, "Title", "JLLR");
		}
}
