package com.chapter.two;

import java.util.Scanner;

public class Ifclass8 {

	public static void main(String[] args) {
		//Find profit or loss based on cost price and selling price.
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the value of cost prise");
		int costPrise = scan.nextInt();
		System.out.println("Enter the value of selling prise");
		int sellingPrise = scan.nextInt();
		System.out.println("Enter your option profit/loss");
		String option = scan.next();
		
		if (costPrise <sellingPrise ) {
			System.out.println("yes you are in profit");
		}else {
			System.out.println("Sorry your are in loss");
		}
		

	}

}

