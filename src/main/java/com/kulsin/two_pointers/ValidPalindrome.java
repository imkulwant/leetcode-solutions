package com.kulsin.two_pointers;

/**
 * 125. Valid Palindrome
 * <p>
 * <a href="https://leetcode.com/problems/valid-palindrome">...</a>
 */
class ValidPalindrome {

    /**
     * Runtime: 5 ms
     * Memory Usage: 45.58 MB
     */
    public boolean isPalindrome(String s) {

        if (s == null || s.isEmpty() || s.length() == 1) {
            return true;
        }

        int i = 0, j = s.length() - 1;

        do {
            String ci = getCharValue(s.charAt(i)); // char at i
            String cj = getCharValue(s.charAt(j)); // char at j

            if (ci == null) {
                i++;
            } else if (cj == null) {
                j--;
            } else if (ci.equals(cj)) {
                i++;
                j--;
            } else {
                return false;
            }

        } while (i < j);

        return true;

    }

    String getCharValue(char ch) {
        if (Character.isAlphabetic(ch)) {
            if (Character.isUpperCase(ch)) {
                return String.valueOf(Character.toLowerCase(ch));
            } else {
                return String.valueOf(ch);
            }
        } else if (Character.isDigit(ch)) {
            return String.valueOf(ch);
        } else {
            return null;
        }
    }

}
