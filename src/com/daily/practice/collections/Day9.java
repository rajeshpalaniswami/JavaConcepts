package com.daily.practice.collections;

import java.util.Scanner;

public class Day9 {
//Find the longest word in a sentence
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String givenStr = scan.nextLine();
		String[] array = givenStr.split(" ");
		int longStr = 0;
		String longestStr = "";

		for (int i = 0; i <= array.length - 1; i++) {
			String temp = array[i];
			if (temp.length() > longStr) {
				longStr = temp.length();
				longestStr = temp;

			}

		}
		System.out.println("The longest word in the scentence is >> "+longestStr);
	
	}
}
