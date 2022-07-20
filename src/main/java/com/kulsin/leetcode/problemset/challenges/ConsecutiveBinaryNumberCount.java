package com.kulsin.leetcode.problemset.challenges;

import java.util.Scanner;

public class ConsecutiveBinaryNumberCount {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		scanner.close();

		String b = convertBinary(n);
		char[] arr = b.toCharArray();
		int max = 0;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '1') {
				count++;
			} else {
				count = 0;
			}

			if (count > max) {
				max = count;
			}
		}

		System.out.println(max);
	}

	private static String convertBinary(int n) {
		String b = "";

		while (n > 0) {
			int m = n % 2;
			b = b + m;
			n = n / 2;
		}
		return b;
	}
}
