package com.chapter.two;

import java.util.Scanner;

public class IfClassO11 {

	public static void main(String[] args) {
		//Check whether a number is two-digit or not.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number for which the digit need to verified");
		int number = scan.nextInt();
		String givenNumber = Integer.toString(number);

		if (givenNumber.length() == 2) {
			System.out.println("Yes the given number is two digit number");
		} else {
			System.out.println("The given number is not a two digit number");
		}

		if((number >= 10 && number <= 99) || (number <= -10 && number >= -99)){
			System.out.println("Yes the given number is two digit number");
		} else {
			System.out.println("The given number is not a two digit number");
		}
		scan.close();
	}
	
}

