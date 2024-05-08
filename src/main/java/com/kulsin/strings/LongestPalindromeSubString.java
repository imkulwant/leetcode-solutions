package com.kulsin.strings;

/**
 * 5. Longest Palindromic Substring
 * <p>
 * <a href="https://leetcode.com/problems/longest-palindromic-substring">...</a>
 */
class LongestPalindromeSubString {

    public String longestPalindrome(String s) {
        int len = s.length();

        if (len == 0)
            return "";

        int max = 0;
        String str = String.valueOf(s.charAt(0));

        for (int i = 0; i < len; i++) {
            for (int j = len - 1; j >= 0; j--) {
                if (check(s, i, j)) {
                    if (j - i > max) {
                        max = j - i;
                        str = s.substring(i, j + 1);
                    }
                }
            }
        }

        return str;
    }

    private static boolean check(String s, int i, int j) {

        for (; i <= j; i++) {
            if (!(s.charAt(i) == s.charAt(j))) {
                return false;
            } else {
                j--;
            }
        }
        return true;
    }

}
