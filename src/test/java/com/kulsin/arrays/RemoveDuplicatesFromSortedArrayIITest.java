package com.kulsin.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayIITest {

    RemoveDuplicatesFromSortedArrayII solution = new RemoveDuplicatesFromSortedArrayII();

    @Test
    void test1() {
        int[] nums = {1, 1, 1, 2, 2, 3};

        int expectedResponse = 5;
        int[] expectedNums = {1, 1, 2, 2, 3};

        assertEquals(expectedResponse, solution.removeDuplicates(nums));

        for (int i = 0; i < expectedResponse; i++) {
            assertEquals(nums[i], expectedNums[i]);
        }

    }

    @Test
    void test2() {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};

        int expectedResponse = 7;
        int[] expectedNums = {0, 0, 1, 1, 2, 3, 3};

        assertEquals(expectedResponse, solution.removeDuplicates(nums));

        for (int i = 0; i < expectedResponse; i++) {
            Assertions.assertEquals(nums[i], expectedNums[i]);
        }
    }

}