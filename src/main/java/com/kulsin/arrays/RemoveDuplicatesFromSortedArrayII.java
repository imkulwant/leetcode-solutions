package com.kulsin.arrays;

/**
 * 80. Remove Duplicates from Sorted Array II
 * <p>
 * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii">...</a>
 */
public class RemoveDuplicatesFromSortedArrayII {

    /**
     * Runtime: 4ms
     * Memory: 44.24MB
     */
    public int removeDuplicates(int[] nums) {

        int updatedArrayLength = 0;
        int removed = 0;

        for (int val : nums) {
            int valueCount = 0;

            updatedArrayLength = nums.length - removed;

            for (int j = 0; j < updatedArrayLength; j++) {

                if (nums[j] == val) {
                    valueCount++;
                }

                if (valueCount > 2) {
                    removeAndShiftLeft(nums, j);
                    removed++;
                    valueCount--;
                }
            }

        }

        return nums.length - removed;
    }

    private void removeAndShiftLeft(int[] nums, int pos) {

        for (int i = pos; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }

    }

}
