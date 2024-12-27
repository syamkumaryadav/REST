package com.syam.person;

import lombok.Data;

@Data
//@XmlRootElement
public class Person {
	
	private Integer id; 
	 private String name; 
	 private Integer age; 
	 private Long phno; 
	 private Address address; 

}
