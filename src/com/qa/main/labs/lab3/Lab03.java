package com.qa.main.labs.lab3;

import java.util.Scanner;

public class Lab03 {
	
    public static void main(String[] args){
  
        int intResult = getInt("Please enter a number: ");

        String strResult = getString("Please enter a string: ");

        System.out.println("Number is: " + intResult);
        System.out.println("String is: " + strResult);
        
        // part 2
        TheLunchQueue();
        
        // part 3
        int lbs = getInt("Please enter a number of lbs to convert: ");
        convertLbsToStonesPounds(lbs);
        
        int kgs = getInt("Please enter a number of kgs to convert: ");
        convertKgsToStonesPounds(kgs);
    }

    public static int getInt(String prompt){
    	Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        int result = scanner.nextInt();
        return result; 
    }
    
    public static String getString(String prompt){
    	Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        
        // clear the scanner
        scanner.nextLine();
        
        String result = scanner.nextLine();
        return result;
    }
    
    // Part 2
    public static void TheLunchQueue() {
    	String mainCourse = getString("What main dish would you like(Fish, Burgers or veg) ?");
    	int potatoes = getInt("How many roast potatoes would you like?");
    	int sprouts = getInt("How many brussel sprouts would you like?");
    	
    	System.out.println("Your lunch is " + mainCourse + " with " + potatoes + " Potatoes and " + sprouts + " brussel sprouts");
    }
    
    // Part 3
    public static void convertLbsToStonesPounds(int lbs) {
    	int stone = lbs / 14;
    	int remainingLbs = lbs % 14;
    	
    	if (remainingLbs != 0) {
    		System.out.println(stone + " stone and " + remainingLbs + " lbs");    		
    	} else {
    		System.out.println(stone + " stone");
    	}
    }
    
    public static void convertKgsToStonesPounds(int kgs) {
    	double kgsToLbs = kgs * 2.20462;
    	convertLbsToStonesPounds((int)kgsToLbs);
    }
}
