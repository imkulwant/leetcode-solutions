package com.kulsin.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {

    MajorityElement solution = new MajorityElement();

    @Test
    void test1() {
        assertEquals(3, solution.majorityElement(new int[]{3, 2, 3}));
    }

    @Test
    void test2() {
        assertEquals(2, solution.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }

    @Test
    void test3() {
        assertEquals(5, solution.majorityElement(new int[]{6, 5, 5}));
    }

    @Test
    void test4() {
        assertEquals(1, solution.majorityElement(new int[]{-1, 1, 1, 1, 2, 1}));
    }

}