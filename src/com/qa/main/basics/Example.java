package com.qa.main.basics;

public class Example {
	
	public static void main(String[] args) {
//		The comment syntax is double forward slash //
		/*
		 * This is a multiline comment
		 * Every line has an asterix on it
		 */
		
		System.out.println("hello"); 
		System.out.println("there");
		
		// Variable declaration (saying it exists)
		int age;
		
		// Variable initialisation (giving it a value)
		age = 30;
		
		// Reassignment
		age = 40;
		
		// Variable declaration AND initialisation
		int shoeSize = 11;
		
		// long way
//		int i = 0;
//		int j;
		
		// short way
		int i = 0, j;
		
		System.out.println(i);
//		System.out.println(j); // can't reference unitialised variables!
		
		
	}
}