package com.chapter.three.ffor.each.loop;

public class ForEachLoopo15 {

	public static void main(String[] args) {
		// Print first duplicate elements from an array.
		
		int [] array = {1,2,3,4,5,5,4,3,2,10};
		
		/*
		 * for (int i=0;i<array.length;i++) { //boolean firstDuplicate = false; for (int
		 * j=i+1;j<array.length;j++) {
		 * 
		 * if ((array[i]==array[j])) {
		 * System.out.println("The frist douplicate element in the given array is "
		 * +array[i]); return; }
		 * 
		 * }
		 * 
		 * }
		 */
		
		for (int i=0;i<array.length;i++) {
			boolean firstDuplicate = false;
			for (int j=i+1;j<array.length;j++) {
			
				if ((array[i]==array[j])) {
					System.out.println("The frist douplicate element in the given array is "+array[i]);
					firstDuplicate = true;
					break;
				}
				
				}
			if (firstDuplicate)
			{
				break;
			}
			}
		
		
		
			}
		}


