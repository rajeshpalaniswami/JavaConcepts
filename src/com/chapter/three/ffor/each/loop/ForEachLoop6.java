package com.chapter.three.ffor.each.loop;

public class ForEachLoop6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String input = "Automation";
	        String reversed = "";
	        String reversed1 = "";
	        String reversed2 = "";
	        char[] chars = input.toCharArray();

	        for (char ch : chars) {
	            reversed = ch + reversed;
	        }

             System.out.println(reversed);
             
             for (int i=0;i<input.length();i++) {
            	 reversed1 = input.charAt(i)+ reversed1 ;
            	 reversed2 = reversed2 + input.charAt(i);
             }
             System.out.println( reversed1);
             System.out.println( reversed2);
	}

}
