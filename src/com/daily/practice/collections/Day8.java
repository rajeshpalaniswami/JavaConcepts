package com.daily.practice.collections;

public class Day8 {
//Remove the space in the given string 
	public static void main(String[] args) {
		String givenStr = "ilove java and i will learn 100%";
		String outputStr = "";
		for (int i = 0; i <= givenStr.length() - 1; i++) {
			char temp = givenStr.charAt(i);
			if (temp == ' ') {
				i++;
			} else {
				outputStr = outputStr + givenStr.charAt(i);
			}
		}
		System.out.println(outputStr);
	}

}



