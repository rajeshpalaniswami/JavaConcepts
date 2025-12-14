package com.daily.practice.collections;

public class Day3 {
//Write a program to reverse a string without using reverse ()
	public static void main(String[] args) {
		String givenStr = "IloveJava";
		String outStr = "";
		for (int i = givenStr.length() - 1; i >= 0; i--) {
			outStr = outStr + givenStr.charAt(i);
		}
		System.out.println(outStr);
	
	}

}
