package com.daily.practice.collections;

import java.util.Scanner;

public class Dayo10o {
// Write the table for the given int
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int givenNum = scan.nextInt();
		
		System.out.println("The given number is "+givenNum);
		System.out.println("Tables for the given number given below ");
		for(int i=1;i<=10;i++) {
			System.out.println(givenNum+"*"+i+"="+givenNum*i);
		}
		

	}

}
