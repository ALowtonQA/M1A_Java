package com.qa.main.labs.lab8;

public class Program {

	public static void main(String[] args) {

		// Part 1 - Creating and using reference types
		Account myAccount = new Account(1, "Anoush", 100);

		myAccount.deposit(500.00);

		myAccount.withdraw(100.00);
		
		myAccount.getDetails();
		
		myAccount.addInterest();
		
		myAccount.getDetails();

		Account partnerAccount = myAccount; // new variable contains myAccount reference

		partnerAccount.addInterest();

		myAccount.getDetails(); // details changed on myAccount too, because its the same reference

		processAccount(myAccount); 

		myAccount.getDetails();

		int k = 100;

		incInt(k);

		System.out.println(k); // k is the same, because primitives pass by value only

	}

	public static void processAccount(Account acc) {
		acc.addInterest();
	}

	public static void incInt(int x) {
		x++;
	}
}
