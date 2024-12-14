package com.alien;

// // GCD or HCF of two Numbers

public class GcdHcf_TwoNumbers2 {

	public static void main(String[] args) {
		int a = 98, b = 56;
		System.out.println("GCD of " + a + " and " + b + " is " + gcd(a, b));
	}

	private static int gcd(int a, int b) {

		if (b == 0)
			return a;

		return gcd(b, a % b);

	}
}
