package com.kulsin.leetcode.problemset.challenges;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SmallestInteger {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());

		int[] arr = new int[num];
		Set<Integer> nums = new HashSet<Integer>();
		Set<Integer> uniqueNums = new HashSet<Integer>();

		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(scan.nextLine());
			nums.add(i + 1);
			uniqueNums.add(arr[i]);

		}

		System.out.println("Smallest Integer:" + solution(nums, uniqueNums));
		scan.close();
	}

	static int solution(Set<Integer> nums, Set<Integer> uniqueNums) {

		uniqueNums.stream().forEach(num -> nums.remove(num));

		int min = nums.stream().findFirst().get();

		for (int num : nums) {
			if (min > num) {
				min = num;
			}
		}

		return min;
	}
}