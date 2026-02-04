package com.chapter.three.ffor.each.loop;

public class ForEachLoopo16 {

	public static void main(String[] args) {
		// Print non duplicate elements from an array.
		int [] array = {1,2,3,4,5,5,4,3,2,10};
		
		for (int a : array) {
			int count =0;
			for (int b:array) {
				if (a==b) {
					count++;
				}
			}
			if (count==1) {
				System.out.println(a);
				
			}
		}
		

	}

}
