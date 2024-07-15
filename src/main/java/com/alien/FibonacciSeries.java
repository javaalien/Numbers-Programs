package com.alien;

public class FibonacciSeries {

	public static void main(String[] args) {

		int terms = 10; // Step 1: The number of terms to generate
		int firstTerm = 0, secondTerm = 1;

		System.out.println("Fibonacci Series up to " + terms + " terms:");

		for (int i = 1; i <= terms; ++i) {
			System.out.print(firstTerm + " ");

			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}
}
