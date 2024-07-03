package com.alien;

// Write a Java Program to find whether a number is prime or not in the most efficient way?

public class PrimeNumberMostEfficientWay {

	public static void main(String[] args) {

		int num = 23;

		boolean prime = isPrime(num);

		System.out.println(prime);

	}

	private static boolean isPrime(int num) {

		if (num <= 1)
			return false;
		if (num <= 3)
			return true;
		if (num % 2 == 0 || num % 3 == 0)
			return false;

		for (int i = 5; i * i < num; i += 6) {
			if (num % i == 0 || num % (i + 2) == 0)
				return false;
		}
		return true;
	}

}
