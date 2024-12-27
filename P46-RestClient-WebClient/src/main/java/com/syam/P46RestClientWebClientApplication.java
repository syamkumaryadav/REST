package com.syam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.syam.service.MyBookService;

@SpringBootApplication
public class P46RestClientWebClientApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(P46RestClientWebClientApplication.class, args);
	
		MyBookService bean = context.getBean(MyBookService.class);
		
		bean.invokeSaveBook();
	
	}

}
