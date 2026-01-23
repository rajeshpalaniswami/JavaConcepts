package com.chapter.three.ffor.each.loop;

public class ForEachLoop5 {

	public static void main(String[] args) {
		// Print only uppercase characters from a string.
		
		String givenStr = "RaJeSh";
		 char[] chars = givenStr.toCharArray();
		
		for (char a : chars) {
			if (Character.isUpperCase(a)) {
				System.out.print(a);
				
			}
			
			
			
		}

	}

}
