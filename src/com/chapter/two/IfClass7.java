package com.chapter.two;

import java.util.Scanner;

public class IfClass7 {
	//Check whether a number is a palindrome.

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number you want to check for palindrome:");
		int number = scan.nextInt();
		
		String toText = Integer.toString(number);
		String toText1 = "";
		for (int i=toText.length()-1;i>=0;i--) {
			
			toText1 = toText1+toText.charAt(i);
		}
		System.out.println(toText);
		System.out.println(toText1);
		if (toText.equals(toText1)) {
			System.out.println("Yes the given number is palindrome");
		}else {
			System.out.println("The given number is not a palindrome");
		}
		System.out.println("******************************************************************");
		int reverse =0 ;
		
		int digit = number%10;
		reverse = reverse *10+digit;
		number = number/10;
		
		if (reverse==number) {
			System.out.println("Yes the given number is palindrome");
		}else {
			System.out.println("The given number is not a palindrome");
		}	
		System.out.println("******************************************************************");
		
		int a =scan.nextInt();
		int b= scan.nextInt();
		int c=scan.nextInt();
		
		
		if (a+b>c&&b+c>a&&c+a>b) {
			System.out.println("true");
		}else {
			System.out.println("False");
		}
	}

}
