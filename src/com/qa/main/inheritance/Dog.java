package com.qa.main.inheritance;

public class Dog extends Animal {

	private boolean isWaggingTail;

	public Dog(String name, int age, int numOfLegs, boolean isWaggingTail) {
		super(name, age, numOfLegs); // Parent constructor 
		this.isWaggingTail = isWaggingTail;
	}

	public boolean isWaggingTail() {
		return isWaggingTail;
	}

	public void setWaggingTail(boolean isWaggingTail) {
		this.isWaggingTail = isWaggingTail;
	}
}
