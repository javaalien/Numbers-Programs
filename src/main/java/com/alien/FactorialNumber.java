package com.alien;

// How do you find the factorial of an integer?

public class FactorialNumber {

	public static void main(String[] args) {
		int n = 5;
		long factResult = factorial(n);
		System.out.println(factResult);
	}

	private static long factorial(int n) {

		if (n == 1)
			return 1;
		else
			return (n * factorial(n - 1));
	}
}
