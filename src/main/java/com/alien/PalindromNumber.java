package com.alien;

// Write a Java Program to find whether number is palindrome or not.

public class PalindromNumber {

	public static void main(String[] args) {

		int num = 121;
		int rev = 0;
		int rem;
		int temp = num;
		while (num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}

		if (temp == rev)
			System.out.println("Palindrom");
		else
			System.out.println("Not Palindrom");

	}
}
