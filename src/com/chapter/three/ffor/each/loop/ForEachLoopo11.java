package com.chapter.three.ffor.each.loop;

public class ForEachLoopo11 {

	public static void main(String[] args) {
		//Find the second largest element in an array using for-each.
		
		int [] array = {100,200,500,-300};
		int first = array  [0];
		int second =0;
		
		for (int current : array) {
			if (current > first) {
				second = first;
				first = current;
			}else if (current > second && current != first) {
                second = current;
            }
		}
		System.out.println(second );
	}
	

}
