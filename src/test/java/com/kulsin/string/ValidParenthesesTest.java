package com.kulsin.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidParenthesesTest {

    ValidParentheses solution = new ValidParentheses();

    @Test
    void isValidTest1() {
        Assertions.assertTrue(solution.isValid("()"));
    }

    @Test
    void isValidTest2() {
        Assertions.assertTrue(solution.isValid("()[]{}"));
    }

    @Test
    void isValidTest3() {
        Assertions.assertFalse(solution.isValid("(]"));
    }

    @Test
    void isValidTest4() {
        Assertions.assertFalse(solution.isValid("["));
    }

    @Test
    void isValidTest5() {
        Assertions.assertFalse(solution.isValid("(("));
    }

    @Test
    void isValidTest6() {
        Assertions.assertFalse(solution.isValid("){"));
    }

}