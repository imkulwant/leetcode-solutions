package com.kulsin.leetcode.problemset.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PalindromeCheckTest {

    private PalindromeCheck service;

    @BeforeEach
    void setUp() {
        service = new PalindromeCheck();
    }

    @Test
    void palindromeCheck_ValidStringInput() {
        Assertions.assertTrue(service.palindromeCheck("abaaba"));
    }

    @Test
    void palindromeCheck_InvalidStringInput() {
        Assertions.assertFalse(service.palindromeCheck("abaab"));
    }

    @Test
    void palindromeCheck_ValidIntegerInput() {
        Assertions.assertTrue(service.palindromeCheck(123321));
    }

    @Test
    void palindromeCheck_InvalidIntegerInput() {
        Assertions.assertFalse(service.palindromeCheck(123));
    }

}