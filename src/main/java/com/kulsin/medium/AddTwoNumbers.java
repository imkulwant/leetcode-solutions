package com.kulsin.medium;

public class AddTwoNumbers {
    static int counter = 0;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if (l1.next == null && l2.next == null) {
            return new ListNode(0, null);
        }

        ListNode result = null;

        for (int i = 0; i < 100; i++) {

            int val = getVal(l1, l2);

            if (l1.next == null) {
                result = new ListNode(val, l2.next);
            } else if (l2.next == null) {
                result = new ListNode(val, l1.next);
            } else {
                result = new ListNode(val, addTwoNumbers(l1.next, l2.next));
            }

        }

        return result;
    }

    private int getVal(ListNode l1, ListNode l2) {

        if (counter > 0) {
            counter = 0;
        }

        if (l1 == null) {
            return l2.val;
        } else if (l2 == null) {
            return l1.val;
        }

        if (l1.val + l2.val + counter > 9) {
            counter++;
            return (l1.val + l2.val + counter) - 10;
        } else {
            return l1.val + l2.val + counter;
        }

    }

    /**
     * Definition for singly-linked list.
     */
    private static class ListNode {
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
    }
}