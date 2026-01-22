package com.chapter.three.ffor.each.loop;

public class ForEachLoop4 {

	public static void main(String[] args) {
		//Remove all spaces from a string using for-each.
		
		String givenStr = "I will do it 100%";
		String [] strArray = givenStr.split(" ");
		for (String text : strArray) {
			System.out.print(text);
		}
		

	}

}
