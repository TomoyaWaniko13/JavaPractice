package zyBooks.Loops_4.Labs;

import java.util.Scanner;

public class RocketHeight {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int rocketHeight = 0;
        int initialVelocity = 0;
        int timeSinceLaunch = 0;

        /* Type your code here. */
        initialVelocity = scnr.nextInt();

        //need calculation before while loop
        rocketHeight = (int) (initialVelocity * timeSinceLaunch - 5 * Math.pow(timeSinceLaunch, 2));
        while (rocketHeight >= 0) {
            System.out.println(timeSinceLaunch + " " + rocketHeight);
            timeSinceLaunch++;
            rocketHeight = (int) (initialVelocity * timeSinceLaunch - 5 * Math.pow(timeSinceLaunch, 2));
        }
    }
}
