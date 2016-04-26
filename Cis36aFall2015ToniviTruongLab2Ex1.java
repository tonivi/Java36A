
/**
 * Program Name: CIS36aFall2015ToniviTruongLab1Ex1.Java Discussion: Lab 1
 * Exercise 1 Written By: Tonivi Truong Date: 2015/09/24
 */
import java.util.Scanner;

public class Cis36aFall2015ToniviTruongLab2Ex1 {

    public static void main(String[] args) {
        classInfo();
        menu();
    }

    public static void classInfo() {
        System.out.println("CIS 36a - Java Programming"
                + "\nLaney college"
                + "\nTonivi Truong"
                + "\n\nAssignment Information --"
                + "\n\tAssignment Number:   Lab 02,"
                + "\n\tCoding Assignment -- Excercise #1"
                + "\n\tWritten by:         Tonivi Truong"
                + "\n\tSubmitted Date:     September 24, 2015");
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int option;
        int arySize;
        int i;
        int[] index;

        do {
            System.out.println("\n*****************************************"
                    + "\n*                Menu                   *"
                    + "\n*1. Calling MoveAndSortInt()            *"
                    + "\n*2. Quit                                *"
                    + "\n*****************************************");
            System.out.println("Enter your option (1 or 2): ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.print("\nEnter the array size: ");
                    arySize = scanner.nextInt();
                    index = new int[arySize];
                    System.out.println("\nEnter the array element values -");

                    for (i = 0; i < index.length; i++) {
                        System.out.print("  Index " + i + ": ");
                        index[i] = scanner.nextInt();
                    }

                    System.out.println("\nCalling MoveAndSortInt... \n");
                    moveAndSort(index);
                    break;
                case 2:
                    System.out.println("Working Good!\n");
                    break;
                default:
                    System.out.println("Wrong Option!!\n");
            }

        } while (option != 2);
    }

    public static void moveAndSort(int[] ary) {
        int i;
        int j;
        int temp;

        for (i = 0; i < ary.length; i++) {
            for (j = i + 1; j < ary.length; j++) {
                if (ary[i] % 2 == 0) {
                    temp = ary[i];
                    ary[i] = ary[j];
                    ary[j] = temp;
                }
            }
        }
        //sorting odds from small to large and even from large to small
        for (i = 0; i < ary.length; i++) {
            for (j = i + 1; j < ary.length; j++) {
                if (ary[i] % 2 != 0) {
                    if (ary[j] % 2 != 0) {
                        if (ary[i] > ary[j]) {
                            temp = ary[i];
                            ary[i] = ary[j];
                            ary[j] = temp;
                        }
                    }
                }
                if (ary[i] % 2 == 0) {
                    if (ary[j] % 2 == 0) {
                        if (ary[i] < ary[j]) {
                            temp = ary[i];
                            ary[i] = ary[j];
                            ary[j] = temp;
                        }
                    }
                }
            }
        }
        System.out.println("The updated array:");
        for (i = 0; i < ary.length; i++) {
            System.out.println("  " + ary[i]);
        }
        System.out.println("\n");
    }
}

/* CIS 36a - Java Programming
 Laney college
 Tonivi Truong

 Assignment Information --
 Assignment Number:   Lab 02,
 Coding Assignment -- Excercise #1
 Written by:         Tonivi Truong
 Submitted Date:     September 24, 2015

 *****************************************
 *                Menu                   *
 *1. Calling MoveAndSortInt()            *
 *2. Quit                                *
 *****************************************
 Enter your option (1 or 2): 
 1

 Enter the array size: 5

 Enter the array element values -
 Index 0: -15
 Index 1: 450
 Index 2: 6
 Index 3: -9
 Index 4: 9

 Calling MoveAndSortInt... 

 The updated array:
 -15
 -9
 9
 6
 450

 *****************************************
 *                Menu                   *
 *1. Calling MoveAndSortInt()            *
 *2. Quit                                *
 *****************************************
 Enter your option (1 or 2): 
 3
 Wrong Option!!

 *****************************************
 *                Menu                   *
 *1. Calling MoveAndSortInt()            *
 *2. Quit                                *
 *****************************************
 Enter your option (1 or 2): 
 1

 Enter the array size: 6

 Enter the array element values -
 Index 0: 100
 Index 1: -15
 Index 2: 450
 Index 3: 6
 Index 4: -91
 Index 5: 9

 Calling MoveAndSortInt... 

 The updated array:
 -91
 -15
 9
 450
 100
 6

 *****************************************
 *                Menu                   *
 *1. Calling MoveAndSortInt()            *
 *2. Quit                                *
 *****************************************
 Enter your option (1 or 2): 
 2
 Working Good! */
/**
 * OUTPUT COMMENTS I had to ask alot of people for help I was able to get an
 * output for the lab but was not able to figure out why it did not work with
 * larger outputs, only with smaller outputs
 * 
* when i used small numbers it works, but large numbers sometimes get confused
 * 
* overall it taught me plenty more about sorting and looping
 */
