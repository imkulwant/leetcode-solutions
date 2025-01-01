package com.kulsin.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainerWithMostWaterTest {

    ContainerWithMostWater solution = new ContainerWithMostWater();

    @Test
    public void maxAreaTest1() {
        int[] input = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int expectedResponse = 49;
        assertEquals(expectedResponse, solution.maxArea(input));
        assertEquals(expectedResponse, solution.maxAreaTwoPointerSolution(input));
    }

    @Test
    public void maxAreaTest2() {
        int[] input = {1, 1};
        int expectedResponse = 1;
        assertEquals(expectedResponse, solution.maxArea(input));
        assertEquals(expectedResponse, solution.maxAreaTwoPointerSolution(input));
    }

    @Test
    public void maxAreaTest3() {
        int[] input = {4, 3, 2, 1, 4};
        int expectedResponse = 16;
        assertEquals(expectedResponse, solution.maxArea(input));
        assertEquals(expectedResponse, solution.maxAreaTwoPointerSolution(input));
    }

    @Test
    public void maxAreaTest4() {
        int[] input = {1, 2, 1};
        int expectedResponse = 2;
        assertEquals(expectedResponse, solution.maxArea(input));
        assertEquals(expectedResponse, solution.maxAreaTwoPointerSolution(input));
    }

}