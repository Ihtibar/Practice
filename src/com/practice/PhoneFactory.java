package com.practice;

public class PhoneFactory {
	public static void main(String[] args) {
		
	
	Phones phone1 = new Phones("QWE1990",1800);
	
	Phones phone2 = new Phones("QWE 2018",2800,"apple");
	System.out.println(phone1.getModel() + phone1.getPrice());
	
	}
}
