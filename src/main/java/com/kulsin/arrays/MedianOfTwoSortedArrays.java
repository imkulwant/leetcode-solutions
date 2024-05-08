package com.kulsin.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 4. Median of Two Sorted Arrays
 * <p>
 * <a href="https://leetcode.com/problems/median-of-two-sorted-arrays">...</a>
 */
class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        double median = 0.0;
        int l = nums1.length + nums2.length;
        List<Integer> list = new ArrayList<Integer>();
        boolean flag = true;

        for (int i = 0; i < Math.max(nums1.length, nums2.length); i++) {

            if (i < nums1.length) {
                list.add(nums1[i]);
                flag = false;
            }

            if (i < nums2.length) {
                list.add(nums2[i]);
                flag = false;
            }

        }
        Collections.sort(list);

        if (flag) {
            return 0;
        }

        if (l % 2 == 0) {
            Integer x = l / 2;
            median = list.get(x) + list.get((x - 1));

            return median / 2;
        } else {
            median = list.get((l / 2));
            return median;
        }

    }

}
