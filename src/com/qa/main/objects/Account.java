package com.qa.main.objects;

public class Account {

	private String owner;
	private double balance;
	
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
		// could have some security or checks HERE.
		this.balance = balance;
	}
}
