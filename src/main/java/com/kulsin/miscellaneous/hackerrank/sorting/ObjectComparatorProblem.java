package com.kulsin.miscellaneous.hackerrank.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Player {
	String name;
	int score;

	Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
}

class Checker implements Comparator<Player> {
	// complete this method
	public int compare(Player a, Player b) {

		int retVal = 0;

		char[] aName = a.name.toCharArray();
		char[] bName = b.name.toCharArray();

		int len = aName.length;
		if (aName.length > bName.length) {
			len = bName.length;
		}

		// descending sort by score
		if (a.score < b.score) {
			retVal = 1;
		} else if (a.score > b.score) {
			retVal = -1;
		} else {
			// ascending sort by name
			for (int i = 0; i < len; i++) {
				retVal = Character.compare(aName[i], bName[i]);

				if (!(retVal == 0)) {
					return retVal;
				}
			}

			if (!(aName.length == bName.length)) {
				if (aName.length > bName.length) {
					return 1;
				} else {
					return -1;
				}
			}
		}
		return retVal;
	}
}

public class ObjectComparatorProblem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		Player[] player = new Player[n];
		Checker checker = new Checker();

		for (int i = 0; i < n; i++) {
			player[i] = new Player(scan.next(), scan.nextInt());
		}
		scan.close();

		Arrays.sort(player, checker);
		for (int i = 0; i < player.length; i++) {
			System.out.printf("%s %s\n", player[i].name, player[i].score);
		}

	}
}