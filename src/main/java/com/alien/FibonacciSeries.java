package com.alien;

// Print a Fibonacci series using recursion?

// The Fibonacci numbers are the numbers in the following integer sequence:
//  0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..

public class FibonacciSeries {

	public static void main(String[] args) {

		int n = 10;

		System.out.println(fibonacci(n));

	}

	private static int fibonacci(int n) {

		if (n <= 1) {
			return n;
		}

		return fibonacci(n - 1) + fibonacci(n - 2);

	}
}
