package com.alien;

// Given a number N, the task is to return the count of digits in this number.

public class CountDigit {

	public static void main(String[] args) {
		long n = 345289467;
		System.out.print("Number of digits : " + countDigit(n));
	}

	private static long countDigit(long n) {

		if (n / 10 == 0) {
			return 1;
		}

		return 1 + countDigit(n / 10);
	}
}
