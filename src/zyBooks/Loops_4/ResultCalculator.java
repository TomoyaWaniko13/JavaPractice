package zyBooks.Loops_4;

import java.util.Scanner;

import java.util.Scanner;

public class ResultCalculator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userInput;
        int result;

        result = 0;
        userInput = scnr.nextInt();

        /* Your code goes here */
        while(userInput > 0){
            if(userInput % 3 == 0){
                System.out.println("lose");
            }else{
                System.out.println("win");
                result++;
            }
        }

        System.out.println("Result is " + result);
    }
}