package com.syam.bindings;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONtoJava {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		Book value = objectMapper.readValue(new File("Book.json"), Book.class);
		System.out.println(value);
		System.out.println("converted............");
	}

}
