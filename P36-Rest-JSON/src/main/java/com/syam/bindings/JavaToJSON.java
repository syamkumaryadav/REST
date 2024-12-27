package com.syam.bindings;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJSON {

	public static void main(String[] args) throws Exception {
		
		Author author = new Author();
		author.setAuthorName("A");
		author.setEmail("abc");
		author.setPhNo(123);
		
		Book book = new Book();
		book.setId(1);
		book.setName("A");
		book.setPrice(10.0);
		book.setAuthor(author);

		

		ObjectMapper mapper = new ObjectMapper();
		// converting java obj to json and store into a file
		mapper.writeValue(new File("book.json"), book);

		System.out.println("Conversion Completed....");
	}

}
