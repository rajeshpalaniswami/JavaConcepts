
package com.daily.practice.collections;

public class Dayo18 {
//Write a Java program to find the largest of three numbers.
	public static void main(String[] args) {
		int a = 10;
		int b = -20;
		int c = -30;
		int large;

		if (a>=b&&a>=c) {
			large = a;

		} else if ( b>=b&&b>=c) {
			large = b;
		} else {
			large = c;
		}

		System.out.println(large);
		
		int [] num = {10,20,30,10,100};
		int large1 = num[0];
		for (int i=0;i<num.length;i++) {
			if(large1<num[i]) {
				
				large1 = num[i];
			}
			
		}
		System.out.println(large1);
	}

}
