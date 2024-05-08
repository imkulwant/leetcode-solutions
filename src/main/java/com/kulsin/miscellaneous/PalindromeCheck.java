package com.kulsin.miscellaneous;

/**
 * 9. Palindrome Number
 * <p>
 * <a href="https://leetcode.com/problems/palindrome-number">...</a>
 */
class PalindromeCheck {

    /**
     * Runtime: 6ms
     * Memory: 43.82MB
     */
    boolean palindromeCheck(int x) {
        String input = String.valueOf(x);
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

}
