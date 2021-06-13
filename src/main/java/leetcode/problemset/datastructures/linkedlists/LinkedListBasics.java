package leetcode.problemset.datastructures.linkedlists;

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
}

public class LinkedListBasics {

	public static Node insert(Node head, int data) {

		Node n = new Node(data);
		Node itr = head;
		
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

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {

		Node head = null;

		int[] arr = { 2, 3, 4, 1 };

		for (int i = 0; i < arr.length; i++) {
			int ele = arr[i];
			head = insert(head, ele);
		}

		display(head);
	}
}