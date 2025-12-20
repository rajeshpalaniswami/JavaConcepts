package com.daily.practice.collections;

import java.util.Scanner;

public class Dayo10 {
//Count the words in the given string 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String givenStr = scan.nextLine();
		String [] array = givenStr.split(" ");
		int length = array.length;
		
		System.out.println("The number of string present in the given string is >>"+length);

	}

}