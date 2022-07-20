package com.kulsin.leetcode.problemset.challenges;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/minimum-time-required/problem
 * */
public class MinimumTimeRequired {

	static long minTime(long[] machines, long goal) {

		Arrays.sort(machines);
		long max = (machines[machines.length - 1]) * goal;
		long min = 0;
		long result = -1;

		while (max > min) {
			long midValue = (max + min) / 2;
			long unit = 0;
			for (long machine : machines) {
				unit += midValue / machine;
			}

			if (unit < goal) {
				min = midValue + 1;
				result = midValue + 1;
			} else {
				max = midValue;
				result = midValue;
			}

		}

		return result;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		String[] nGoal = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nGoal[0]);

		long goal = Long.parseLong(nGoal[1]);

		long[] machines = new long[n];

		String[] machinesItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			long machinesItem = Long.parseLong(machinesItems[i]);
			machines[i] = machinesItem;
		}

		long ans = minTime(machines, goal);

		System.out.println(String.valueOf(ans));

		scanner.close();
	}
}
