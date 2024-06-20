package com.alien;

import java.util.Scanner;

//Java Program to Find Sum of Natural Numbers

public class NaturalNumberSum {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number up to which you want the sum:");
		int n = scanner.nextInt();

		int sum = calculateSum(n);
		System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
	}

	private static int calculateSum(int n) {
		return n * (n + 1) / 2;
	}

}
