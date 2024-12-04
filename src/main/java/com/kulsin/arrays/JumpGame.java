package com.kulsin.arrays;

/**
 * 55. Jump Game
 * <p>
 * <a href="https://leetcode.com/problems/jump-game">...</a>
 */
public class JumpGame {

    public boolean canJump(int[] nums) {

        boolean canJump = false;
        int lastPos = nums.length - 1;

        if (nums.length == 0) {
            return true;
        }
        // [2,0]
        // [0,1]
        for (int i = 0; i < lastPos; i++) {

            int jumpCount = nums[i];

            if( i == lastPos) {
                return true;
            }

            if (jumpCount == 0) {
                return false;
            }

            if (i + jumpCount == lastPos) {
                return true;
            }

            if( i+jumpCount > lastPos) {
                // do nothing
            }

        }

        return canJump;
    }

}
