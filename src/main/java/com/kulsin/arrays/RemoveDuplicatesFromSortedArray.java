package com.kulsin.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * 26. Remove Duplicates from Sorted Array
 * <p>
 * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array">...</a>
 */
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] inputArray) {

        List<Integer> sortedList = new ArrayList<>();
        sortedList.add(inputArray[0]);

        for (int i = 1; i < (inputArray.length); i++) {
            if (inputArray[i] != inputArray[i - 1]) {
                sortedList.add(inputArray[i]);
            }
        }

        for (int p = 0; p < sortedList.size(); p++) {
            inputArray[p] = sortedList.get(p);
        }

        return sortedList.size();

    }

}
