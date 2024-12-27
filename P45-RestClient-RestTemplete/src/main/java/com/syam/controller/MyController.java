package com.syam.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/")
	public ResponseEntity<String> welcome(){
		String msg="This my first SWAGGER and REST Client Project";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}

}
