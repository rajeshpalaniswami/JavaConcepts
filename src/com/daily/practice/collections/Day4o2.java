package com.daily.practice.collections;

public class Day4o2 {
//given input = "My name is so and so"
	// expected output = "My-name-is-so-and-so"
	public static void main(String[] args) {

		String givenStr = "My name is so and so";
		for (int i = 0; i < givenStr.length(); i++) {

			if (givenStr.charAt(i) == ' ') {
				System.out.print("-");
			} else {
				System.out.print(givenStr.charAt(i));
			}
		}

	}

}
