package com.kulsin.leetcode.problemset.easy;

public class RemoveElementFromArray {

    /**
     * Runtime: 1 ms
     * Memory Usage: 42.9 MB
     */
    public int removeElement(int[] nums, int val) {
        int position = 0;
        for (int num : nums) {
            if (num != val) {
                nums[position] = num;
                position++;
            }
        }
        return position;
    }

}