package com.alien;

// GCD or HCF of two Numbers

public class GcdHcf_TwoNumbers {

	public static void main(String[] args) {

		int a = 98, b = 56;
		System.out.println("GCD of " + a + " and " + b + " is " + gcd(a, b));

	}

	static int gcd(int a, int b) {

		if (a == 0)
			return b;
		if (b == 0)
			return a;

		if (a == b)
			return a;

		if (a > b)
			return gcd(a - b, b);

		return gcd(a, b - a);
	}
}
