package com.kulsin.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestCommonPrefixTest {

    private final LongestCommonPrefix solution = new LongestCommonPrefix();

    @Test
    void longestCommonPrefixTest1() {
        /*
        Input: strs = ["flower","flow","flight"]
        Output: "fl"
        */
        String[] input = new String[]{"flower", "flow", "flight"};
        String response = solution.longestCommonPrefix(input);

        Assertions.assertEquals("fl", response);
    }

    @Test
    void longestCommonPrefixTest2() {
        /*
        Input: strs = ["dog","racecar","car"]
        Output: ""
        Explanation: There is no common prefix among the input strings.
        */
        String[] input = new String[]{"dog", "racecar", "car"};
        String response = solution.longestCommonPrefix(input);

        Assertions.assertEquals("", response);
    }

    @Test
    void longestCommonPrefixTest3() {
        /*
        Input: strs = ["a"]
        Output: "a"
        */
        String[] input = new String[]{"a"};
        String response = solution.longestCommonPrefix(input);

        Assertions.assertEquals("a", response);
    }
}