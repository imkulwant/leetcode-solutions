package com.kulsin.miscellaneous;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckTest {

    PalindromeCheck solution = new PalindromeCheck();

    @Test
    void test1() {
        assertTrue(solution.palindromeCheck(121));
    }

    @Test
    void test2() {
        assertFalse(solution.palindromeCheck(-121));
    }

    @Test
    void test3() {
        assertFalse(solution.palindromeCheck(10));
    }

}