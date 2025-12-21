package com.daily.practice.collections;

import java.util.Scanner;

public class Dayo11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the value of a");
		int a = scan.nextInt();
		System.out.println("Enter the value of b");
		int b = scan.nextInt();
		
		System.out.println("The entered value of a is = "+a);
		System.out.println("The entered value of b is = "+b);
		
		a= a+b;
		b=a-b;
		a=a-b;
		System.out.println("The new value of a is ="+a);
		System.out.println("The new value of b is ="+b);
	}

}
