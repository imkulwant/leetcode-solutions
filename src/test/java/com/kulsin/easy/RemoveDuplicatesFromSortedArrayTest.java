package com.kulsin.easy;

import org.junit.jupiter.api.Test;

class RemoveDuplicatesFromSortedArrayTest {

    @Test
    void removeDuplicatesTestExampleOne() {

        int[] input = new int[]{1, 1, 2};
        int[] expectedArray = new int[]{1, 2};
        int response = RemoveDuplicatesFromSortedArray.removeDuplicates(input);

        assert response == 2;

        for (int i = 0; i < response; i++) {
            assert input[i] == expectedArray[i];
        }
    }

    @Test
    void removeDuplicatesTestExampleTwo() {

        int[] input = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expectedArray = new int[]{0, 1, 2, 3, 4};

        int response = RemoveDuplicatesFromSortedArray.removeDuplicates(input);

        assert response == 5;

        for (int i = 0; i < response; i++) {
            assert input[i] == expectedArray[i];
        }
    }

}