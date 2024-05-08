package com.kulsin.arrays;

/**
 * 88. Merge Sorted Array
 * <p>
 * <a href="https://leetcode.com/problems/merge-sorted-array">...</a>
 */
class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int tmp = m;
        if (nums1.length == nums2.length) {
            for (int i = 0; i < n; i++) {
                if (nums2[i] != 0) {
                    insertAtPosition(nums1, nums2[i], i, m + n);
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                boolean flag = true;
                for (int j = 0; j < (m + n) && flag; j++) {

                    if ((nums1[j] > nums2[i]) || (j >= tmp && flag)) {
                        insertAtPosition(nums1, nums2[i], j, m + n);
                        flag = false;
                        tmp++;
                    }

                }

            }
        }

    }

    private void insertAtPosition(int[] array, int value, int position, int arrayLength) {

        int tmp = array[position];
        array[position] = value;

        for (int i = position + 1; i < arrayLength; i++) {
            int cache = array[i];
            array[i] = tmp;
            tmp = cache;
        }

    }

}