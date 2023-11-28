package com.kulsin.challenges;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-conditional-statements/problem
 * */
public class ConditionalStatementProblem {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		if ((N % 2 == 0) && ((N > 1 && N < 6) || (N > 20))) {
			System.out.println("Not Weird");
		} else if (((N % 2 == 0) && N > 5 && N < 21) || !(N % 2 == 0)) {
			System.out.println("Weird");
		}

		scanner.close();
	}
}
