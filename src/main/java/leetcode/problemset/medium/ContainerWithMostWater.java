package leetcode.problemset.medium;

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

    private int calculateArea(int xPosition, int xHeight, int yPosition, int yHeight) {
        int height = Math.min(xHeight, yHeight);
        int width = yPosition - xPosition;
        return height * width;
    }
}
