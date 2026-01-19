package com.chapter.two;

import java.util.Scanner;

public class IfClassO12 {

	public static void main(String[] args) {
		//Divisible by 7” and “Multiple of 7” use the SAME condition
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number for which the digit need to verified");
		int number = scan.nextInt();

		if (number%7==0) {
			 System.out.println("Yes, the given number is a multiple and Divisible  of 7.");
		}else {
			  System.out.println("No, the given number is NOT a multiple and Divisible of 7.");
		}
		scan.close();
	}

}
