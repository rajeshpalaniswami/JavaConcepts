package com.daily.practice.collections;

public class Dayo15 {
// If a string is longer than the other, append the additional letters onto the end of the merged string.
	public static void main(String[] args) {
		String a ="abcd";
		String b = "efghij";
		
		String c ="";
		
		int minLength = Math.min(a.length(), b.length());
		
		for (int i=0;i<minLength;i++) {
			c = c+a.charAt(i)+b.charAt(i);
		}
		
		System.out.println(c);
		
		if (minLength>a.length()) {
			c = c+ a.substring(minLength);
		}else {
			c +=  b.substring(minLength);	
		}
		
		System.out.println(c);

	}

}
