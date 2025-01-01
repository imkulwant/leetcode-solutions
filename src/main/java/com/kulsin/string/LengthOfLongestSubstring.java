package com.kulsin.string;

import java.util.HashMap;

/**
 * 3. Longest Substring Without Repeating Characters
 * <p>
 * <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters">...</a>
 */
class LengthOfLongestSubstring {

    /**
     * Runtime: 5ms
     * Memory: 44.50MB
     */
    public int lengthOfLongestSubstring(String s) {

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

}