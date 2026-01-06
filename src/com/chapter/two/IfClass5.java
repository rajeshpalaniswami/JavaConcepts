package com.chapter.two;

import java.util.Scanner;

public class IfClass5 {
// Calculate grade based on marks: 
	//≥ 90 → A
	//≥ 75 → B
	//≥ 60 → C
	//Else → Fail
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the student mark to know the grade");
		int mark = scan.nextInt();
		
		if (mark>=90) {
			System.out.println("The grade for the given mark is A >>> "+mark);
		}else if(mark>=75) {
			System.out.println("The grade for the given mark is B >>> "+mark);
		}else if(mark>=60) {
			System.out.println("The grade for the given mark is C >>> "+mark);
		}else {
			System.out.println("The grade for the given mark is Fail >>> "+mark);
		}
		
		
		
		System.out.println("****************************************************************");
		//Check whether a character is uppercase or lowercase.
		
		String givenstr = scan.next();
	if (givenstr.length()==1) {
		char a = givenstr.charAt(0);
		if (Character.isUpperCase(a)) {
			System.out.println("The given character is in uppercase");
		}else if (Character.isLowerCase(a)) {
			System.out.println("The given character is in lowercase");
		}else {
			System.out.println("The given character is not a letter");
		}
	}else {
		System.out.println("Please enter the valid character");
	}

	}

}
