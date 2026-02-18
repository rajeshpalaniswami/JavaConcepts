package com.chapter.four.switchstatements;

import java.util.Scanner;

public class Switch9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		while (true) {
			String driverName = scan.next();
			
			if (driverName.equalsIgnoreCase("stop")) {
				 System.out.println("Exiting...");
	                break;
			}
			
			if ((driverName.equalsIgnoreCase("chrome"))||(driverName.equalsIgnoreCase("firefox"))||(driverName.equalsIgnoreCase("edge")) ){
				switch (driverName) {
				case "chrome" : System.out.println("chrome driver");
				break;
				case "firefox": System.out.println("Firefox driver");
				break ;
				case "edge" :System.out.println("edge driver");
				break;
				default : System.out.println("Nothing");
				break;
				
				}
			}else {
				System.out.println("enter the right driver name");
			}
		}
	}

}
