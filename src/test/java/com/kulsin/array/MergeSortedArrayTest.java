package com.kulsin.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortedArrayTest {

    private final MergeSortedArray solution = new MergeSortedArray();

    @Test
    void testCase1() {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = new int[]{2, 5, 6};
        int n = 3;

        solution.merge(nums1, m, nums2, n);


        int[] expected = new int[]{1, 2, 2, 3, 5, 6};

        assertArrayEquals(expected, nums1);
    }

    @Test
    void testCase2() {
        int[] nums1 = new int[]{0};
        int m = 0;
        int[] nums2 = new int[]{1};
        int n = 1;

        solution.merge(nums1, m, nums2, n);

        int[] expected = new int[]{1};

        assertArrayEquals(expected, nums1);
    }

    @Test
    void testCase3() {
        int[] nums1 = new int[]{4, 0, 0, 0, 0, 0};
        int m = 1;
        int[] nums2 = new int[]{1, 2, 3, 5, 6};
        int n = 5;

        solution.merge(nums1, m, nums2, n);

        int[] expected = new int[]{1, 2, 3, 4, 5, 6};

        assertArrayEquals(expected, nums1);
    }

}