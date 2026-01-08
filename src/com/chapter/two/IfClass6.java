package com.chapter.two;

import java.util.Arrays;
import java.util.Scanner;

public class IfClass6 {
//Check whether a number is divisible by both 3 and 5
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number which you want to check for divisible by both 3 and 5");
	int number = scan.nextInt();
	
	if(number%3==0&&number%5==0) {
		System.out.println("The given number is divisible by both 3 and 5, number >>>"+number);
	}else {
		System.out.println("The given number is not divisible by 3 and 5, number >>>"+number );
	}
	System.out.println("*********************************************************************************");
	//Input: { "one", "two", "three", "four", "five" }, 
	//Output: { "one", "owt", "three", "rouf", "five" }
	
	String [] array1 =  { "one", "two", "three", "four", "five" };
	
	for (int i=0;i<=array1.length-1;i++) {
		
		if(i % 2 != 0) {
			String temp = array1[i];
			String retemp = "";
			
			for (int j=temp.length()-1;j>=0;j--) {
				char c = temp.charAt(j);
				retemp +=c ;	
			}
			array1[i] = retemp;
		
	}
	}
	System.out.println(Arrays.toString(array1));
	
	}
	
}

 