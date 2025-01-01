package com.kulsin.array;

/**
 * 189. Rotate Array
 * <p>
 * <a href="https://leetcode.com/problems/rotate-array">...</a>
 */
class RotateArray {

    /**
     * Runtime: 1ms
     * Memory: 56.95MB
     */
    public void rotate(int[] nums, int k) {

        if (k > nums.length) {
            while (k > 0) {
                swapPositions(nums);
                k--;
            }
        } else {
            int[] result = new int[nums.length];
            int tmp = k;
            int e = 0;
            while (k > 0) {
                result[e] = nums[nums.length - k];
                // swapPositions(nums);
                k--;
                e++;
            }

            for (int i = 0; i < nums.length - tmp; i++) {
                result[e] = nums[i];
                e++;
            }

            for (int i = 0; i < nums.length; i++) {
                nums[i] = result[i];
            }
        }

    }

    private void swapPositions(int[] nums) {
        int value = nums[nums.length - 1];
        for (int i = nums.length - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = value;
    }

}
