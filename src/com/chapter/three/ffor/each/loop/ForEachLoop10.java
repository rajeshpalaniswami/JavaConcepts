package com.chapter.three.ffor.each.loop;

public class ForEachLoop10 {

	public static void main(String[] args) {
		// Check whether an array is sorted.
		
		int [] array = {1,2,0,4,5,6,9};
		boolean value = false;
		
		for(int i=0;i<=array.length-1;i++) {
			
			for (int j=i+1;j<=array.length-1;j++) {
				
				if(array[i]>=array[j]) {
					System.out.println("false");
					break;
					
				}else {
					value = true;
				}
				
			}
		}
		
		if (value = true) {
			System.out.println("true");
		}
		

	}

}
