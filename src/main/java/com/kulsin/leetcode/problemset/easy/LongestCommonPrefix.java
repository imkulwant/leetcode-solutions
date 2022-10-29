package com.kulsin.leetcode.problemset.easy;

import java.util.Arrays;

// https://leetcode.com/problems/longest-common-prefix/
public class LongestCommonPrefix {

    // Runtime: 11 ms
    // Memory Usage: 42.1 MB
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 1) {
            return strs[0];
        }

        int smallestLength = Arrays.stream(strs).map(String::length).sorted().toList().get(0);

        char[] e1 = strs[0].toCharArray();
        char[] response = new char[smallestLength];

        for (int pos = 0; pos < smallestLength; pos++) {

            for (int j = 1; j < strs.length; j++) {

                char[] eComp = strs[j].toCharArray();

                char e1Char = e1[pos];
                char eCompChar = eComp[pos];

                if (e1Char == eCompChar) {
                    response[pos] = e1Char;
                } else {
                    return String.copyValueOf(response, 0, pos);
                }
            }
        }
        return String.copyValueOf(response, 0, smallestLength);
    }

    /**
     * Finds common prefix in two String
     */
    String commonPrefix(String i, String j) {
        int smallLength = Math.min(i.length(), j.length());

        char[] response = new char[smallLength];
        char[] a = i.toCharArray();
        char[] b = j.toCharArray();

        for (int x = 0; x < smallLength; x++) {
            if (a[x] == b[x]) {
                response[x] = a[x];
            } else {
                return String.copyValueOf(response, 0, x);
            }
        }
        return String.copyValueOf(response, 0, smallLength);
    }
}
