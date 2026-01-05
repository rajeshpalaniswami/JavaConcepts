package com.chapter.two;

import java.util.Scanner;

public class IfClass2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	 System.out.println("Enter the number");
	 int number = scan.nextInt();
	 
	 if(number%5==0) {
		 System.out.println("Yes the given number is multiple of 5 and the number is "+number);
		 
	 }else {
		 System.out.println("No the given number is not a multiple of 5 and the number is "+number);
	 }

	}

}
