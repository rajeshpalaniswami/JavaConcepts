package com.chapter.two;

import java.util.Scanner;

public class Ifclass8 {

	public static void main(String[] args) {

        // Find profit or loss based on cost price and selling price.
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the value of Cost Price:");
        int costPrice = scan.nextInt();

        System.out.println("Enter the value of Selling Price:");
        int sellingPrice = scan.nextInt();

        if (sellingPrice > costPrice) {
            System.out.println("You are in Profit");
        } 
        else if (sellingPrice < costPrice) {
            System.out.println("You are in Loss");
        } 
        else {
            System.out.println("No Profit and No Loss");
        }

        scan.close();
        
    }
}

