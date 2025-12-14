package com.daily.practice.collections;

public class Day2o {
//Find the second largest number in the array 
	// Given array {22,24,56,78,90,56,78,13,45,77}
	public static void main(String[] args) {
		int [] givenArray = {22, 24, 56, 8, 90, 56};
		//Arrays.sort(givenArray);
		//System.out.println(givenArray);
		//System.out.println(givenArray.length-2);
		
		int firstLargest = givenArray[0];
		int secondLargest = 0 ;
		
		for(int i =0;i<=givenArray.length-1;i++) {
			if (givenArray[i]>firstLargest) {
				secondLargest = firstLargest;
				firstLargest = givenArray[i];
			}
		}
		System.out.println(secondLargest);
				
	}

}
