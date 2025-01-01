package com.kulsin.algorithms;

import java.util.Scanner;

public class QuickSort {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] a = new int[n];

		String[] aItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int aItem = Integer.parseInt(aItems[i]);
			a[i] = aItem;
		}

		quickSort(a, 0, a.length - 1);

		for (int i = 0; i < a.length; ++i)
			System.out.print(a[i] + " ");

		scanner.close();
	}

	private static void quickSort(int[] arr, int low, int high) {

		if (low < high) {
			int j = partition(arr, low, high);
			quickSort(arr, low, j - 1);
			quickSort(arr, j + 1, high);
		}

	}

	private static int partition(int[] arr, int low, int high) {

		int pivot = arr[high];

		int j = low;

		for (int i = low; i < high; i++) {
			if (arr[i] < pivot) {
				int tmp = arr[j];
				arr[j] = arr[i];
				arr[i] = tmp;
				j++;
			}
		}

		int tmp = arr[j];
		arr[j] = pivot;
		arr[high] = tmp;

		return j;

	}

}
