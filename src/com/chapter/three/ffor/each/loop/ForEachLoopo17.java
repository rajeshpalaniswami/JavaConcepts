package com.chapter.three.ffor.each.loop;

public class ForEachLoopo17 {

	public static void main(String[] args) {
		// Find the third largest element without sorting
		
		int [] array = {500,400,300};
		
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		
		for (int current:array) {
			if (current>first) {
				third = second;
				second = first;
				first = current;
			}else if((current > second)&& (current != first)) {
				third = second;
				second = current;
				
			}else if((current > third) && (current != first) && (current != second)) {
				third = current;
			}
		}
		System.out.println(third);
	}

}
