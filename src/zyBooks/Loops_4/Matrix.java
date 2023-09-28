package zyBooks.Loops_4;

import java.util.Scanner;


//In a board game, each space is labeled with a letter followed by an integer. Given integers numRows and numColumns, output the label for each space, followed by a space. End each row with a newline.
//
//Ex: If the input is 3 5, then the output is:
//
//A1 A2 A3 A4 A5
//B1 B2 B3 B4 B5
//C1 C2 C3 C4 C5
//Note:
//
//Rows are in alphabetical order. Spaces in the first row all start with the letter A.
//Columns are in ascending order. Spaces in the first column all end with the integer 1.
public class Matrix {
    public static void main (String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numRows;
        int numColumns;
        int currentRow;
        char currentRowLetter;
        int currentColumn;
        int currentColumnInteger;

        numRows = scnr.nextInt();
        numColumns = scnr.nextInt();


//        for (currentRow = 0; currentRow < numRows; ++currentRow) {
//            //This is a way to get an alphabet according to the currentRow
//            currentRowLetter = (char) ('A' + currentRow);
//            //This
//            for (currentColumn = 1; currentColumn <= numColumns; ++currentColumn) {
//                System.out.print(currentRowLetter + "" + currentColumn + " ");
//            }
//            System.out.println();
//        }

        for (currentRow = 0; currentRow < numRows; ++currentRow){

        }
    }
}