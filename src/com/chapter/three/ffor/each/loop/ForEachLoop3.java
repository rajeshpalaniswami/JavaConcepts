package com.chapter.three.ffor.each.loop;

public class ForEachLoop3 {
//Print elements greater than a given number.
	public static void main(String[] args) {
		
		int [] givenArray = {10,50,23,77,89,12,13,14,5,45,67,89,100};
		int givenNumber = 00;
		boolean found = false;
		for(int number : givenArray) {
			if (number >givenNumber ) {
				System.out.println(number);
				found = true;
			}
			
		}
		
		if (!found) {
			System.out.println("No number found");
		}

	}

}
