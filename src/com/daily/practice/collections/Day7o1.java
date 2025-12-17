package com.daily.practice.collections;

public class Day7o1 {
//Count occurrence of a specific character in a string
	public static void main(String[] args) {
		String givenStr = "jAva";
		givenStr= givenStr.toLowerCase();
		int countOfa = 0;
		
		for (int i=0;i<=givenStr.length()-1;i++) {
			char a = givenStr.charAt(i);
			
				if (a=='a') {
					countOfa = countOfa+1;
					
				}
			}
		System.out.println("The count of a is "+countOfa);	
		}
		

	}


