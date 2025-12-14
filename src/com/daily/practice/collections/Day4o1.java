package com.daily.practice.collections;

public class Day4o1 {
//Find the sum of given int array {10,20,30,40,50,60,70,100}
	public static void main(String[] args) {

		int[] givenArray = { 10, 20, 30, 40, 50, 60, 70, 100 };
		int sum = 0;
		for (int i = 0; i < givenArray.length; i++) {
			sum = sum + givenArray[i];
		}
		System.out.println("The sum of given array is = " + sum);
// In the same case if average is asked then below is the answer
		double avg = (double) sum / givenArray.length;
		System.out.println("The average of the given array is " + avg);
	}

}
