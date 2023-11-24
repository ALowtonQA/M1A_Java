package com.qa.main.inheritance;

public class Horse extends Animal{
	
	private int maneLength;

	public Horse(String name, int age, int numOfLegs, int maneLength) {
		super(name, age, numOfLegs); // Parent constructor
		this.maneLength = maneLength;
	}
	
	public int getManeLength() {
		return maneLength;
	}

	public void setManeLength(int maneLength) {
		this.maneLength = maneLength;
	}
}
