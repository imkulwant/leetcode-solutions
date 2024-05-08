package com.kulsin.linkedlists;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 21. Merge Two Sorted Lists
 * <p>
 * <a href="https://leetcode.com/problems/merge-two-sorted-lists/">...</a>
 */
class MergeTwoSortedLists {

    /**
     * Runtime: 16 ms
     * Memory Usage: 45.4 MB
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        List<Integer> combinedList = new CopyOnWriteArrayList<>();

        while (list1 != null && list1.next != null) {
            combinedList.add(list1.val);
            list1 = list1.next;
        }

        if (list1 != null) {
            combinedList.add(list1.val);
        }

        while (list2 != null && list2.next != null) {
            combinedList.add(list2.val);
            list2 = list2.next;
        }

        if (list2 != null) {
            combinedList.add(list2.val);
        }

        List<Integer> newList = combinedList.stream().sorted().toList();

        return makeListNode(newList);

    }

    private static ListNode makeListNode(List<Integer> list) {
        if (list.size() == 1) {
            return new ListNode(list.get(0));
        } else if (list.size() > 1) {
            int e = list.get(0);
            List tmp = new ArrayList<>(list);
            tmp.remove(0);
            ListNode ln = makeListNode(tmp);
            return new ListNode(e, ln);
        } else {
            return null;
        }
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ListNode listNode = (ListNode) o;
            return val == listNode.val && Objects.equals(next, listNode.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(val, next);
        }
    }

}
