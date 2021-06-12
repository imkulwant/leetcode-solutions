package leetcode.problemset.medium;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 
 * Given a string, find the length of the longest substring without repeating
 * characters.
 * 
 * Example 1:
 * 
 * Input: "abcabcbb" Output: 3 Explanation: The answer is "abc", with the length
 * of 3.
 * 
 * Example 2:
 * 
 * Input: "bbbbb" Output: 1 Explanation: The answer is "b", with the length of
 * 1.
 * 
 * @author root
 *
 */
public class LongestSubString {

	private static final Scanner scanner = new Scanner(System.in);

	public static int lengthOfLongestSubstring(String s) {

		HashMap<Character, Integer> pos = new HashMap<Character, Integer>();

		int max = 0;
		int j = 0;

		for (int i = 0; i < s.length(); i++) {

			if (pos.containsKey(s.charAt(i))) {
				j = Math.max(j, pos.get(s.charAt(i)) + 1);
			}

			pos.put(s.charAt(i), i);
			max = Math.max(max, i - j + 1);
		}
		return max;
	}

	public static void main(String[] args) {
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String s2 = scanner.nextLine();
		System.out.println("Longest substring: " + lengthOfLongestSubstring(s2));

		scanner.close();
	}
}