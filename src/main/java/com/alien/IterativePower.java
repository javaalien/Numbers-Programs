package com.alien;

// Iterative Power

public class IterativePower {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("Power is " + power(x, y));
	}

	private static int power(int x, int y) {

		int res = 1;

		while (y > 0) {
			// If y is odd,
			// multiply
			// x with result
			if ((y & 1) == 1)
				res = res * x;

			// y must be even now
			y = y >> 1; // y = y/2
			x = x * x; // Change x to x^2
		}
		
		return res;
	}
}
