package com.alien;

// LCM of Two Numbers

public class LCM_TwoNumbers {

	public static void main(String[] args) {

		int a = 15, b = 20;
		int x = Math.max(a, b);
		int y = a * b;

		int ans = x;

		for (int i = x; i <= y; i++) {
			if (i % a == 0 && i % b == 0) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}

}
