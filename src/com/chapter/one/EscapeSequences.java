package com.chapter.one;

public class EscapeSequences {

	public static void main(String[] args) {
		
		System.out.println("Hello world");
		System.out.println("Hello \t world");
		System.out.println("Hello\b\bworld\b");
		System.out.println("Hello \n world");
		System.out.println("Hello \r world");
		System.out.println("Hello \f world");
		System.out.println("Error\b\b\bPass");
		
		System.out.println("********************************************");
		//New Line (MOST USED) Moves cursor to the next line
		System.out.println("Login Passed\nLogout Passed");
		System.out.println("********************************************");
		//Tab Space Adds horizontal spacing
		System.out.println("TestCase\tStatus");
		System.out.println("TC_01\tPASS");
		System.out.println("********************************************");
		//Double Quote Allows double quotes inside strings
		System.out.println("User clicked on \"Login\" button");
		System.out.println("********************************************");
		//Backslash Prints a single backslash
		System.out.println("C:\\Users\\QA\\Reports");
		System.out .println("********************************************");
		//Carriage Return Moves cursor to start of same line
		System.out.print("Loading...");
		System.out.print("\rDone");
		System.out.println("********************************************");
		//Backspace Removes one character
		System.out.println("Error\b\b\bPass");
		System.out.println("********************************************");
		//Form Feed (INTERVIEW TRAP) Page break / next page
		System.out.println("Header\fBody");
		System.out.println("********************************************");
		//Single Quote
		char c = '\'';
		System.out.println(c);
		System.out.println("********************************************");
		//Unicode Character
		System.out.println("\u20B9");
	}

}
