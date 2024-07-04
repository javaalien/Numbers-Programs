package com.alien;

// Write a Java Program to check if any number is a magic number or not. 
// A number is said to be a magic number if after doing sum of digits in each step and 
// inturn doing sum of digits of that sum, the ultimate result (when there is only one digit left) is 1.

public class MagicNumber {

	public static void main(String[] args) {

		int num = 163;
		int sumOfDigits = 0;

		while (num > 0 || sumOfDigits > 9) {
			if (num == 0) {
				num = sumOfDigits;
				sumOfDigits = 0;
			}
			sumOfDigits += num % 10;
			num /= 10;
		}

		if (sumOfDigits == 1) {
			System.out.println("Magic Number");
		} else {
			System.out.println("Not Magic Number");
		}
	}
}
