package com.chapter.three.ffor.each.loop;

public class ForEachLoopo12 {

	public static void main(String[] args) {
		// Check whether a string is palindrome using for-each.
		
		String givenStr = "Mom".toLowerCase();
		String reStr = "";
		
		for (char a : givenStr.toCharArray()) {
			
			reStr = a+reStr ;
			
		}
System.out.println(reStr);

if (givenStr.equals(reStr)) {
	System.out.println("yes the given string is palindrome");
}else {
	System.out.println("No the given string is palindrome");
}
	}

}
