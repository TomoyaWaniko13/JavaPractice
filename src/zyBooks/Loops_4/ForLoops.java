package zyBooks.Loops_4;

import java.util.Scanner;

public class ForLoops {
    public static void main (String [] args) {
        int countNum;
        int i;

        Scanner input = new Scanner(System.in);
        countNum = input.nextInt();

        /* Your code goes here */
        for(i = countNum; i >= 1; i--){
            if(i > 0 &&i == countNum){
                System.out.println("Ready!");
            }

            System.out.println(i);

            if(i == 1){
                System.out.println("Blastoff!");
            }
        }
    }
}