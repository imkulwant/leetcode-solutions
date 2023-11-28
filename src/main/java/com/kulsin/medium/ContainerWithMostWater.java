package com.kulsin.medium;

/**
 * https://leetcode.com/problems/container-with-most-water/
 */
public class ContainerWithMostWater {

    /**
     * Brute Force Solution - Though this solution fails, it gives TimeLimitExceeded.
     * */
    public int maxArea(int[] height) {
        int maxArea = 0;
        for (int x = 0; x < height.length; x++) {
            for (int y = x + 1; y < height.length; y++) {
                int area = calculateArea(x, height[x], y, height[y]);
                if (maxArea < area)
                    maxArea = area;
            }
        }
        return maxArea;
    }

    /**
     * Linear time solution
     * */
    public int maxAreaTwoPointerSolution(int[] height) {
        int maxArea = 0;
        int leftPointer = 0;
        int rightPointer = (height.length - 1);

        while(leftPointer < rightPointer) {
            int area = calculateArea(leftPointer, height[leftPointer], rightPointer, height[rightPointer]);
            if (maxArea < area)
                maxArea = area;

            if(height[leftPointer] < height[rightPointer]) {
                leftPointer+=1;
            } else {
                rightPointer-=1;
            }
        }
        return maxArea;
    }

    private int calculateArea(int xPosition, int xHeight, int yPosition, int yHeight) {
        int height = Math.min(xHeight, yHeight);
        int width = yPosition - xPosition;
        return height * width;
    }
}
