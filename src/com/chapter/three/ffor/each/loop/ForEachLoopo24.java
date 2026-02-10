package com.chapter.three.ffor.each.loop;

public class ForEachLoopo24 {

	public static void main(String[] args) {
		// Find the smallest number in the array.
		
		int [] array ={1,2,3,4,5,0,6};
		int small = array[0];
		for (int q: array){
			if (q<small) {
				small = q;}
			}
		System.out.println(small);

	}

}
