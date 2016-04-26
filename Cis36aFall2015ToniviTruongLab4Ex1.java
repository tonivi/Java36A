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
