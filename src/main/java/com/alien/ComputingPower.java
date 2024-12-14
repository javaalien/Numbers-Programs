package com.alien;

// Write a program to calculate Power

public class ComputingPower {

	public static void main(String[] args) {

		int x = 2;
		int n = 3;
		System.out.println(power(x, n));
		System.out.println(power2(x, n));

	}

	private static int power2(int x, int n) {

		int temp;
		if (n == 0)
			return 1;

		temp = power2(x, n / 2);

		if (n % 2 == 0)
			return temp * temp;
		else
			return x * temp * temp;
	}

	private static long power(int x, int n) {

		long pow = 1L;

		for (int i = 0; i < n; i++) {
			pow = pow * x;
		}
		return pow;
	}

}
