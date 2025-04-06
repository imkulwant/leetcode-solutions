package com.kulsin.two_pointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IsSubsequenceTest {

    private final IsSubsequence solution = new IsSubsequence();

    @Test
    void isSubsequenceTest1() {
        String s = "abc", t = "ahbgdc";
        boolean expectedOutput = true;

        Assertions.assertEquals(expectedOutput, solution.isSubsequence(s, t));
    }

    @Test
    void isSubsequenceTest2() {
        String s = "axc", t = "ahbgdc";
        boolean expectedOutput = false;

        Assertions.assertEquals(expectedOutput, solution.isSubsequence(s, t));
    }

    @Test
    void isSubsequenceTest3() {
        String s = "b", t = "abc";
        boolean expectedOutput = true;

        Assertions.assertEquals(expectedOutput, solution.isSubsequence(s, t));
    }

    @Test
    void isSubsequenceTest4() {
        String s = "aaaaaa", t = "bbaaaa";
        boolean expectedOutput = false;

        Assertions.assertEquals(expectedOutput, solution.isSubsequence(s, t));
    }


}