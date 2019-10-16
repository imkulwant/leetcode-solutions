package com.in.leet;

public class CheckPrimeNum {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		int[] arr = { 23, 51, 12 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				System.out.println("Not prime");
			} else {
				checkPrime(2, arr[i]);
			}
		}
	}

	private static void checkPrime(int x, int n) {
		while (x * x <= n) {
			if (n % x == 0) {
				System.out.println("Not prime");
				return;
			}
			x++;
		}
		System.out.println("Prime");
	}
}
