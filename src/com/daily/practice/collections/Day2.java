package com.daily.practice.collections;

public class Day2 {
//Write a java program to convert upper case to lower and vice versa
	//Input = HexAwarE OutPut = hEXaWARe
	public static void main(String[] args) {
		     
         String givenStr = "HexAwarE";
         String outStr = " ";
         
         for (int i=0;i<=givenStr.length()-1;i++) {
        	 char a = givenStr.charAt(i);
        	 if (Character.isUpperCase(a)) {
        		 outStr = outStr+Character.toLowerCase(a);
        	 }else {
        		 outStr = outStr+Character.toUpperCase(a);
        	 }
        	 
         }
         System.out.println(outStr);
         
	}

}
