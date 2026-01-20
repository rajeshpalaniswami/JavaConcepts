package com.chapter.three.ffor.each.loop;

public class ForEachLoop2 {

	//Count how many times a given element appears in an array.
	public static void main(String[] args) {
		String givenStr = "i love java i will learn it 100% for sure i will learn it";
		String [] array = givenStr.split(" ");
		String repeatStr = "i";
		int count = 0;
		
		for (String repeat:array) {
			if (repeat.equals(repeatStr)) {
				count++;
			}
		}
		System.out.println(count);
		
		

	}

}
