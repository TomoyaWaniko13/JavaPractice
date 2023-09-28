package zyBooks.Loops_4.Labs;

import java.util.Scanner;

public class HTMLTable {
    public static void main(String[] args) {

            Scanner scnr = new Scanner(System.in);
            int userRows;
            int userCols;

            userRows = scnr.nextInt();
            userCols = scnr.nextInt();

            /* Type your code here. */
            System.out.println("<table>");


            for (int i = 0; i < userRows; i++) {
                System.out.print("<tr>");


                for (int j = 0; j < userCols; j++) {
                    System.out.print(" <td> c </td>");
                }

                System.out.println(" </tr>");
            }


            System.out.println("</table>");

    }
}
