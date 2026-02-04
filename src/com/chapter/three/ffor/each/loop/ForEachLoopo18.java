package com.chapter.three.ffor.each.loop;

public class ForEachLoopo18 {

	public static void main(String[] args) {
		// Print all elements greater than the average value
		
		int []array = {100,2,3,4,5,67,7,8,9,0};
		int sum =0;
		 for (int num : array) {
			 sum += num;
		 }
		double average = (double)sum/array.length;
		System.out.println(average);
		
	int temp = 0;
		
		 for (int num : array) {
		if (num > average) {
			System.out.println(num);
			temp++;
		}
		 }
		 
		 if (temp ==0) {
			 System.out.println("There is no grater element in the array which is grater than average");
		 }

	}

}
