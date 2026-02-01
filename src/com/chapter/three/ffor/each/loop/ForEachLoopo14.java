package com.chapter.three.ffor.each.loop;

public class ForEachLoopo14 {

	public static void main(String[] args) {
		// Find the second smallest element in an array using for-each.
		
		int [] array = {10,2,3,4,56,91,0};
		
		int firstSmall = Integer.MAX_VALUE;
		int secondSmall = Integer.MAX_VALUE;
		
		for (int current:array) {
			if (current<firstSmall) {
				 secondSmall = firstSmall;
				 firstSmall = current;
			}else if ((secondSmall < firstSmall)&&(secondSmall!=firstSmall)) {
				secondSmall = current;
			}
		}
		
		System.out.println(secondSmall);
	}

}
