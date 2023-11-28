package com.kulsin.easy;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] inputArray) {

        List<Integer> sortedList = new ArrayList<>();
        sortedList.add(inputArray[0]);

        for (int i = 1; i < (inputArray.length); i++) {
            if (inputArray[i] != inputArray[i - 1]) {
                sortedList.add(inputArray[i]);
            }
        }

        for(int p = 0; p<sortedList.size();p++) {
            inputArray[p] = sortedList.get(p);
        }

        return sortedList.size();

    }

}
