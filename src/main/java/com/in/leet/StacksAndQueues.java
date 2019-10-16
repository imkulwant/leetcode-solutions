package com.in.leet;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class StacksAndQueues {
	// Write your code here.
	private Stack<Character> stackvar;
	private Queue<Character> queueVar;

    StacksAndQueues() {
        this.stackvar = new Stack<Character>();
        this.queueVar = new LinkedList<>();
    }
	
	void pushCharacter(char c) {
		this.stackvar.add(c);
	}

	void enqueueCharacter(char c) {
		this.queueVar.add(c);
	}

	private char dequeueCharacter() {
		return this.queueVar.poll();
	}

	private char popCharacter() {
		return this.stackvar.pop();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();

		// Convert input String to an array of characters:
		char[] s = input.toCharArray();

		// Create a Solution object:
		StacksAndQueues p = new StacksAndQueues();

		// Enqueue/Push all chars to their respective data structures:
		for (char c : s) {
			p.pushCharacter(c);
			p.enqueueCharacter(c);
		}

		// Pop/Dequeue the chars at the head of both data structures and compare them:
		boolean isPalindrome = true;
		for (int i = 0; i < s.length / 2; i++) {
			if (p.popCharacter() != p.dequeueCharacter()) {
				isPalindrome = false;
				break;
			}
		}

		// Finally, print whether string s is palindrome or not.
		System.out.println("The word, " + input + ", is " + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
	}
}