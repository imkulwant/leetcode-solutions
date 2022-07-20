package com.kulsin.leetcode.problemset.challenges;

import java.util.Scanner;

public class PalindromPyramid {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());

		for (int j = 1; j <= num; j++) {

			for (int k = 1; k <= j; k++) {
				System.out.print(k);
			}

			for (int l = j - 1; l >= 1; l--) {
				System.out.print(l);
			}
			System.out.print("\n");
		}

	}
}
