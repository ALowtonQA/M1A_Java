package com.qa.main.methods;

public class Runner {

	// Entry point for execution of the program
	public static void main(String[] args) {
		
		int age = 30;
		String name = "anoush";
		
//      DataType varName = object construction
		Calculator calc = new Calculator();
		int result = calc.add(5, 10);
		System.out.println("Result = " + result);
			
	}
}
