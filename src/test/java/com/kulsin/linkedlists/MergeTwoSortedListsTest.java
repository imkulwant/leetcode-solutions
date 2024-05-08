package com.kulsin.linkedlists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MergeTwoSortedListsTest {

    MergeTwoSortedLists solution = new MergeTwoSortedLists();

    @Test
    void mergeTwoLists1() {
        MergeTwoSortedLists.ListNode output = solution.mergeTwoLists(list1(), list2());

        Assertions.assertEquals(expectedList(), output);
    }


    MergeTwoSortedLists.ListNode list1() {
        // list1 = [1,2,4]

        MergeTwoSortedLists.ListNode e3 = new MergeTwoSortedLists.ListNode(4);
        MergeTwoSortedLists.ListNode e2 = new MergeTwoSortedLists.ListNode(2, e3);
        MergeTwoSortedLists.ListNode e1 = new MergeTwoSortedLists.ListNode(1, e2);

        return e1;
    }

    MergeTwoSortedLists.ListNode list2() {
        // list2 = [1,3,4]

        MergeTwoSortedLists.ListNode e3 = new MergeTwoSortedLists.ListNode(4);
        MergeTwoSortedLists.ListNode e2 = new MergeTwoSortedLists.ListNode(3, e3);
        MergeTwoSortedLists.ListNode e1 = new MergeTwoSortedLists.ListNode(1, e2);

        return e1;
    }

    MergeTwoSortedLists.ListNode expectedList() {
        // expectedList = [1,1,2,3,4,4]

        MergeTwoSortedLists.ListNode e6 = new MergeTwoSortedLists.ListNode(4);
        MergeTwoSortedLists.ListNode e5 = new MergeTwoSortedLists.ListNode(4, e6);
        MergeTwoSortedLists.ListNode e4 = new MergeTwoSortedLists.ListNode(3, e5);
        MergeTwoSortedLists.ListNode e3 = new MergeTwoSortedLists.ListNode(2, e4);
        MergeTwoSortedLists.ListNode e2 = new MergeTwoSortedLists.ListNode(1, e3);
        MergeTwoSortedLists.ListNode e1 = new MergeTwoSortedLists.ListNode(1, e2);

        return e1;
    }


}