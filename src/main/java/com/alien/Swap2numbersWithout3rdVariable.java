package com.alien;

// How would you swap two numbers without using a third variable?

public class Swap2numbersWithout3rdVariable {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		System.out.println("Before swapping :" + " a = " + a + ", b = " + b);
		System.out.println("===================================================");
		solution1(a, b);
		solution2(a, b);
		solution3(a, b);
		solution4(a, b);

	}

	private static void solution1(int a, int b) {
		a = a + b; // 30
		b = a - b; // 10
		a = a - b; // 20

		System.out.println("After swapping solution 1:" + " a = " + a + ", b = " + b);

	}

	private static void solution2(int a, int b) {
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		System.out.println("After swapping solution 2:" + " a = " + a + ", b = " + b);
	}

	private static void solution3(int a, int b) {
		a = a * b;
		b = a / b;
		a = a / b;

		System.out.println("After swapping solution 3:" + " a = " + a + ", b = " + b);
	}

	private static void solution4(int a, int b) {
		a = (a * b) / (b = a);
		System.out.println("After swapping solution 4:" + " a = " + a + ", b = " + b);
	}
}
