package com.chapter.three.ffor.each.loop;

public class ForEachLoop8 {

	public static void main(String[] args) {
	// Count digits in a string.
		
		String givenStr = "R1a2j3e4s5h6 )*";
		int digitCount =0;
		
		char [] array =  givenStr.toCharArray();
		
		for (char w:array) {
			if (Character.isDigit(w)) {
				digitCount++;
			}
		}
		
		System.out.println(digitCount);
	}

}
