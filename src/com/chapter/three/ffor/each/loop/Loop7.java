package com.chapter.three.ffor.each.loop;

public class Loop7 {

	public static void main(String[] args) {
		//Check whether string B is a substring of string A.
		String A= "Rajesh";
		String B = "jes";
		int count =0;
		for (int i=0;i<A.length();i++) {
			for (int j=0;j<B.length();j++) {
				char a = A.charAt(i);
				char b =B.charAt(j);
				if(a==b) {
					count++;
				}
				
			}
		}
		
		if (B.length()==count) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
		
		
		if (A.contains(B)) {
			System.out.println("yes1");
		}else {
			System.out.println("No1");
		}	
		
	}

}
