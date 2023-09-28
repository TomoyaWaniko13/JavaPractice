package zyBooks.Loops_4;

import java.util.Scanner;

public class EvenIntegers {
    public static void main(String [] args) {
        Scanner scnr = new Scanner(System.in);
        int numIn;
        /* Additional variable declarations go here */
        boolean allEven = true;
        /* Your code goes here */
        numIn = scnr.nextInt();

        for(int i = 0; i < numIn; i++){
            numIn = scnr.nextInt();
            if (numIn % 2 != 0) {  // If the number is odd
                allEven = false;
                break;  // Exit the loop since we've found an odd number
            }
        }

        if (allEven) {
            System.out.println("All match");
        }
        else {
            System.out.println("Not all match");
        }
    }
}