package com.in.leet.linkedlist;

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}

}

public class LinkedListDuplicateRemoval {

	public static Node removeDuplicates(Node head) {

		if (head == null || head.next == null) {
			return head;
		}
		if (head.data == head.next.data) {
			head.next = head.next.next;
			removeDuplicates(head);
		} else {
			removeDuplicates(head.next);
		}
		return head;
	}

	public static Node insert(Node head, int data) {
		Node p = new Node(data);
		if (head == null)
			head = p;
		else if (head.next == null)
			head.next = p;
		else {
			Node start = head;
			while (start.next != null)
				start = start.next;
			start.next = p;

		}
		return head;
	}

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {

		int[] nums = { 1, 1, 1, 1, 1, 1, 1 };
		Node head = null;

		for (int i = 0; i < nums.length; i++) {
			int ele = nums[i];
			head = insert(head, ele);
		}

		head = removeDuplicates(head);
		display(head);

	}
}