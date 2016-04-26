/**
 * Program Name: Cis36aFall2015ToniviTruongLab4Ex1.java
 * Discussion: Lab 4
 * Exercise 1 
 * Written By: Tonivi Truong 
 * Date: 2015/20/15
 */
package cis36afall2015tonivitruonglab4ex1;

import java.util.Scanner;

public class Cis36aFall2015ToniviTruongLab4Ex1 {

    public static void main(String[] args) {
        classInfo();
        menu();
    }

    public static void classInfo() {
        System.out.println("CIS 36a - Java Programming"
                + "\nLaney college"
                + "\nTonivi Truong"
                + "\n\nAssignment Information --"
                + "\n   Assignment Number:   Lab 04,"
                + "\n   Coding Assignment -- Exercise #1"
                + "\n   Written by:         Tonivi Truong"
                + "\n   Submitted Date:     October 20, 2015");
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int option;
        int[][] result;

        do {
            System.out.println("\n\n********************************"
                    + "**********"
                    + "\n*              MENU                       *"
                    + "\n* (1) Calling extractLargestAndSmallest   *"
                    + "\n* (2) Quit                                *"
                    + "\n******************************************");
            System.out.print("Enter your option (1 or 2): ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    result = buildTwoDimArray();
                    result = buildArray(result);
                    result = largestAndSmallest(result);
                    print(result);
                    break;
                case 2:
                    System.out.println("Working Good!");
                    break;
                default:
                    System.out.println("Wrong Option!");
            }
        } while (option != 2);
    }

    public static int[][] buildTwoDimArray() {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[][] ary;

        do {
            System.out.print("\nHow many array (0 or more): ");
            size = scanner.nextInt();
            if (size < 1) {
            System.out.println("\nThat's a negative number!");
            }
        } while (size < 1);

        ary = new int[size][];
        return ary;
    }

