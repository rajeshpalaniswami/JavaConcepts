package com.chapter.four.switchstatements;

import java.util.Scanner;

public class Switch4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		char grade = scan.next().charAt(0);
		grade = Character.toUpperCase(grade);

		if (Character.isAlphabetic(grade)) {
			switch (grade) {
			case 'A':
				System.out.println("Excelent");
				break;
			case 'B':
				System.out.println("Good");
				break;
			case 'C':
				System.out.println("Average");
				break;
			case 'D':
				System.out.println("Pass");
				break;
			case 'F':
				System.out.println("Fail");
				break;
			default:
				System.out.println("Please enter the currect grade");
				break;
			}
		}

	}

}
