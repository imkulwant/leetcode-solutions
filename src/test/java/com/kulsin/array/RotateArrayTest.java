package com.kulsin.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RotateArrayTest {

    RotateArray solution = new RotateArray();

    @Test
    void test1() {
        int[] input = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;

        int[] expectedOutput = { 5, 6, 7, 1, 2, 3, 4 };

        solution.rotate(input, k);

        Assertions.assertArrayEquals(expectedOutput, input);
    }

    @Test
    void test2() {
        int[] input = { -1 };
        int k = 2;

        int[] expectedOutput = { -1 };

        solution.rotate(input, k);

        Assertions.assertArrayEquals(expectedOutput, input);
    }

}
