package com.daily.practice.collections;

import java.util.Scanner;

public class Day4o {
//Write a java program to reverse each word in the given string 
	public static void main(String[] args) {
		try (Scanner scan = new Scanner (System.in)) {
			String input = scan.nextLine();
			String output ="";
			String [] strArray = input.split(" ");
			for (int i=0;i<=strArray.length-1;i++) {
				String temp = strArray[i];
				String reverseWord ="";
				for (int j=temp.length()-1;j>=0;j--) {
					reverseWord = reverseWord+temp.charAt(j);
				}
				output = output+reverseWord +" ";
			}
			      System.out.println(output.trim());
		}
	}

}
