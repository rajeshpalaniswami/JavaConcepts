package com.chapter.two;

import java.util.Scanner;

public class IfClassO10 {

	public static void main(String[] args) {
		//Check whether a number is greater than 100.
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number which you want to verify for grater than 100");
		int number = scan.nextInt();
		
		if(number >=100) {
			System.out.println("Yes the given number is grater than 100 and the number is >>>"+number);
		}else {
			System.out.println("No the given number is grater than 100 and the number is >>>"+number);
		}
		
scan.close();
	}

}
