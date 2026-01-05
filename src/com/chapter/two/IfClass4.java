package com.chapter.two;

import java.util.Scanner;

public class IfClass4 {
	//Check whether a number is a 3-digit number.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int a =scan.nextInt();
		String b = Integer.toString(a) ;
		
			int c = b.length();
			if (c==3) {
				System.out.println("Yes the given mumber is three digit number and number is "+a);	
			}else {
				System.out.println("The given number is not a three digit number and the number is "+a+", the digit of the given number is "+c);
			}
		
		
		
// when we need try to use math-based logic
		
		if (a >= 100 && a <= 999 || a <= -100 && a >= -999) {
		    System.out.println("Yes, the given number is a 3-digit number: " + a);
		} else {
		    System.out.println("No, the given number is not a 3-digit number: " + a);
		}
	}

}
