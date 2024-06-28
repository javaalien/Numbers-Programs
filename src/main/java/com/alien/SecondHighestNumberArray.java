package com.alien;

// How would you find the second largest number in an array?

public class SecondHighestNumberArray {

	public static void main(String[] args) {

		int arr[] = { 3, 55, 7, 9, 23, 34, 76, 28, 56, 90 };

		int result = findSecondHighest(arr);

		System.out.println("Second highest Number is : " + result);

	}

	private static int findSecondHighest(int[] arr) {

		int highest = arr[0]; // int highest = Integer.MIN_VALUE;

		int secondHighest = arr[0];  //int secondHighest = Integer.MIN_VALUE;

		for (int i : arr) {
			if (i > highest) {
				secondHighest = highest;
				highest = i;
			} else if (i > secondHighest) {
				secondHighest = i;
			}
		}
		return secondHighest;
	}
}
