package com.daily.practice.collections;

public class Day7 {
//Check if a string is a palindrome
	public static void main(String[] args) {
		String givenStr = "mom";
		String reverseStr = "";
		
		for (int i=givenStr.length()-1;i>=0;i--) {
			reverseStr = reverseStr +givenStr.charAt(i);
		}
          if (givenStr.equals(reverseStr)) {
        	  System.out.println("The Given string is palindrome");
          }else {
        	  System.out.println("The Given string is not a palindrome");
          }
	}

}
