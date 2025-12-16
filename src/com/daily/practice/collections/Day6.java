package com.daily.practice.collections;

public class Day6 {
//Write a Java program to reverse the entire sentence.
	public static void main(String[] args) {
		String givenStr= "i am doing good";
		String [] arrayStr = givenStr.split(" ");
		String reverseStr = "";
		for (int i=arrayStr.length-1;i>=0;i--) {
			
			reverseStr=reverseStr+arrayStr[i]+" ";
		}
		System.out.println(reverseStr.trim());
	}

}
