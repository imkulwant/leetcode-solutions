package leetcode.problemset.medium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ContainerWithMostWaterTest {

    private ContainerWithMostWater containerWithMostWater;

    @Before
    public void setUp() throws Exception {
        containerWithMostWater = new ContainerWithMostWater();
    }

    @Test
    public void maxAreaTest1() {
        int[] input = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int expectedResponse = 49;
        maxAreaTestCommon(input, expectedResponse);
    }

    @Test
    public void maxAreaTest2() {
        int[] input = {1, 1};
        int expectedResponse = 1;
        maxAreaTestCommon(input, expectedResponse);
    }

    @Test
    public void maxAreaTest3() {
        int[] input = {4, 3, 2, 1, 4};
        int expectedResponse = 16;
        maxAreaTestCommon(input, expectedResponse);
    }

    @Test
    public void maxAreaTest4() {
        int[] input = {1, 2, 1};
        int expectedResponse = 2;
        maxAreaTestCommon(input, expectedResponse);
    }

    private void maxAreaTestCommon(int[] input, int expectedResponse) {
        int actualResponse = containerWithMostWater.maxArea(input);
        Assert.assertEquals(expectedResponse, actualResponse);
    }
}