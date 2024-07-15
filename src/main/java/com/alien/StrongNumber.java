package com.alien;

// Java Program to Find Strong Number

// A strong number is a special number whose sum of the factorial of digits is 
// equal to the original number. 
// For example, 145 is a strong number because 1! + 4! + 5! = 145.

public class StrongNumber {

	public static void main(String[] args) {

		int number = 145; // Step 1: Number to check
		int originalNumber = number;
		int sum = 0;

		while (number > 0) {
			int digit = number % 10;
			sum += factorial(digit);
			number /= 10;
		}

		if (sum == originalNumber) {
			System.out.println(originalNumber + " is a Strong Number.");
		} else {
			System.out.println(originalNumber + " is not a Strong Number.");
		}
	}

	private static int factorial(int digit) {
		if (digit == 1)
			return 1;

		return digit * factorial(digit - 1);
	}
}
