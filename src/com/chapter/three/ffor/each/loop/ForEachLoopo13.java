package com.chapter.three.ffor.each.loop;

public class ForEachLoopo13 {

	public static void main(String[] args) {
		
		String giveStr = "Was it a rat I saw?".toLowerCase();
		String Forward = "";
		String backward = "";
		
		for (char a :giveStr.toCharArray() ) {
			if (Character.isAlphabetic(a)) {
				Forward  = Forward  + a;
				backward  = a+backward;
			}
		}
		
		if (backward.equals(Forward)) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}

	}

}
