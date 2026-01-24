package com.chapter.three.ffor.each.loop;

public class ForEachLoop6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String input = "Automation";
	        String reversed = "";

	        char[] chars = input.toCharArray();

	        for (char ch : chars) {
	            reversed = ch + reversed;
	        }

System.out.println(reversed);
	}

}
