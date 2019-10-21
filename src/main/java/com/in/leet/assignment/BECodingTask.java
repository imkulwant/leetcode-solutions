package com.in.leet.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BECodingTask {

	private static int maximumVal;

	public static void main(String[] args) {
		/* Scanner object to read user input */
		Scanner scanner = new Scanner(System.in);

		/* Reading x and y */
		int x = scanner.nextInt();
		int y = scanner.nextInt();

		/* Creating ArrayList of size x, initialize with 0 */
		List<Integer> numList = new ArrayList<Integer>(Collections.nCopies(x, 0));

		/* Loop to perform y operations on numList */
		for (int read = 0; read < y; read++) {

			int i = scanner.nextInt();
			int j = scanner.nextInt();
			int k = scanner.nextInt();

			/*
			 * Subtracting 1 from i & j, as index in ArrayList start from 0 and indexing as
			 * per problem start with 1
			 */
			updateList(numList, i - 1, j - 1, k);
		}

		System.out.println(maximumVal);
		scanner.close();
	}

	/**
	 * This method add value 'k' to all the elements in the range of index 'i' to
	 * 'j'
	 * 
	 * @param numList
	 * @param i
	 * @param j
	 * @param k
	 */
	private static void updateList(List<Integer> numList, int i, int j, int k) {
		while (i <= j) {
			int val = numList.get(i) + k;
			numList.set(i, val);
			i++;

			if (val > maximumVal) {
				maximumVal = val;
			}
		}

	}
}
