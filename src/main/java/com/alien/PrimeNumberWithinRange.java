package com.alien;

import java.util.Scanner;

// Java Program for Prime Numbers Within a Range

public class PrimeNumberWithinRange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  min range :");
		int min = sc.nextInt();
		System.out.println("Enter Max Range :");
		int max = sc.nextInt();

		for (int i = min; i < max; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}

	private static boolean isPrime(int num) {

		if (num <= 1)
			return false;

		if (num == 2)
			return true;

		if (num % 2 == 0 || num % 3 == 0) {
			return false;
		}

		for (int i = 5; i < num / 2; i += 6) {
			if (num % i == 0 || num % (i + 2) == 0)
				return false;
		}

		return true;
	}
}
