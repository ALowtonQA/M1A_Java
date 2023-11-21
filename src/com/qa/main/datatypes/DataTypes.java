package com.qa.main.datatypes;

public class DataTypes {

	public static void main(String[] args) {
		
		// Primitive version of short (no methods, just value)
//		short age = 30;
		
		// Object version of short (comes with useful methods)
		Short age = 30;
		
		String ageString = "30";
		
		int convertedAge = Integer.parseInt(ageString);
		
		System.out.println(convertedAge + 1);		
	}
}
