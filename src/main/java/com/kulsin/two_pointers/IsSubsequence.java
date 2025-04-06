package com.kulsin.two_pointers;

/**
 * 392. Is Subsequence
 * <p>
 * <a href="https://leetcode.com/problems/is-subsequence">...</a>
 */
class IsSubsequence {

    /**
     * Runtime: 2 ms
     * Memory Usage: 42.08 MB
     */
    public boolean isSubsequence(String s, String t) {

        if (s.isEmpty()) return true;

        if (t.isEmpty()) return false;

        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            do {
                if (s.charAt(i) == t.charAt(j)) {
                    if (i == s.length() - 1) {
                        return true;
                    }
                    i++;
                    j++;
                } else {
                    j++;
                }
                if (j == t.length()) {
                    return false;
                }
            } while (j < t.length());
        }
        return false;
    }

    /**
     * Runtime: 2 ms
     * Memory Usage: 41.39 MB
     */
    public boolean isSubsequenceV2(String s, String t) {

        if (s.isEmpty()) return true;

        if (t.isEmpty()) return false;

        int sPos = 0, tPos = 0;

        for (int i = 0; i < t.length(); i++) {
            if (sPos == s.length()) {
                break;
            }
            if (s.charAt(sPos) == t.charAt(i)) {
                sPos++;
            }
        }

        if (sPos == s.length()) {
            return true;
        }

        return false;
    }

}
