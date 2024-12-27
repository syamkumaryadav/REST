package com.syam.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.syam.binding.Book;

@Service
public class MyBookService {

	public void invokeSaveBook() {

		Book book = new Book();
		book.setBookName("React");
		book.setPrice(650.00);

		String apiUrl = "here give the link of our deployed project link......";

		WebClient client = WebClient.create();

		String resp = client.post() // HTTP POST Request
				.uri(apiUrl) // Endpoint URL
				.bodyValue(book) // HTTP Request Body Data
				.retrieve() // Retrieve HTTP Response Body
				.bodyToMono(String.class) // Bind Response to string var
				.block(); // Make it as Sync client

		System.out.println(resp);
	}

	public void invokeGetBooksAsync() {
		String apiUrl = "https://ashokit-bookapp.herokuapp.com/books";
		WebClient client = WebClient.create();
									 client.get()
									 .uri(apiUrl)
									 .retrieve()
									 .bodyToMono(Book[].class);
							// .subscribe(BookClient::respHandler); // Async Communication
		System.out.println("**************Request Sent***********");
	}

	public static void respHandler(Book[] books) {
		for (Book b : books) {
			System.out.println(b);
		}
	}

	/*public void invokeBookTicket() {
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
	}*/

}
