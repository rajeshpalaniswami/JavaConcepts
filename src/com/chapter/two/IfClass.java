package com.chapter.two;

import java.util.Scanner;

public class IfClass {

	public static void main(String[] args) {

// Check whether a number is positive, negative, or zero.
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number");
		// int number = scan.nextInt();
		int number = 7;
		if (number == 0) {
			
			System.out.println("The given number is zero");
		} else if (number > 0) {
			System.out.println("The given numbse is Positive");
		} else {
			System.out.println("The given number is Negative");
		}
		System.out.println("****************************************************");
		
		// Check whether a number is even or odd.
		if (number % 2 == 0) {
			System.out.println("The given number is odd");
		} else {
			System.out.println("The given number is even");
		}
		System.out.println("****************************************************");
		
		// Check whether a given character is a vowel or consonant.
		System.out.println("Enter the char");
		String givenStr = scan.next();
		if (givenStr.length() == 1) {
			char a = givenStr.charAt(0);
			if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
				System.out.println("The given character is vowel");
			} else {
				System.out.println("The given character is consonant ");
			}
		} else {
			System.out.println("Please enter only Char ");
		}
		System.out.println("****************************************************");
		
		//Check whether a person is eligible to vote.
		System.out.println("Enter the age of the voter");
		int age = scan.nextInt();
		if (age>=18) {
			System.out.println("Eligable for the vote");
		}else {
			System.out.println("Not eligable for the vote");
		}
		System.out.println("****************************************************");
		
		// Find the largest of two numbers
		System.out.println("Enter the first number");
		int number1 = scan.nextInt();
		System.out.println("Enter the second number");
		int number2 = scan.nextInt();
		if (number1 > number2) {
			System.out.println("The first number is grater then second nuber");
		}else {
			System.out.println("The second number is grater then first nuber");
		}
	}

}
