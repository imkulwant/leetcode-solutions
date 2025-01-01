package com.kulsin.array;

/**
 * 169. Majority Element
 * <p>
 * <a href="https://leetcode.com/problems/majority-element">...</a>
 */
class MajorityElement {

    /**
     * Runtime: 1897ms
     * Memory: 52.87MB
     */
    public int majorityElement(int[] nums) {
        int required = (nums.length / 2) + (nums.length % 2);

        for (int i = 0; i <= required; i++) {
            int count = 0;
            int left = 0;
            int right = nums.length - 1;

            while (left <= right) {

                if (left == right) {
                    if (nums[i] == nums[left]) {
                        count++;
                    }
                } else {
                    if (nums[i] == nums[left]) {
                        count++;
                    }

                    if (nums[i] == nums[right]) {
                        count++;
                    }
                }

                if (count >= required) {
                    return nums[i];
                }

                left++;
                right--;

            }

        }

        return nums[0];
    }
}

