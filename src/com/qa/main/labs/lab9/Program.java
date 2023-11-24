package com.qa.main.labs.lab9;

public class Program {

	public static void main(String[] args) {

		Map map = new Map(500, 400);

		Token t1 = new Token(5, 5, map);
		Token t2 = new Token(100, 100, map);
		Token t3 = new Token(250, 250, map);

		System.out.printf("Token 1: x=%d y=%d\n", t1.getX(),t1.getY());
		System.out.printf("Token 2: x=%d y=%d\n", t2.getX(),t2.getY());
		System.out.printf("Token 3: x=%d y=%d\n", t3.getX(),t3.getY());

		System.out.println("-----------------------------------------");
		
		if (t1.move("east", 200)) {
			System.out.printf("Token 1: x=%d y=%d\n", t1.getX(),t1.getY());
		} else {
			t1 = null;
		}
		
		if (t2.move("W", 50)) {
			System.out.printf("Token 2: x=%d y=%d\n", t2.getX(),t2.getY());
		} else {
			t2 = null;
		}
		
		if (t3.move("NORTH", 300)) {
			System.out.printf("Token 3: x=%d y=%d\n", t3.getX(),t3.getY());
		} else {
			t3 = null;
		}
	}
}
