package com.qa.main.objects;

public class Car {

	// Static property - count how many objects have been made.
	public static int count = 0;
	
	// Instance Properties
	private String make;
	private int speed;

	public Car(String make, int speed) {
		this.make = make;
		this.speed = speed;
		count++;
	}
	
	public Car(String make) {
		this.make = make;
		this.speed = 10;
		count++;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	// Methods (Functionality)
	public void start() {
		System.out.println("Car starting");
	}
	
	public void stop() {
		System.out.println("Stopping car!");
		speed = 0;
	}
	
	public void accelerate() {
		speed += 2;
	}
}
