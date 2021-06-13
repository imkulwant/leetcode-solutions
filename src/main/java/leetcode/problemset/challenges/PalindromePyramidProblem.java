package leetcode.problemset.challenges;

import java.util.Scanner;

public class PalindromePyramidProblem {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());

		for (int i = 0; i < num; i++) {

			int[] row = new int[(i * 2) + 1];
			int x = i;
			
			for (int j = 0; j < row.length; j++) {
			
				if (j >= i + 1) {
					row[j] = x;
					x--;
				} else {
					row[j] = j + 1;
				}

			}
			printRow(row);

		}
	}

	private static void printRow(int[] row) {

		System.out.println("\n");
		for (int i = 0; i < row.length; i++) {
			System.out.print(row[i]);
		}
	}
}
