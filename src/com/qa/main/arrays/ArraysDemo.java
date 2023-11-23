package com.qa.main.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
		int[] numbers = {5, 3, 6, 7, 1};
		
		Arrays.sort(numbers);
		
		for (int num : numbers) {
			System.out.println(num);
		}
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		
		int[] numbers2 = new int[5]; // 0,0,0,0,0
		
		for (int i = 0; i < numbers2.length; i++) {
			numbers2[i] = i * 10;
		}
		
		for (int num : numbers2) {
			System.out.println(num);
		}
		
		ArrayList<Integer> numbers3 = new ArrayList<>(); // any length
		
		numbers3.add(5);
		numbers3.add(10);
		numbers3.add(15);
		numbers3.add(25);
		numbers3.add(50);

		// Enhanced for loop
		for (int num : numbers3) {
			System.out.println(num);
		}
		
		for (int i = 0; i < numbers3.size(); i++) {
			System.out.println(numbers3.get(i));
		}
	}	
}
