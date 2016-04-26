/**
 * Program Name: Cis36aFall2015ToniviTruongLab3Ex1.java 
 * Discussion: Lab 3
 * Exercise 1 
 * Written By: Tonivi Truong 
 * Date: 2015/10/06
 */
package cis36afall2015tonivitruonglab3ex1;

import java.util.Scanner;

public class Cis36aFall2015ToniviTruongLab3Ex1 {

    public static void main(String[] args) {
        classInfo();
        menu();
    }

    public static void classInfo() {
        System.out.println("CIS 36a - Java Programming"
                + "\nLaney college"
                + "\nTonivi Truong"
                + "\n\nAssignment Information --"
                + "\n\tAssignment Number:   Lab 03,"
                + "\n\tCoding Assignment -- Exercise #1"
                + "\n\tWritten by:         Tonivi Truong"
                + "\n\tSubmitted Date:     October 6, 2015");
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int option;
        int[] first;
        int[] second;
        int[] print;

        do {
            System.out.println("\n\n******************************************"
                    + "\n*              MENU                       *"
                    + "\n* (1) Calling extractLargestAndSmallest   *"
                    + "\n* (2) Quit                                *"
                    + "\n******************************************");
            System.out.print("Enter your option (1 or 2): ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    first = buildArray();
                    second = buildArray2();
                    print = largestAndSmallest(first, second);
                    printArray(print);
                    break;
                case 2:
                    System.out.println("Working Good!");
                    break;
                default:
                    System.out.println("Wrong Option!");
            }
        } while (option != 2);
    }

    public static int[] buildArray() {
        Scanner scanner = new Scanner(System.in);
        int i;
        int[] index;
        int arySize;

        System.out.print("\nBuilding the first array - ");
        System.out.print("\n  Enter the array size: ");
        arySize = scanner.nextInt();
        index = new int[arySize];
        System.out.println("\n  Enter the array element values - ");

        for (i = 0; i < index.length; i++) {
            System.out.print("    Index " + i + ": ");
            index[i] = scanner.nextInt();
        }
        return index;
    }

    public static int[] buildArray2() {
        Scanner scanner = new Scanner(System.in);
        int i;
        int[] index;
        int arySize;
        
        System.out.print("\nBuilding the Second array - \n");
        System.out.print("\n  Enter the array size: ");
        arySize = scanner.nextInt();
        index = new int[arySize];
        System.out.println("\n  Enter the array element values -");

        for (i = 0; i < index.length; i++) {
            System.out.print("    Index " + i + ": ");
            index[i] = scanner.nextInt();
        }

        System.out.println("\nCalling extractLargestToSmallest)");
        return index;
    }

    public static int searchArray(int[] ary, int[] arg, int compare,
            int spot, int aNum) {
        int i;
        int count = 0;

        for (i = 0; i < ary.length; i++) {
            if (ary[i] == compare) {
                arg[spot] = aNum;
                count = 1;
                i = ary.length;
            }
        }
        return count;
    }

    public static int[] largestAndSmallest(int[] index1, int[] index2) {
        int largest = index1[0];
        int smallest = index1[0];
        int[] ary;
        int i;
        int count = 0;

        for (i = 0; i < index1.length; i++) {
            if (largest < index1[i]) {
                largest = index1[i];
            }
            if (smallest > index1[i]) {
                smallest = index1[i];
            }
        }

        for (i = 0; i < index2.length; i++) {
            if (largest < index2[i]) {
                largest = index2[i];
            }
            if (smallest > index2[i]) {
                smallest = index2[i];
            }
        }

        if (smallest == largest) {
            ary = new int[4];
            ary[0] = largest;
            count += searchArray(index1, ary, largest, 2, 1);
            count += searchArray(index2, ary, largest, 3, 2);
            ary[1] = count;
            System.out.println("\nThe returning array - "
                    + "\n  Smallest and Largest are the same...\n");
        } else {
            ary = new int[8];
            ary[0] = largest;
            ary[4] = smallest;
            count += searchArray(index1, ary, largest, 2, 1);
            count += searchArray(index2, ary, largest, 3, 2);
            ary[1] = count;
            count = 0;
            count += searchArray(index1, ary, smallest, 6, 1);
            count += searchArray(index2, ary, smallest, 7, 2);
            ary[5] = count;
            System.out.println("\nThe returning array - \n");
        }
        return ary;
    }

    public static void printArray(int[] ary) {
        int i;
        System.out.print(ary[0]);
        if (ary.length > 1) {
            for (i = 1; i < ary.length; i++) {
                if (ary[i] != 0) {
                    System.out.print(" " + ary[i]);
                }
            }
        }
    }
}
/** REQUIRED PROGRAM OUTPUT
CIS 36a - Java Programming
Laney college
Tonivi Truong

Assignment Information --
	Assignment Number:   Lab 03,
	Coding Assignment -- Exercise #1
	Written by:         Tonivi Truong
	Submitted Date:     October 6, 2015


******************************************
*              MENU                       *
* (1) Calling extractLargestAndSmallest   *
* (2) Quit                                *
******************************************
Enter your option (1 or 2): 1

Building the first array - 
  Enter the array size: 5

  Enter the array element values - 
    Index 0: -15
    Index 1: 450
    Index 2: 63
    Index 3: -9
    Index 4: 90

Building the Second array -

  Enter the array size: 6

  Enter the array element values -
    Index 0: 100
    Index 1: -151
    Index 2: 450
    Index 3: 6
    Index 4: -91
    Index 5: 9

Calling extractLargestToSmallest)

The returning array - 

450 2 1 2 -151 1 2

******************************************
*              MENU                       *
* (1) Calling extractLargestAndSmallest   *
* (2) Quit                                *
******************************************
Enter your option (1 or 2): 3
Wrong Option!


******************************************
*              MENU                       *
* (1) Calling extractLargestAndSmallest   *
* (2) Quit                                *
******************************************
Enter your option (1 or 2): 1

Building the first array - 
  Enter the array size: 7

  Enter the array element values - 
    Index 0: 15
    Index 1: 450
    Index 2: 63
    Index 3: -900
    Index 4: 90
    Index 5: -900
    Index 6: 90

Building the Second array - 

  Enter the array size: 6

  Enter the array element values -
    Index 0: 100
    Index 1: -151
    Index 2: 4500
    Index 3: 6
    Index 4: -91
    Index 5: 9

Calling extractLargestToSmallest)

The returning array - 

4500 1 2 -900 1 1

******************************************
*              MENU                       *
* (1) Calling extractLargestAndSmallest   *
* (2) Quit                                *
******************************************
Enter your option (1 or 2): 2
Working Good!
*/

/**Comment
NO COMMENTS
*/
