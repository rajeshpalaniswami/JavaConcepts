package com.chapter.two;

import java.util.Scanner;

public class IfClass9 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the length - first side of the triangle");
		int a =scan.nextInt();
		System.out.println("Please enter the length - second side of the triangle");
		int b= scan.nextInt();
		System.out.println("Please enter the length - third side of the triangle");
		int c=scan.nextInt();
		
		
		if (a+b>c&&b+c>a&&c+a>b) {
			System.out.println("yes the given lenghts are valid for a triangle");
			
			if (a==b&&b==c&&c==a) {
				System.out.println("Based on the given sides it is a equilateral tringle");
			}else if (a==b||b==c||c==a) {
				System.out.println("Based on the given sides it is a isosceles tringle");
			}else {
				System.out.println("Based on the given sides it is a scalene tringle");
			}
			
		}else {
			System.out.println("No the given lenghts are not a valid for triangle");
		}
		scan.close();		
	}

}
