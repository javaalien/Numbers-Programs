package com.alien;

// Java Program to Find GCD of Two Numbers

public class GCDOfTwoNumbers {

	public static void main(String[] args) {

		int number1 = 48; // First number
		int number2 = 18; // Second number
		System.out.println("The GCD of " + number1 + " and " + number2 + " is: " + gcd(number1, number2));

	}

	private static int gcd(int num1, int num2) {

		while (num1 != num2) {
			if (num1 > num2)
				num1 = num1 - num2;
			else
				num2 = num2 - num1;
		}

		return num1;
	}

}
