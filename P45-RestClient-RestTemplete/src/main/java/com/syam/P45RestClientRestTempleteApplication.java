package com.syam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class P45RestClientRestTempleteApplication {

	public static void main(String[] args) {
		SpringApplication.run(P45RestClientRestTempleteApplication.class, args);
		
		String str="here give the link of our deployed project link......";
		
		
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> forEntity = restTemplate.getForEntity(str,String.class);
		String body = forEntity.getBody();
		System.out.println(body);
	}

}
