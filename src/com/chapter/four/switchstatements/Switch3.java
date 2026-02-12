package com.chapter.four.switchstatements;

import java.util.Scanner;

public class Switch3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char a = scan.next().charAt(0);

		while (!Character.isAlphabetic(a)) {
		    System.out.println("Enter only a character");
		    a = scan.next().charAt(0);
		}

		a = Character.toLowerCase(a);

		switch (a) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		    System.out.println(a + " is a vowel");
		    break;
		default:
		    System.out.println(a + " is a consonant");
		}

		scan.close();

	}

}
