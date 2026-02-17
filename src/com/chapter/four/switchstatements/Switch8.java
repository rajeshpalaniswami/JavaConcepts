package com.chapter.four.switchstatements;

import java.util.Scanner;

public class Switch8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		

        while (true) {
            System.out.println("Enter traffic light color (red/yellow/green) or X to exit:");

            String light = scan.next().toLowerCase();

            if (light.equals("x")) {
                System.out.println("Exiting...");
                break;
            }

            switch (light) {
                case "red":
                    System.out.println("stop");
                    break;

                case "yellow":
                    System.out.println("wait");
                    break;

                case "green":
                    System.out.println("go");
                    break;

                default:
                    System.out.println("Give valid input");
            }
        }

        scan.close();
	}

}
