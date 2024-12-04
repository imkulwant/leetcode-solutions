package com.kulsin.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGameTest {

    private final JumpGame solution = new JumpGame();

    @Test
    void test1() {
        int[] nums = new int[]{2, 3, 1, 1, 4};

        assertTrue(solution.canJump(nums));
    }

    @Test
    void test2() {
        int[] nums = new int[]{3, 2, 1, 0, 4};

        assertFalse(solution.canJump(nums));
    }

    @Test
    void test3() {
        int[] nums = new int[]{2, 0};

        assertTrue(solution.canJump(nums));
    }

}