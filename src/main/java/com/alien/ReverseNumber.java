package com.alien;

//Java Program to Reverse a Number

public class ReverseNumber {

	public static void main(String[] args) {

		int originalNumber = 12345;
		int reversedNumber = reverse(originalNumber);
		System.out.println("Original Number: " + originalNumber);
		System.out.println("Reversed Number: " + reversedNumber);

	}

	private static int reverse(int number) {
		int reversed = 0;
		while (number != 0) {
			int digit = number % 10;
			reversed = reversed * 10 + digit;
			number = number / 10;
		}
		return reversed;
	}

}
