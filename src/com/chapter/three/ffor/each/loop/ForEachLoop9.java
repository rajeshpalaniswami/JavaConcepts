package com.chapter.three.ffor.each.loop;

public class ForEachLoop9 {

	public static void main(String[] args) {
		// Count special characters in a string.
		
		String givenStr = "Raj%e@s&h";
		
		int SpCount =0;
		
		char [] array = givenStr.toCharArray();
		
		for (char e : array ) {
			if ((!Character.isLetterOrDigit(e))&& (e!=' ')) {
				SpCount++;
			}
		}
		
		System.out.println(SpCount);

	}

}
