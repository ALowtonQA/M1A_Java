package com.qa.main.inheritance;

public class Horse extends Animal{
	
	private int maneLength;

	public Horse(String name, int age, int numOfLegs, int maneLength) {
		// calls the parent constructor
		// So that we can set the inherited properties
		super(name, age, numOfLegs);
		
		this.maneLength = maneLength;
	}

	public void neigh() {
		System.out.println("neighhhhh");
	}

	public int getManeLength() {
		return maneLength;
	}

	public void setManeLength(int maneLength) {
		this.maneLength = maneLength;
	}
}
