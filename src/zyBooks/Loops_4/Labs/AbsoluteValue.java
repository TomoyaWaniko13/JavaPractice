package zyBooks.Loops_4.Labs;

import java.util.Scanner;

//4.15 Lab: Output sequence
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int i;

        System.out.println("Enter an integer:");
        n = scanner.nextInt();

        System.out.print("Sequence: ");
        /* Type your code here. */

        if(n < 0){
            n = -n;
        }

        for(i = -n; i <= n; i++){
            System.out.print(i+" ");
        }
    }
}
