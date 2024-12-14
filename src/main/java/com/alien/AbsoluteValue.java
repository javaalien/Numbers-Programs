package com.alien;

// You are given an interger I, find the absolute value of the interger I.

/*Input:
I = -32
Output: 32*/

public class AbsoluteValue {

	public static void main(String[] args) {
		System.out.println(absolute(-20));
	}

	public static int absolute(int I) {

		int ans = 0;

		if (I < 0) {
			ans = 0 - I;

			return ans;
		}
		return I;

	}

}
