package zyBooks.Loops_4;

import java.util.Scanner;

//4.7.1 Nested loop
//Integers firstNum and secondNum are read from input. \
// For each number from firstNum to secondNum, output the number's value
// of dash characters ('-').
// End each output with a newline.
//
//Ex: If the input is 1 2, then the output is:
//
//-
//--
public class LoopPatterns {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int firstNum;
        int secondNum;
        int i;
        int j;

        firstNum = scnr.nextInt();
        secondNum = scnr.nextInt();

        //It uses this inner and outer loop because it is like
        //matrix?

        //between firstNum and secondNum(number of rows)
        for (i = firstNum; i <= secondNum; ++i) {
            //decide number of dash
            for (j = 1; j <= i; ++j) {
                System.out.print("-");
            }
            System.out.println(); // Move to the next line after printing dashes
        }
    }
}