    public static int[][] buildArray(int[][] ary0) {
        Scanner scanner = new Scanner(System.in);
        int i, j;
        int size;
        int ary;

        for (i = 0; i < ary0.length; i++) {
            ary = i + 1;
            System.out.println("\nBuilding the array #" 
                    + ary + " -");
            System.out.print("  Enter the array size: ");
            size = scanner.nextInt();
            if (size < 1) {
                
                do {
                    System.out.println("\nSize needs to be" +
                            " more than 0..."); 
                    System.out.print("  Enter the array size: ");
                    size = scanner.nextInt();
                } while (size < 0);
            }

            ary0[i] = new int[size];

            System.out.println("\n  Enter the array element values -");
            for (j = 0; j < ary0[i].length; j++) {
                System.out.print("    Index " + j + ": ");
                ary0[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\n\nCalling largestAndSmallest() --");
        return ary0;
    }

    public static int[][] largestAndSmallest(int[][] ary1) {
        int i, j;
        int k = 2;
        int count = 0;
        int count1 = 0;
        int largest = ary1[0][0];
        int smallest = ary1[0][0];
        int[][] matrix = new int[2][];

        for (i = 0; i < ary1.length; i++) {
            for (j = 0; j < ary1[i].length; j++) {
                if (largest < ary1[i][j]) {
                    largest = ary1[i][j];
                }
                if (smallest > ary1[i][j]) {
                    smallest = ary1[i][j];
                }
            }
        }

        for (i = 0; i < ary1.length; i++) {
            for (j = 0; j < ary1[i].length; j++) {
                if (largest == ary1[i][j]) {
                    count++;
                    j = ary1[i].length;
                }
            }
            for (j = 0; j < ary1[i].length; j++) {

                if (smallest == ary1[i][j]) {
                    count1++;
                    j = ary1[i].length;
                }
            }
        }

        matrix[0] = new int[count + 2];
        matrix[1] = new int[count1 + 2];
        matrix[1][0] = smallest;
        matrix[0][0] = largest;
        matrix[0][1] = count;
        matrix[1][1] = count1;

        for (i = 0; i < ary1.length; i++) {
            for (j = 0; j < ary1[i].length; j++) {
                if (largest == ary1[i][j]) {
                    matrix[0][k] = i + 1;
                    k++;
                    j = ary1[i].length;
                }
            }
        }

        k = 2;

        for (i = 0; i < ary1.length; i++) {
            for (j = 0; j < ary1[i].length; j++) {
                if (smallest == ary1[i][j]) {
                    matrix[1][k] = i + 1;
                    k++;
                    j = ary1[i].length;
                }
            }
        }
        return matrix;
    }

    public static void print(int[][] result) {
        int i, j;

        System.out.print("\nDisplaying outside of "
                + "extractArrayLargestSmallest(): "
                + "\n  The returning array –");
        for (i = 0; i < result.length; i++) {
            for (j = 0; j < result[i].length; j++) {
                System.out.println("\n\n " + result[i][j]);
            }
        }
    }
}
/**
 * REQUIRED PROGRAM OUTPUT
CIS 36a - Java Programming
Laney college
Tonivi Truong

Assignment Information --
	Assignment Number:   Lab 04,
	Coding Assignment -- Exercise #1
	Written by:         Tonivi Truong
	Submitted Date:     October 15, 2015


******************************************
*              MENU                       *
* (1) Calling extractLargestAndSmallest   *
* (2) Quit                                *
******************************************
Enter your option (1 or 2): 1

How many array (0 or more): 3

Building the array #1 -
  Enter the array size: 5

  Enter the array element values -
    Index 0: -15
    Index 1: 450
    Index 2: 63
    Index 3: -9
    Index 4: 90

Building the array #2 -
  Enter the array size: 6

  Enter the array element values -
    Index 0: 100
    Index 1: -151
    Index 2: 450
    Index 3: 6
    Index 4: -91
    Index 5: 9

Building the array #3 -
  Enter the array size: 6

  Enter the array element values -
    Index 0: 1002
    Index 1: -1512
    Index 2: 4502
    Index 3: 62
    Index 4: -912
    Index 5: 9


Calling largestAndSmallest() --

Displaying outside of extractArrayLargestSmallest(): 
  The returning array – 
  
  4502 1 3 -1512 1 3

******************************************
*              MENU                       *
* (1) Calling extractLargestAndSmallest   *
* (2) Quit                                *
******************************************
Enter your option (1 or 2): 1

How many array (0 or more): 4

Building the array #1 -
  Enter the array size: 5

  Enter the array element values -
    Index 0: -15
    Index 1: 4502
    Index 2: 63
    Index 3: -9
    Index 4: 90

Building the array #2 -
  Enter the array size: 6

  Enter the array element values -
    Index 0: 100
    Index 1: -151
    Index 2: 4502
    Index 3: 6
    Index 4: -9100
    Index 5: 9

Building the array #3 -
  Enter the array size: 6

  Enter the array element values -
    Index 0: 1002
    Index 1: -1512
    Index 2: 450
    Index 3: 62
    Index 4: -912
    Index 5: 9

Building the array #4 -
  Enter the array size: 4

  Enter the array element values -
    Index 0: 1002
    Index 1: -1512
    Index 2: 4502
    Index 3: -9100


Calling largestAndSmallest() --

Displaying outside of extractArrayLargestSmallest(): 
  The returning array – 
  
  4502 3 1 2 4 -9100 2 2 4

******************************************
*              MENU                       *
* (1) Calling extractLargestAndSmallest   *
* (2) Quit                                *
******************************************
Enter your option (1 or 2): 4
Wrong Option!


******************************************
*              MENU                       *
* (1) Calling extractLargestAndSmallest   *
* (2) Quit                                *
******************************************
Enter your option (1 or 2): 2
Working Good!
 */

/**
 * COMMENTS
 * This one was kind of hard to do two 
 * dim arrays, learning debugger was helpful, I also
 * had to ask some people for help
 */
