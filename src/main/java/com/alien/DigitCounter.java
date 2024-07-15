package com.alien;

import java.util.Scanner;

// Java Program to Count the Number of Digits in a Number

public class DigitCounter {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number:");
		int number = scanner.nextInt();

		int digitCount = countDigits(number);

		System.out.println("The number is " + digitCount + " digits.");

	}

	private static int countDigits(int number) {

		int count = 0;
		while (number > 0) {
			number /= 10;
			count++;
		}

		return count;
	}
}