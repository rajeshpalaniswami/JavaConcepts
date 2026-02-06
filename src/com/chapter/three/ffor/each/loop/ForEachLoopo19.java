package com.chapter.three.ffor.each.loop;

public class ForEachLoopo19 {

	public static void main(String[] args) {
		// Find common elements between two arrays.
		
		int [] array1 = {1,2,3,4,5};
		int [] array2 = {2,5,0,6,7};
		
		for (int a : array1) {
			for (int b:array2) {
				if (a==b) {
					System.out.println(a);
					
				}
			}
		}
		

	}

}
