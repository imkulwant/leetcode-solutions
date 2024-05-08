package com.kulsin.miscellaneous.hackerrank.datastructures.linkedlists;

class Node {
	int data;
	NodeObject next;

	Node(int d) {
		data = d;
		next = null;
	}
}

public class LinkedListBasics {

	public static NodeObject insert(NodeObject head, int data) {

		NodeObject n = new NodeObject(data);
		NodeObject itr = head;
		
		if (head == null) {
			return n;
		} else {
			while(true) {
				if(itr.next==null) {
					itr.next = n;
					return head;
				}
				itr = itr.next;
			}
		}
	}

	public static void display(NodeObject head) {
		NodeObject start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {

		NodeObject head = null;

		int[] arr = { 2, 3, 4, 1 };

		for (int i = 0; i < arr.length; i++) {
			int ele = arr[i];
			head = insert(head, ele);
		}

		display(head);
	}
}