package com.chapter.four.switchstatements;

import java.util.Scanner;

public class Switch7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		char a = scan.next().charAt(0);
		
		switch (a){
		
		case Character.UPPERCASE_LETTER :System.out.println("given letter is upper case");
		break;
			
		}

	}

}
