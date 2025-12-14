package com.daily.practice.collections;

public class Day1 {
	
	//Problem 1
	//Write a program to fin the index of an two elements whose sum is equal to the target 
	//Given array {6,8,11,6,7,18} and the given target is equal to 17

	public static void main(String[] args) {
		
		int [] givenArray = {6,8,11,6,7,18};
		int sum = 17;
		
		for (int i=0;i<=givenArray.length-1;i++) {
			for(int j=i+1;j<=givenArray.length-1;j++) {
				
				if(givenArray[i]+givenArray[j]==sum) {
					
					System.out.println("The target element is "+i+"th and "+j+"th.");
				}
			}
		}

	}

}
