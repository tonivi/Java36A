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
