package com.alien;

import java.util.Iterator;

// Sieve of Eratosthenes

public class SieveOfEratosthenes {

	public static void main(String[] args) {

		int n = 30;
		System.out.print("Following are the prime numbers ");
		System.out.println("smaller than or equal to " + n);
		SieveOfEratosthenes g = new SieveOfEratosthenes();
		g.sieveOfEratosthenes(n);

	}

	private void sieveOfEratosthenes(int n) {

		boolean prime[] = new boolean[n + 1];

		for (int i = 0; i <= n; i++) {
			prime[i] = true;
		}

		for (int p = 2; p * p <= n; p++) {
			if (prime[p] == true) {
				for (int j = p * p; j <= n; j += p) {
					prime[j] = false;
				}
			}
		}

		// Print all prime numbers
		for (int i = 2; i <= n; i++) {
			if (prime[i] == true)
				System.out.print(i + " ");
		}
	}

}
