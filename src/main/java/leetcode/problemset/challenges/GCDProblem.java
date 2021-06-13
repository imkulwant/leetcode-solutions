package leetcode.problemset.challenges;

import java.util.Scanner;

public class GCDProblem {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(scan.nextLine());
		}
		System.out.println("HCF: " + deriveGcd(n, arr));
		scan.close();

	}

	private static int deriveGcd(int n, int[] arr) {

		int r = arr[0];
		for (int i = 1; i < n; i++) {
			r = gcd(arr[i], r);
		}
		return r;
	}

	static int gcd(int x, int y) {
		if (y == 0) {
			return x;
		}
		return gcd(y, x % y);
	}

}
