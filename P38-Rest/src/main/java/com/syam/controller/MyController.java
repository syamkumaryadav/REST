package com.syam.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
								
	@GetMapping("/greet")		
	public ResponseEntity<String> greetMsg(){
		String msg=" My First Rest ....................  ";
		ResponseEntity<String> responseEntity = new ResponseEntity<>(msg,HttpStatus.OK);
		return responseEntity;
	}

	@GetMapping("/second")
	public String Approach2() {
		String text="Second Approach............";
		return text;
	}
	
}
