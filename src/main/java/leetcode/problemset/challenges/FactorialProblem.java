package leetcode.problemset.challenges;

import java.io.IOException;
import java.util.Scanner;

public class FactorialProblem {

	// Complete the factorial function below.
	static int factorial(int n) {
		if (n > 1) {
			return n * factorial(n - 1);
		}
		return n;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int result = factorial(n);
		System.out.println("Factorial: " + result);
		scanner.close();
	}
}
