package com.alien;

import java.util.Vector;

// All Divisors of a Number

public class AllDivisorsNumber {

	public static void main(String[] args) {

		System.out.println("The divisors of 100 are: ");
		printDivisors(100);
		System.out.println();
		printDivisors2(100);
		System.out.println();
		printDivisors3(100);
	}

	private static void printDivisors(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				System.out.print(i + " ");
		}
	}

	private static void printDivisors2(int n) {

		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				if (n / i == i) {
					System.out.print(" " + i);
				} else {
					System.out.print(i + " " + n / i + " ");
				}
			}
		}
	}

	static void printDivisors3(int n) {
		Vector<Integer> v = new Vector<>();

		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				if (n / i == i)
					System.out.printf("%d ", i);
				else {
					System.out.printf("%d ", i);

					// push the second divisor in the vector
					v.add(n / i);
				}
			}
		}
		// The vector will be printed in reverse
		for (int i = v.size() - 1; i >= 0; i--)
			System.out.printf("%d ", v.get(i));
	}
}
