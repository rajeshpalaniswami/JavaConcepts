package com.daily.practice.collections;

import java.util.Scanner;

public class Day4 {
	//find the largest of two numbers 
	public static void main(String[] args) {
	int a = 121;
	int b = 1500; 
	
	if (a>b) {
		System.out.println("The largest number among a and b is a = "+a);
	}else {
		System.out.println("The largest number among a and b is b = "+b);
	}
	
	try (Scanner scan = new Scanner (System.in)) {
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		if (c>d) {
			System.out.println("The largest number among c and d is c = "+c);
		}else {
			System.out.println("The largest number among c and d is d = "+d);
		}
	}
	
	

	}

}
