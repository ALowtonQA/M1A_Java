package com.qa.main.inheritance;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		
		String name = "Anoush";
		
		int age = 30;
	
		int[] ages = {10, 20, 30, 40};
	
		ArrayList<String> names = new ArrayList<>();
		names.add("Anoush");
		names.add("Matt");
		names.add("Andrew");
		names.add("Tia");
		
		Dog bob = new Dog("Bob", 16, 4, true);
		
		Horse sam = new Horse("Sam", 5, 4, 50);
		
		Animal[] animalCollection = {bob, sam};
		
		ArrayList<Animal> animals = new ArrayList<>();
		animals.add(sam);
		animals.add(bob);
		
		for (Animal animal : animals) {
			String aName = animal.getName();
			System.out.println(aName);
		}
		
		
		findBob(bob, sam);
	}

	public static Animal findBob(Animal a, Animal b) {
		if (a.getName().equals("bob")) {
			return a;
		} else {
			return b;
		}
	}
}
