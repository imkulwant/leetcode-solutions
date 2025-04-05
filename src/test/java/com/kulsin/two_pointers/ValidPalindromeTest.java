package com.kulsin.two_pointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidPalindromeTest {

    private final ValidPalindrome solution = new ValidPalindrome();

    @Test
    void isPalindromeTest1() {
        String input = "A man, a plan, a canal: Panama";
        boolean expectedOutput = true;

        Assertions.assertEquals(expectedOutput, solution.isPalindrome(input));
    }

    @Test
    void isPalindromeTest2() {
        String input = "race a car";
        boolean expectedOutput = false;

        Assertions.assertEquals(expectedOutput, solution.isPalindrome(input));
    }

    @Test
    void isPalindromeTest3() {
        String input = " ";
        boolean expectedOutput = true;

        Assertions.assertEquals(expectedOutput, solution.isPalindrome(input));
    }
}