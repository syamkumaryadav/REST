package com.syam.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.syam.binding.Book;

@RestController

public class MyController {

	@GetMapping("/book")

	public ResponseEntity<List<Book>> getBook() {
		Book book = new Book(1, "A", 12, "aa");
		Book book1 = new Book(1, "A", 12, "aa");
		Book book2 = new Book(1, "A", 12, "aa");
		Book book3 = new Book(1, "A", 12, "aa");
		Book book4 = new Book(1, "A", 12, "aa");
		List<Book> l = Arrays.asList(book,book1,book2,book3,book4);

		return new ResponseEntity<>(l, HttpStatus.OK);

	}
}
