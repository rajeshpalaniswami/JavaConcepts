package com.daily.practice.collections;

public class Day6o {
	/*
	 * Write a Java program for the given string transformation: Input: tomorrow
	 * Output: t3m3223w
	 */

	public static void main(String[] args) {
		String givenStr = "tomorrow";
		String outputStr = "";

		for (int i = 0; i < givenStr.length(); i++) {
			char m = givenStr.charAt(i);
			if (m == 'o') {
				outputStr = outputStr + '3';
			} else if (m == 'r') {
				outputStr = outputStr + '2';
			} else {
				outputStr = outputStr + givenStr.charAt(i);
			}

		}
		System.out.println(outputStr);
	}

}
