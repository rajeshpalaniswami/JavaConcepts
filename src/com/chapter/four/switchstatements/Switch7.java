package com.chapter.four.switchstatements;

import java.util.Scanner;

public class Switch7 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);

	        while (true) {
	            System.out.println("Enter a character (X to exit): ");
	            char ch = scan.next().charAt(0);

	            if (ch == 'X' || ch == 'x') {
	                System.out.println("Exiting...");
	                break;
	            }

	            // Decide category code using Character methods
	            int type;

	            if (Character.isUpperCase(ch))
	                type = 1;
	            else if (Character.isLowerCase(ch))
	                type = 2;
	            else if (Character.isDigit(ch))
	                type = 3;
	            else
	                type = 4;

	            // Switch based on category
	            switch (type) {
	                case 1:
	                    System.out.println("Uppercase letter");
	                    break;
	                case 2:
	                    System.out.println("Lowercase letter");
	                    break;
	                case 3:
	                    System.out.println("Digit");
	                    break;
	                case 4:
	                    System.out.println("Symbol");
	                    break;
	            }
	        }

	        scan.close();
	    }
	}