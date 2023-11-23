package com.qa.main.loops;

public class Loops {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5};

		numbers[1] = 22;
				
		System.out.println(numbers[1]);
		
		int[] numbers2 = new int[5]; // [0, 0, 0, 0, 0] - because it fills with default values
		
		
		
		boolean flag = false;
		
		while (flag == true) {
			System.out.println("We don't see this :(");
		}
		
		// do while loops ALWAYS run at LEAST once.
		do {
			System.out.println("We see this once!");
		} while (flag == true);
		
		
		
		int i = 0;
		
		while (i < 10) {
			System.out.println(i); // last i value printed is 9
			i++; // i = i + 1 AKA i += 1
		}
		
		System.out.println("This is outside the loop " + i); // i = 10
		
		
		// While loop example
		int j = 0;
		while(j < numbers.length) {
			System.out.println(numbers[j]); // how many times?
			j++; // j += 1 or j = j + 1
		}

		int[] numbers3 = {10,20,30,40,50};
		
		// For loop example
//      for (init val ;    condition   ; increment
		for (int k = 0; k < numbers3.length; k++) {
			
			System.out.println(numbers3[k]); // how many times?
			
		}

		// How many times does this loop run? // 3!
		for (int k = 0; k < 3; k++) {
			
			// How many times does this loop run? 5 times, 3 times = 15
			for (int y = 0; y < 5; y++) {
				System.out.printf("k = %d | y = %d\n", k, y);
			}
			
			// How many times does this line run? 3
			System.out.println("---------------------------------------------------------");
		}
		

		// this loop runs 5 times
		for (int k = 0; k < 5; k++) {

			if (k == 2) {
				continue;
			} else if (k == 3) {
				break;
			}
			
			System.out.println("k = " + k);
		}
		

//      Python for loop:
//		for num in numbers:
//			print(num)
		
		int[] numbers4 = {10,20,30,40,50};
		
//	    Enhanced for loop example
		for(int num : numbers4) {
			System.out.println(num); // how many times? 5
		}

		
// Enhanced for loops use read-only values, cannot be used to change underlying array data 
		String[] names = {"Bob","Sasha"};
		
		for (String name : names) {
			name = name + "x";
		}
		
		System.out.println(names[0]);
		
		
		// If you want to target and change the underlying array data when looping, use a normal loop:
		for (int k = 0; k < names.length; k++) {
			names[k] = names[k] + "x";
		}
		
		System.out.println(names[0]);
	}
}
