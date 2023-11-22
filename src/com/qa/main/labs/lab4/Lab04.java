package com.qa.main.labs.lab4;

import java.util.Scanner;

public class Lab04 {

	public void part1() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the price of a bag:");
		int bagPrice = scanner.nextInt();
		
		System.out.println("How much money do you have?");
		int money = scanner.nextInt();
		
		if (bagPrice <= 0 || money <= 0) {
			System.out.println("invalid value");
			return;
		}
		
		int numOfBags = money/bagPrice;
		
		
		System.out.printf("If the price is %dp and you have %dp then you will be able to buy %d bags\n", bagPrice, money, numOfBags);
		
	}
	
	public static void main(String[] args) {
		
		Lab04 lab4 = new Lab04();
		lab4.part1();
		
	}
	
}
