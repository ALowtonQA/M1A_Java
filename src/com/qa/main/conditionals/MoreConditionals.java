package com.qa.main.conditionals;

import java.util.Scanner;

public class MoreConditionals {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a salary");
		int salary = scanner.nextInt();
		
		double rate = (salary < 21000) ? 0.2 : 0.4;
		
//		Long form (same as above):
//		if (salary < 21000) {
//			rate = 0.2;
//		} else {
//			rate = 0.4;
//		}
		
		System.out.printf("The rate for your salary is %.1f", rate);
		
		if (salary >= 10000 && salary <= 40000) {
			System.out.println("Salary is between 10000 and 40000 (inclusive)");
		}
		
		int var1 = 1, var2 = 2, var3 = 3;
		
		if ((var1 == 1) || (var2 == 2) && (var3 == 1)) {
			System.out.println("Will we see this?");
		}
		
		
		String name = "Anoush";
		
		boolean result = name.endsWith("ed"); // does name end with "ed"? True/false
		
		if (result == false) {
			System.out.println("Name doesn't end with 'ed' ");
		}
		
//		The above is the same as:
//		if (!result) {
//			System.out.println("Name doesn't end with 'ed' ");
//		}
		
		int x = 9, y = 4;
		
		System.out.println( x > y + 4);
		System.out.println( x > y++ * 2);
		System.out.println( x * y <= 36);
		System.out.println( x / y == 1);
		System.out.println( x % y);
		System.out.println( (x > y)? "Worm" : "Words");

	}
}
