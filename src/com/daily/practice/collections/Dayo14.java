package com.daily.practice.collections;

public class Dayo14 {
	public static void main(String[] args) {
		String givenStr = "Rajesh";
		String givenStr1 = "Rajesh";
			System.out.println( givenStr== givenStr1);
			System.out.println( givenStr.equals(givenStr1));
			
			String a = "abc";
			String b = "def";
			String c= "";
			
			for (int i=0;i<b.length();i++) {
				
					c = c+ a.charAt(i)+b.charAt(i);
				
			}
			System.out.println(c);
	}

}
