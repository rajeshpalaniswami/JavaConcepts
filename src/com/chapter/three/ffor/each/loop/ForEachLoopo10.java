package com.chapter.three.ffor.each.loop;

public class ForEachLoopo10 {

	public static void main(String[] args) {
		// Check whether an array is sorted.
		
		int [] array = {1,2,2,0,5,6,9};
		boolean isSorted = true;
		
		for(int i=0;i<array.length-1;i++) {
			
			if (array [i]>array[i+1]) {
				isSorted = false;
			break;
				
			}
		}
		
		if (isSorted) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		boolean isSorted1 = true;
		int previous = array[0];
		for (int current :array) {
			
			if( previous>current) {
				isSorted1 = false;
				break;
			}else {
				previous = current;
			}
			
		}
		if (isSorted1) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}

}
