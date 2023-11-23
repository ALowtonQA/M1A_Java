package com.qa.main.objects;

public class Car {

	// Properties
	private String make;
	private int speed;

	public Car(String make, int speed) {
		this.make = make;
		this.speed = speed;
	}
	
	public Car(String make) {
		this.make = make;
		this.speed = 10;
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
