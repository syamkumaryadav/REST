package com.syam.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.syam.binding.Book;

@Service
public class MyBookService {

	public void invokeBookTicket() {
		String apiUrl = "here give the link of our deployed project link......";

		Book book = new Book();
		book.setBookName("Java");
		book.setPrice(345.00);

		RestTemplate rt = new RestTemplate();

		ResponseEntity<String> postForEntity = rt.postForEntity(apiUrl, book, String.class);
		System.out.println(postForEntity.getBody());

	}

	
	
	//*******Sending GET Request and binding Response JSON to Binding OBJECT********
	public void invokeGetBooksNew() {
		String apiUrl = "here give the link of our deployed project link......";

		RestTemplate rt = new RestTemplate();
		ResponseEntity<Book[]> forEntity = rt.getForEntity(apiUrl, Book[].class);
		Book[] body = forEntity.getBody();
		for (Book book : body) {
			System.out.println(book);
		}
	}

}
