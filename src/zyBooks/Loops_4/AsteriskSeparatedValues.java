package zyBooks.Loops_4;

import java.util.Scanner;

public class AsteriskSeparatedValues {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numInput;

        /* Your code goes here */
        int value;

        numInput = scnr.nextInt();
        String s = "";
        for (int i = 0; i < numInput; i++) {
            value = scnr.nextInt();

            System.out.print(value);

            //except the last iteration
            if (i != numInput - 1) {
                System.out.print("*");
            }
        }

        System.out.println();
    }
}
