package com.qa.main.inheritance;

public class Dog extends Animal {

	private boolean isWaggingTail;

	public Dog(String name, int age, int numOfLegs, boolean isWaggingTail) {
		 // calls the parent constructor
		// So that we can set the inherited properties
		super(name, age, numOfLegs);
		
		this.isWaggingTail = isWaggingTail;
	}

	public void bark() {
		System.out.println("woof");
	}

	public boolean isWaggingTail() {
		return isWaggingTail;
	}

	public void setWaggingTail(boolean isWaggingTail) {
		this.isWaggingTail = isWaggingTail;
	}
}
