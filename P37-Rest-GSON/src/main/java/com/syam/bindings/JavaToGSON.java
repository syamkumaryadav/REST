package com.syam.bindings;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class JavaToGSON {

	public static void main(String[] args) throws JsonSyntaxException, JsonIOException, FileNotFoundException {
		Author author = new Author();
		author.setAuthorName("A");
		author.setEmail("abc");
		author.setPhNo(123);
		
		Book book = new Book();
		book.setId(1);
		book.setName("A");
		book.setPrice(10.0);
		book.setAuthor(author);
		
		Gson gson = new Gson();
		String json = gson.toJson(book);	//----->to JSON format
		System.out.println(json);
		
		
		Book fromJson = gson.fromJson(new FileReader(new File("Book.json")), Book.class);	//----->to java format
		System.out.println(fromJson);
	}

}
