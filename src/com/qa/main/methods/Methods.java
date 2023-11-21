package com.qa.main.methods;

import java.util.Scanner;

public class Methods {

	// No return (so the return type is void)
	public static void sayHello(String name) {
		System.out.println("Hello there " + name);
	}
	
	// Return type of this method is int
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		
		// This method is defined above
		// It doesn't return anything
		sayHello("Anoush");
		sayHello("Jaspal");
		sayHello("Abbey");
	
		// This method does return something
		// It returns an int
		// So we can store the result when we call it for use later
		int result1 = add(40, 50);
		int result2 = add(60, 50);
		System.out.println(result1);
		System.out.println(result2);
		
		// You don't have to store return values, you can use them immediately, like below:
		System.out.println(add(5, 50));
		
		// Scanner demo
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter an age:");
		// This will only read the first int it finds in the scanner
		// It will leave behind anything it didn't read (This includes the newline character \n"
		int age = scanner.nextInt();
		System.out.println("Your age is " + age);
		System.out.println("Please enter your name: ");
		
		// Clear the scanner - to clear newline character left behind from nextInt() above
		scanner.nextLine();
		String name = scanner.nextLine();
		System.out.println("Your name is " + name);
		
		int myAge = 30;
		String myName = "Anoush";
		
		String formattedString = String.format("Your name is %s and you are %d years old\n", myName, myAge);
		
		System.out.println(formattedString);
		
		System.out.printf("Your name is %s and you are %d years old\n", myName, myAge);
		
		// right justified width
		System.out.printf("%8d\n", myAge);
		
		// right justified width using 0's
		System.out.printf("%08d\n", myAge);
		
		// right justified positive
		System.out.printf("%+8d\n", myAge);
		
		int number = 123456;
		// thousand separator
		System.out.printf("%,8d", number);

	}
}