package com.in.leet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MedianOfTwoArrays {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String[] nd = scanner.nextLine().split(" ");

		int n1 = Integer.parseInt(nd[0]);
		int n2 = Integer.parseInt(nd[1]);

		int[] a = new int[n1];
		int[] b = new int[n2];

		String[] aItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n1; i++) {
			int aItem = Integer.parseInt(aItems[i]);
			a[i] = aItem;
		}

		String[] bItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n2; i++) {
			int bItem = Integer.parseInt(bItems[i]);
			b[i] = bItem;
		}

		System.out.println("Median: " + findMedianSortedArrays(a, b));

		scanner.close();
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

		double median = 0.0;
		int l = nums1.length + nums2.length;
		List<Integer> list = new ArrayList<Integer>();
		boolean flag = true;

		for (int i = 0; i < Math.max(nums1.length, nums2.length); i++) {

			if (i < nums1.length ) {
				list.add(nums1[i]);
				flag = false;
			}

			if (i < nums2.length ) {
				list.add(nums2[i]);
				flag = false;
			}

		}
		Collections.sort(list);

		if (flag) {
			return 0;
		}

		if (l % 2 == 0) {
			Integer x = l / 2;
			median = list.get(x) + list.get((x - 1));

			return median / 2;
		} else {
			median = list.get((l / 2));
			return median;
		}

	}

	public static double findMedianOfArrays(int[] nums1, int[] nums2) {

		if (nums1.length > nums2.length) {
			return findMedianOfArrays(nums2, nums1);
		}

		int x = nums1.length;
		int y = nums2.length;

		int low = 0;
		int high = x;

		while (low <= high) {
			int partX = (low + high) / 2;
			int partY = ((x + y + 1) / 2) - partX;

			int maxLeftX = (partX == 0) ? Integer.MIN_VALUE : nums1[partX - 1];
			int minRightX = (partX == x) ? Integer.MAX_VALUE : nums1[partX];

			int maxLeftY = (partY == 0) ? Integer.MIN_VALUE : nums2[partY - 1];
			int minRightY = (partY == y) ? Integer.MAX_VALUE : nums2[partY];

			if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
				if ((x + y) % 2 == 0) {
					return (Math.max(maxLeftX, maxLeftY) + Math.max(minRightX, minRightY)) / 2;
				} else {
					return (Math.max(maxLeftX, maxLeftY));
				}
			} else if (maxLeftX > minRightY) {
				high = partX - 1;
			} else {
				low = partX + 1;
			}
		}

		// Only we we can come here is if input arrays were not sorted. Throw in that
		// scenario.
		throw new IllegalArgumentException();

	}

}
