package leetcode.problemset.easy;

public class PalindromeCheck {

	boolean palindromeCheck(String input) {
		int j = input.length() - 1;
		for (int i = 0; i <= j; i++) {
			if (!(input.charAt(i) == input.charAt(j))) {
				return false;
			} else {
				j--;
			}
		}
		return true;
	}

	boolean palindromeCheck(int input) {
		return palindromeCheck(String.valueOf(input));
	}

}
