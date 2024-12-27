package com.syam.person;

public class ConvertJavaToXml {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.setId(1);
		person.setName("Abc");
		person.setAge(21);
		person.setPhno(1l);
		
		Address address = new Address();
		address.setCity("A");
		address.setState("Aa");
		address.setCountry("Aaa");
		
		//JAXBContext instance = JAXBContext.newInstance(Person.class); 
		

	}

}
