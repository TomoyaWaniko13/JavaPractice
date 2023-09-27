package zyBooks.Loops_4;

import java.util.Scanner;

public class NumCounts {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int dataValue;

        /* Your code goes here */
        while (scnr.hasNextInt()) {
            dataValue = scnr.nextInt();
            if (dataValue >= -5 && dataValue <= 35) {
                System.out.println(dataValue + " is valid");
            } else {
                System.out.println(dataValue + " is invalid");
            }
        }
    }
}