package com.kulsin.miscellaneous;

import java.util.Scanner;

public class OddEvenSeparator {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int count = Integer.parseInt(scan.nextLine());
		String[] strings = new String[count];
		
		for (int i = 0; i < count; i++) {
			strings[i] = scan.nextLine();
		}
		
		for (String word : strings) {
			printOddEvenWords(word);
		}
	}
	
	static void printOddEvenWords(String word) {
		char[] wordChar = word.toCharArray();
		String odd = "";
		String even = "";
		for(int i = 0; i<wordChar.length;i++) {
			String c = String.valueOf(wordChar[i]);
			if(i%2==0) {
				even = even.concat(c);
			} else {
				odd = odd.concat(c);
			}
			
		}
		System.out.println(even+" "+odd);
	}
}
