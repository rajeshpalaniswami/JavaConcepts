package com.daily.practice.collections;

import java.util.Scanner;

public class Dayo12 {
//Count Vowels in a  given String
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		String givenStr =  scan.nextLine();
		givenStr = givenStr.toLowerCase(); 
		int vowelsCount = 0 ;
		
		for (int i=0;i<=givenStr.length()-1;i++) {
			char g = givenStr.charAt(i);
			if (g=='a'||g=='e'||g=='i'||g=='o'||g=='u') {
				 vowelsCount++;
			}
		}
		System.out.println( vowelsCount);
		
		
		
	}

}
