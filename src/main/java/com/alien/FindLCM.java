package com.alien;

public class FindLCM {

	public static void main(String[] args) {
		int num1 = 72, num2 = 120; // Step 1: Numbers to find the LCM of
		System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm(num1, num2));
	}

	private static int lcm(int num1, int num2) {

		return (num1 * num2) / gcd(num1, num2);
	}

	private static int gcd(int num1, int num2) {

		while (num2 != 0) {
			int temp = num2;
			num2 = num1 % num2;
			num1 = temp;
		}

		return num1;
	}
}
