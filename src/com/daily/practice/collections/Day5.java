package com.daily.practice.collections;

public class Day5 {
	//Write a Java program to extract the first half of a even string.
	//Test Data: Python
	//Sample Output:pyt
	public static void main(String[] args) {
		String givenStr = "Python";
		int temp = givenStr.length()/2;
		System.out.println(temp);
		System.out.println("First half of the given even string");
		for (int i=0;i<temp;i++) {
			System.out.println(givenStr.charAt(i));
		}
		System.out.println("Second half of the given even string in reverse order");
		for (int j=givenStr.length()-1;j>=temp;j--) {
			System.out.println(givenStr.charAt(j));
		}
		
		System.out.println("Second half of the given even string in the stright order");
		for (int i=temp;i<=givenStr.length()-1;i++) {
			System.out.println(givenStr.charAt(i));
		}
	}
}
