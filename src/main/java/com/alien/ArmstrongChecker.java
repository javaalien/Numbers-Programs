package com.alien;

// Java Program to Check Armstrong Number

public class ArmstrongChecker {

	public static void main(String[] args) {

		int number = 153;
		if (isArmstrong(number)) {
			System.out.println(number + " is an Armstrong number!");
		} else {
			System.out.println(number + " is not an Armstrong number.");
		}

	}

	private static boolean isArmstrong(int number) {

		int rev = 0, sum = 0;
		int original = number;

		while (number > 0) {
			rev = number % 10;
			sum += (rev * rev * rev);
			number /= 10;
		}

		return original == sum;
	}
}
