package com.kulsin.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MedianOfTwoSortedArraysTest {

    private final MedianOfTwoSortedArrays solution = new MedianOfTwoSortedArrays();

    /*
     * Input: nums1 = [1,3], nums2 = [2]
     * Output: 2.00000
     * Explanation: merged array = [1,2,3] and median is 2.
     */
    @Test
    void test1() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        double response = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(2.00000, response);
    }

    /**
     * Input: nums1 = [1,2], nums2 = [3,4]
     * Output: 2.50000
     * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
     */
    @Test
    void test2() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};

        double response = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(2.50000, response);
    }

}