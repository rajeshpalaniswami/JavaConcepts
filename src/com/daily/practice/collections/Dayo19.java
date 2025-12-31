package com.daily.practice.collections;

public class Dayo19 {
// write a program to remove the given character in the string 
	
	public static void main(String[] args) {
	String givenStr = "My name is rajesh";
			
			for (int i=0;i<givenStr.length();i++) {
				char a = givenStr.charAt(i);
				if(a!='a') {
					System.out.print(a);
				}
			}

	}

}
