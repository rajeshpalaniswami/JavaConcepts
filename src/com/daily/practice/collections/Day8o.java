package com.daily.practice.collections;

public class Day8o {
//Replace the space with - in the given string 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String givenStr = "i love java and i will learn 100%";
		String outputStr = "";
		for (int i = 0; i <= givenStr.length() - 1; i++) {
			char temp = givenStr.charAt(i);
			if (temp == ' ') {
				outputStr = outputStr + '*';
			} else {
				outputStr = outputStr + givenStr.charAt(i);
			}
		}
		System.out.println(outputStr);
	}

}
