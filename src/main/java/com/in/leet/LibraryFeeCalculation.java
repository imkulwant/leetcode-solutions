package com.in.leet;

public class LibraryFeeCalculation {
	public static void main(String[] args) {
		String r = "31 12 2009";
		String e = "1 1 2010";

		String[] rarr = r.split(" ");
		String[] earr = e.split(" ");

		int returnYear = Integer.parseInt(rarr[2]);
		int returnMonth = Integer.parseInt(rarr[1]);
		int returnDay = Integer.parseInt(rarr[0]);

		int expectedYear = Integer.parseInt(earr[2]);
		int expectedMonth = Integer.parseInt(earr[1]);
		int expectedDay = Integer.parseInt(earr[0]);

		if (returnYear > expectedYear) {
			System.out.println("10000");
		} else if (returnYear == expectedYear) {
			if (returnMonth > expectedMonth) {
				System.out.println(500 * (returnMonth - expectedMonth));
			} else if (returnDay > expectedDay) {
				System.out.println(15 * (returnDay - expectedDay));
			} else {
				System.out.println(0);
			}
		} else if (returnYear < expectedYear) {
			System.out.println(0);
		}
	}
}
