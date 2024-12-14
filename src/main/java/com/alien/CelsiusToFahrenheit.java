package com.alien;

// convert the given temperature to Fahrenheit.

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		int n = 32;
		System.out.println(cToF(n));
	}

	public static double cToF(int C) {

		double res;
		res = (32 + (9 * C) / 5);

		return res;

	}
}
