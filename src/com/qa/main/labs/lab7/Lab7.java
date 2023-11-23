package com.qa.main.labs.lab7;

public class Lab7 {

	public void start() {
		int[] numbers = { 1, 3, -5, 7, 0, 4, 6, 8 };  
		
		int sum = sum(numbers);
		System.out.println("The sum is: " + sum);
		
		int average = average(numbers);
		System.out.println("The average is: " + average);
		
		int min = min(numbers);
		System.out.println("The min is: " + min);
		
		int max = max(numbers);
		System.out.println("The max is: " + max);
		
		int targetVal = 4;
		int index = indexOf(numbers, targetVal);
		System.out.printf("The index of %d is: %d\n", targetVal, index);
		
		sort(numbers);
		
		for (int i : numbers) {
			System.out.println(i);
		}
		
	}
	
	public int sum(int[] inputArray) {
		int sum = 0;
		
		for (int num : inputArray) {
			sum += num;
		}
		
		return sum;
	}
	
	public int average(int[] inputArray) {
		return sum(inputArray) / inputArray.length;
	}
	
	public int min(int[] inputArray) {
		int min = inputArray[0];
		
		for (int num : inputArray) {
            if (num < min) {
                min = num;
            }
        }
		
		return min;
	}
	
	public int max(int[] inputArray) {
		int max = inputArray[0];
		
		for (int num : inputArray) {
			if (num > max) {
				max = num;
			}
		}
		
		return max;
	}
	
	public int indexOf(int[] inputArray, int target) {
		int index = -1;
		
		for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == target) {
                index = i;
                break; // Exit the loop once the target value is found
            }
        }
		
		return index;
	}
	
	public void sort(int[] inputArray) {
		int len = inputArray.length;
		
		for (int i = 0; i < len - 1; i++) {
			
			for (int j = 0; j < len - i - 1; j++) {
				
				if (inputArray[j] > inputArray[j + 1]) {
					int temp = inputArray[j];
					inputArray[j] = inputArray[j + 1];
					inputArray[j + 1] = temp;
				}
				
			}
			
		}
	}
}
