package com.kulsin.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveElementFromArrayTest {

    RemoveElementFromArray removeElementFromArray;

    @BeforeEach
    void setUp() {
        removeElementFromArray = new RemoveElementFromArray();
    }

    @Test
    void removeElement() {
        int val = 3;
        int[] nums = new int[]{3, 2, 2, 3};
        int[] expectedNums = new int[]{2,2};

        int response = removeElementFromArray.removeElement(nums, val);

        assert response == 2;

        for (int i = 0; i < response; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}