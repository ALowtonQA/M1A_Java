package com.qa.main.labs.lab8;

public class Account {

	private int id;
	private String owner;
	private double balance;

	public Account(int id, String owner, double balance) {
		this.id = id;
		this.owner = owner;
		this.balance = balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
		} else {
			System.out.println("Deposit must be greater than 0");
		}
	}

	public void withdraw(double amount) {
		if (this.balance >= amount) {
			this.balance -= amount;
		} else {
			System.out.println("Not enough money. Your balance is: " + balance);
		}
	}

	public void getDetails() {
		System.out.printf("ID: %d\nOwner: %s\nBalance: £%.2f\n", id, owner, balance);
	}

	public void addInterest() {
		this.balance += this.balance * 0.025;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
