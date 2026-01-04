package com.chapter.two;

import java.util.Scanner;

public class IfClass3 {
//Check whether a character is an alphabet, digit, or special character.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String givenStr = scan.next();
		char ca = givenStr.charAt(0);
if (givenStr.length()==1) {
	//char ca = givenStr.charAt(0);
		if (Character.isDigit(ca)) {
			System.out.println("The given character is a digit = "+ca);
		} else if (Character.isLetter(ca)) {
			System.out.println("The given character is a alphabet = "+ca);
		} else {
			System.out.println("The given character is a special character = "+ca);
		}
	}else {
		System.out.println("Please enter the single character = "+givenStr);
	}
		
	}
}
