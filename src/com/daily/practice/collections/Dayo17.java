package com.daily.practice.collections;

import java.util.Arrays;

public class Dayo17 {
//Input = Cat catches a calendar
	// Output =  a cat catches a calendar
	public static void main(String[] args) {
		String inputStr = "Cat catches a calendar";
		inputStr = inputStr.toLowerCase();
		String [] array = inputStr.split(" ");
		 Arrays.sort(array);
		 for (int i=0;i<array.length;i++) {
			 System.out.print(array[i]+" ");
		 }
	}

}
