package leetcode.problemset.easy;

public class PalindromeCheck {
	public static void main(String[] args) {
		String s = "abaaba";
		System.out.println(check(s));
	}

	private static boolean check(String s) {
		int j = s.length() - 1;
		for (int i = 0; i <= j; i++) {
			if (!(s.charAt(i) == s.charAt(j))) {
				return false;
			} else {
				j--;
			}
		}
		return true;
	}

}
