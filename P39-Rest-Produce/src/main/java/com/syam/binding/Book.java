package com.syam.binding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@XmlRoolElememt
public class Book {
	
	private Integer id;
	
	private String name;
	
	private long no;
	
	private String address;
}
