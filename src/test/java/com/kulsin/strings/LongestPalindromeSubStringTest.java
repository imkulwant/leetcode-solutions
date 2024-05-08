package com.kulsin.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class LongestPalindromeSubStringTest {

    LongestPalindromeSubString solution = new LongestPalindromeSubString();

    @Test
    void test1() {
        Assertions.assertEquals("bab", solution.longestPalindrome("babad"));
    }

    @Test
    void test2() {
        Assertions.assertEquals("bb", solution.longestPalindrome("cbbd"));
    }

}
