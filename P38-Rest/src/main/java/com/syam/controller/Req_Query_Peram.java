package com.syam.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Req_Query_Peram {

	// getting ( Read ) value in class ---> @RequestParam ("name")
	
	@GetMapping("/reqquery") // passing value in url ---->@QueryParam localhost:8080/reqquery?name=syam&age=as
								// {in postman}		
							//localhost:8080/reqquery?name=syam&age=as
	public ResponseEntity<String> ReqQuery(@RequestParam("name") String name, @RequestParam("age") String age) {
		String msg = name + " My First Rest .................... Age : " + age;
		ResponseEntity<String> responseEntity = new ResponseEntity<>(msg, HttpStatus.OK);
		return responseEntity;
	}

}
