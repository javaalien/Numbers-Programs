package com.alien;

// //calculate modular exponentiation x^n mod m.

public class ModularArithmetic {

	public static void main(String[] args) {
		System.out.println(modpower(5, 2, 7));
	}

	private static int modpower(int x, int n, int m) {

		if (n == 0)
			return 1 % m;

		long u = modpower(x, n / 2, m);

		u = (u * u) % m;

		if (n % 2 == 1)
			u = (u * x) % m;

		return (int) u;
	}

}
