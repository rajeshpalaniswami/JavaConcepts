package com.daily.practice.collections;

public class Day7o {
	//Check if a string is a palindrome
	public static void main(String[] args) {
		String givenStr = "M1o-mm";
		givenStr = givenStr.toLowerCase();
		String onlyChar = "";
		String reverseStr = "";
		
		for (int i=0;i<=givenStr.length()-1;i++) {
			char q = givenStr.charAt(i);
			if(q>='a'&&q<='z') {
				onlyChar = onlyChar+givenStr.charAt(i);
			}
		}
		
		for(int j=onlyChar.length()-1;j>=0;j--) {
			reverseStr= reverseStr+onlyChar.charAt(j);
		}
		
		if(onlyChar.equals(reverseStr)) {
			System.out.println("The given string is palindrome");
		}else {
			System.out.println("The given string is not a palindrome");
		}

	}

}
