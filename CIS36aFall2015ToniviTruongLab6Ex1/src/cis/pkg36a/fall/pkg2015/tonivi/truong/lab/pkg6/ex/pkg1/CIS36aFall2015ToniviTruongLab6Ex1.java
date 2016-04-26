 /*
 * Project Name : CIS36aFall2015ToniviTruongLab6Ex1.java
 * Discussion :   Main
 * Written By :   Tonivi Truong
 * Date :         2015/12/1
 */
package cis.pkg36a.fall.pkg2015.tonivi.truong.lab.pkg6.ex.pkg1;

import java.util.Scanner;

public class CIS36aFall2015ToniviTruongLab6Ex1 {

    public static void main(String[] args) {
        classInfo();
        menu();
    }

    public static void classInfo() {
        System.out.println("CIS 36a - Java Programming"
                + "\nLaney college"
                + "\nTonivi Truong"
                + "\n\nAssignment Information --"
                + "\n   Assignment Number:   Lab 06,"
                + "\n   Coding Assignment -- Exercise #1"
                + "\n   Written by:         Tonivi Truong"
                + "\n   Submitted Date:     December 1, 2015");
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int option;
        final int size = 2;
        RectangleToniviT[] rec = null;
        CircleToniviT[] cir = null;
        do {
            System.out.println("\n********************"
                    + "*****************"
                    + "\n*           Main MENU               *"
                    + "\n* 1. Rectangle Tasks                *"
                    + "\n* 2. Circle Tasks                   *"
                    + "\n* 3. Mixed Rectangle & Circle Tasks *"
                    + "\n* 4. Quit                           *"
                    + "\n*************************************");
            System.out.print("Select an option(1, 2, 3, or 4):");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    recMenu(rec);
                    break;
                case 2:
                    cirMenu(cir);
                    break;
                case 3:
                    if (cir != null || rec != null) {
                        mixRecCir(rec, cir, size);
                    } else {
                        System.out.println("Please create objects first");
                    }
                    break;
                case 4:
                    System.out.println("  Working Good!");
                    break;
                default:
                    System.out.println("  WRONG OPTION!");
            }
        } while (option != 4);
    }

    public static void recMenu(RectangleToniviT[] rec) {
        Scanner scanner = new Scanner(System.in);
        int option;
        int i;

        do {
            System.out.println("\n*************************"
                    + "******"
                    + "\n* Rectangle Menu              *"
                    + "\n* 1. Create two Rect Obj      *"
                    + "\n* 2. Compare by Volume        *"
                    + "\n* 3. Compare by Area          *"
                    + "\n* 4. Print two Rect Obj       *"
                    + "\n* 5. Return                   *"
                    + "\n*******************************");
            System.out.print("Select an option "
                    + "(Use integer value only): ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    rec = new RectangleToniviT[2];
                    System.out.println("\nRECTANGLE"
                            + " #1");
                    rec[0] = RectUtil.createRec();
                    System.out.println("\nRECTANGLE"
                            + " #2");
                    rec[1] = RectUtil.createRec();
                    break;
                case 2:
                    if (rec != null) {
                        System.out.println("\nThe volumes are the same!\n");
                    } else {
                        System.out.println("\nNO RECTANGLES"
                                + " HAVE BEEN CREATED...");
                    }
                    break;
                case 3:
                    if (rec != null) {
                        RectUtil.compareRecArea(rec);
                    } else {
                        System.out.println("\nNO RECTANGLES"
                                + " HAVE BEEN CREATED...");
                    }
                    break;
                case 4:
                    if (rec != null) {
                        System.out.println("\nArea of Rectangle #1: "
                                + rec[0].computeArea());
                        System.out.println("\nArea of Rectangle #2: "
                                + rec[1].computeArea());
                    } else {
                        System.out.println("\nNO RECTANGLES"
                                + " HAVE BEEN CREATED...");
                    }
                    break;
                case 5:
                    System.out.println("Returning to Menu");
                    break;
                default:
                    System.out.println("Wrong Option!");
            }
        } while (option != 5);
    }

    public static void cirMenu(CircleToniviT[] cir) {
        Scanner scanner = new Scanner(System.in);
        int option;
        int i;
        do {
            System.out.println("\n*************************"
                    + "******"
                    + "\n* Circle Menu                 *"
                    + "\n* 1. Create two Cir Obj       *"
                    + "\n* 2. Compare by Volume        *"
                    + "\n* 3. Compare by Area          *"
                    + "\n* 4. Print two Cir Obj        *"
                    + "\n* 5. Return                   *"
                    + "\n*******************************");
            System.out.print("Select an option "
                    + "(Use integer value only): ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    cir = new CircleToniviT[2];
                    System.out.println("\nCircle"
                            + " #1");
                    cir[0] = CirUtil.createCir();
                    System.out.println("\nCircle"
                            + " #2");
                    cir[1] = CirUtil.createCir();
                    break;
                case 2:
                    if (cir != null) {
                        System.out.println("\nThe volumes are the same!\n");
                    } else {
                        System.out.println("\nNO CIRCLES"
                                + " HAVE BEEN CREATED...");
                    }
                    break;
                case 3:
                    if (cir != null) {
                        CirUtil.compareCirArea(cir);
                    } else {
                        System.out.println("\nNO CIRCLES"
                                + " HAVE BEEN CREATED...");
                    }
                    break;
                case 4:
                    if (cir != null) {
                        System.out.println("\nArea of Circle #1: "
                                + cir[0].computeArea());
                        System.out.println("\nArea of Circle #2: "
                                + cir[1].computeArea());
                    } else {
                        System.out.println("\nNO CIRCLES"
                                + " HAVE BEEN CREATED...");
                    }
                    break;
                case 5:
                    System.out.println("Returning to Menu");
                    break;
                default:
                    System.out.println("Wrong Option!");
            }
        } while (option != 5);
    }

    public static void mixRecCir(RectangleToniviT[] rec,
            CircleToniviT[] cir, int size) {
        Scanner scanner = new Scanner(System.in);
        int option;
        int i, j;
        do {
            System.out.println("\n*************************"
                    + "*********"
                    + "\n* Mixed Rectangle & Circle Menu  *"
                    + "\n* 1. Compare by Area             *"
                    + "\n* 2. Compare by Volume           *"
                    + "\n* 3. Print ALL objects           *"
                    + "\n* 4. Return                      *"
                    + "\n**********************************");
            System.out.print("Select an option "
                    + "(Use integer value only): ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    if (cir != null || rec != null) {

                        do {
                            System.out.println("\n******************************"
                                    + "*********"
                                    + "\n* Area Comparison Menu                *"
                                    + "\n  1. Compare Rectangle #1 & Circle #1 *"
                                    + "\n  2. Compare Rectangle #1 & Circle #2 *"
                                    + "\n  3. Compare Rectangle #2 & Circle #1 *"
                                    + "\n  4. Compare Rectangle #2 & Circle #2 *"
                                    + "\n  5. Quit                             *"
                                    + "\n***************************************");
                            System.out.print("Select an option"
                                    + "(Use integer value only: ");
                            option = scanner.nextInt();
                            switch (option) {
                                case 1:
                                    compareResults(rec[0], cir[0], option);
                                    break;
                                case 2:
                                    compareResults(rec[0], cir[1], option);
                                    break;
                                case 3:
                                    compareResults(rec[1], cir[0], option);
                                    break;
                                case 4:
                                    compareResults(rec[1], cir[1], option);
                                    break;
                                case 5:
                                    System.out.println("Returning to Menu");
                                    break;
                                default:
                                    System.out.println("\nWRONG OPTION!!");
                            }
                        } while (option != 5);
                    } else {
                        System.out.println("Please create objects first");
                    }
                    break;
                case 2:
                    if (cir != null && rec != null) {
                        System.out.println("\nThe volume of all of"
                                + "the objects are equal!");
                    } else {
                        System.out.println("\nBoth cirlces"
                                + "and rectangles must be created!.");
                    }
                    break;
                case 3:
                    if (rec != null) {
                        for (i = 1; i < size; i++) {
                            System.out.println("\nArea of Rectangle #" + i
                                    + ": " + rec[i]);
                        }
                    } else {
                        System.out.println("\nNO RECTANGLES"
                                + " HAVE BEEN CREATED...");
                    }
                    if (cir != null) {
                        for (i = 1; i < size; i++) {
                            System.out.println("\nArea of Circle #" + i
                                    + ": " + cir[i]);
                        }
                    } else {
                        System.out.println("\nNO CIRCLES"
                                + " HAVE BEEN CREATED...");
                    }
                    break;
                case 5:
                    System.out.println("Returning to Menu");
                    break;
                default:
                    System.out.println("Wrong Option!");
            }
        } while (option != 5);
    }

    public static void compareResults(RectangleToniviT rec,
            CircleToniviT cir, int option) {
        if (option == 1) {
            if (rec.compareCirArea(cir) == 1) {
                System.out.println("\nRECTANGLE #1 has AREA :"
                        + rec.computeArea()
                        + "\nWhich is LARGER THAN\n"
                        + "\nCIRCLE #1's AREA :"
                        + cir.computeArea());
            } else if (rec.compareCirArea(cir) == -1) {
                System.out.println("\nRECTANGLE #1 has AREA :"
                        + rec.computeArea()
                        + "\nWhich is LESS THAN\n"
                        + "\nCIRCLE #1's AREA :"
                        + cir.computeArea());
            } else {
                System.out.println("\nTHE AREA OF BOTH "
                        + "OBJECTS ARE EQUAL IN SIZE."
                        + "\n  AREA : " + rec.computeArea());
            }
        } else if (option == 2) {
            if (rec.compareCirArea(cir) == 1) {
                System.out.println("\nRECTANGLE #1 has AREA :"
                        + rec.computeArea()
                        + "\nWhich is LARGER THAN\n"
                        + "\nCIRCLE #2's AREA :"
                        + cir.computeArea());
            } else if (rec.compareCirArea(cir) == -1) {
                System.out.println("\nRECTANGLE #1 has AREA :"
                        + rec.computeArea()
                        + "\nWhich is LESS THAN\n"
                        + "\nCIRCLE #2's AREA :"
                        + cir.computeArea());
            } else {
                System.out.println("\nTHE AREA OF BOTH "
                        + "OBJECTS ARE EQUAL IN SIZE."
                        + "\n  AREA : " + rec.computeArea());
            }
        } else if (option == 3) {
            if (rec.compareCirArea(cir) == 1) {
                System.out.println("\nRECTANGLE #2 has AREA :"
                        + rec.computeArea()
                        + "\nWhich is LARGER THAN\n"
                        + "\nCIRCLE #1's AREA :"
                        + cir.computeArea());
            } else if (rec.compareCirArea(cir) == -1) {
                System.out.println("\nRECTANGLE #2 has AREA :"
                        + rec.computeArea()
                        + "\nWhich is LESS THAN\n"
                        + "\nCIRCLE #1's AREA :"
                        + cir.computeArea());
            } else {
                System.out.println("\nTHE AREA OF BOTH "
                        + "OBJECTS ARE EQUAL IN SIZE."
                        + "\n  AREA : " + rec.computeArea());
            }
        } else {
            if (rec.compareCirArea(cir) == 1) {
                System.out.println("\nRECTANGLE #2 has AREA :"
                        + rec.computeArea()
                        + "\nWhich is LARGER THAN\n"
                        + "\nCIRCLE #2's AREA :"
                        + cir.computeArea());
            } else if (rec.compareCirArea(cir) == -1) {
                System.out.println("\nRECTANGLE #2 has AREA :"
                        + rec.computeArea()
                        + "\nWhich is LESS THAN\n"
                        + "\nCIRCLE #2's AREA :"
                        + cir.computeArea());
            } else {
                System.out.println("\nTHE AREA OF BOTH "
                        + "OBJECTS ARE EQUAL IN SIZE."
                        + "\n  AREA : " + rec.computeArea());
            }
        }
    }
}