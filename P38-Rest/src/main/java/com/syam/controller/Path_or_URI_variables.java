package com.syam.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Path_or_URI_variables {

	//@GetMapping("/uri/name") 		// http://localhost:8080/syam

	@GetMapping("/uri/nothing/{name}") 		// http://localhost:8080/nothing/syam
	public ResponseEntity<String> oneValue(@PathVariable("name") String name) {
		String text =name+ " this is ur first rest URI variables code.............. ";
		return new ResponseEntity<String>(text, HttpStatus.OK);
	}

	@GetMapping("/uri/v1/{one}/v2/{two}") 		// localhost:8080/uri/v1/syam/v2/hai
	public ResponseEntity<String> moreValues(@PathVariable("one") String one, @PathVariable("two") String two) {
		String msg = one + " this is ur first rest URI variables code.............. " + two;
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
}
