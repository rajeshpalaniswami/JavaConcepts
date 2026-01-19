package com.chapter.three.ffor.each.loop;

public class ForEachLoop1 {

	public static void main(String[] args) {
		// 1.Print all elements of an integer array using for-each.
		int [] intarray = {1,2,3,4,5,6,7,8,9};
		for(int num:intarray) {
			System.out.println(num);
		}
		
		// 2.Print all elements of a string array using for-each.
		String [] strArray = {"Raj","Mom","Faf","Sas"};
		for (String word :strArray ) {
			System.out.println(word);
		}
		
		// 3.Find the sum of all elements in an integer array using for-each
		int [] intarray1 = {1,2,3,4,5,6,7,8,9};
		int sum =0;
		for (int number :intarray1 ) {
			sum += number;
		}
		System.out.println(sum);
		
		//4.Count how many elements are present in an array using for-each.
		String [] strArray1 = {"Raj","Mom","Faf","Sas"};
		 int elementCount = 0 ;
		 for (String strArray12 : strArray1) {
			 elementCount ++;
		 }
		 System.out.println(elementCount);
		 
		 //5.Find the average of array elements.
		 int [] intarray2 = {1,2,3,4,5,6,7,8,9};
		 int sum1 =0;
			for (int number :intarray2 ) {
				sum1 += number;
			}
			double average = (double)sum1/intarray2.length;
			System.out.println(average);

	}

}
