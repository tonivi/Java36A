import java.util.Scanner;

public class CIS36aFall2015ToniviTruongLab7Ex1 {

    public static void main(String[] args) {
        classInfo();
        menu();
    }

    public static void classInfo() {
        System.out.println("CIS 36a - Java Programming"
                + "\nLaney college"
                + "\nTonivi Truong"
                + "\n\nAssignment Information --"
                + "\n   Assignment Number:   Lab 07"
                + "\n   Coding Assignment -- Exercise #1"
                + "\n   Written by:         Tonivi Truong"
                + "\n   Submitted Date:     December 17, 2015");
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int option;
        RectangleToniviT[] rec = new RectangleToniviT[2];
        CircleToniviT[] cir = new CircleToniviT[2];
        CylinderToniviT[] cyl = new CylinderToniviT[2];
        BoxToniviT[] box = new BoxToniviT[2];
        do {
            System.out.println("\n**********************"
                    + "*********************"
                    + "\n*           Main MENU                     *"
                    + "\n* 1. Create 2 RectangleToniviT objects    *"
                    + "\n* 2. Create 2 CircleToniviT objects       *"
                    + "\n* 3. Create 2 BoxToniviT objects          *"
                    + "\n* 4. Create 2 CylinderToniviT objects     *"
                    + "\n* 5. Compare 2 selected objects by area   *"
                    + "\n* 6. Compare 2 selected objects by volume *"
                    + "\n* 7. Print selected objects               *"
                    + "\n* 8. Quit                                 *"
                    + "\n*******************************************");
            System.out.print("Select an option(1 through 8): ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("\nCreate Rectangle #1 :");
                    rec[0] = RectangleToniviT.createRec();
                    System.out.println("\nCreate Rectangle #2 :");
                    rec[1] = RectangleToniviT.createRec();
                    break;
                case 2:
                    System.out.println("\nCreate Circle #1: ");
                    cir[0] = CircleToniviT.createCir();
                    System.out.println("\nCreate Circle #2: ");
                    cir[1] = CircleToniviT.createCir();
                    break;
                case 3:
                    System.out.println("\nCreate Box #1: ");
                    box[0] = BoxToniviT.createBox();
                    System.out.println("\nCreate Box #2: ");
                    box[1] = BoxToniviT.createBox();
                    break;
                case 4:
                    System.out.println("\nCreate Cylinder #1: ");
                    cyl[0] = CylinderToniviT.createCylinder();
                    System.out.println("\nCreate Cylinder #2: ");
                    cyl[1] = CylinderToniviT.createCylinder();
                    break;
                case 5:
                    areaMenu(rec, cir, cyl, box);
                    break;
                case 6:
                    volumeMenu(rec, cir, cyl, box);
                    break;
                case 7:
                    printMenu(rec, cir, cyl, box);
                    break;
                case 8:
                    System.out.println("  Working Good!");
                    break;
                default:
                    System.out.println("  WRONG OPTION!");
            }
        } while (option != 8);
    }

    public static void areaMenu(RectangleToniviT[] rec, CircleToniviT[] cir,
            CylinderToniviT[] cyl, BoxToniviT[] box) {
        int option;
        int i;
        Scanner scanner = new Scanner(System.in);
        Shape[] object = new Shape[2];
        Shape[] shape = {rec[0], rec[1], cir[0],
            cir[1], cyl[0], cyl[1], box[0], box[1]};

        FractionToniviT[] area = new FractionToniviT[2];
        if (rec != null && cir != null && cyl != null && box != null) {
            for (i = 0; i < object.length; i++) {
                System.out.println("\n***********************"
                        + "***********"
                        + "\n* Please select 2 SHAPES         *"
                        + "\n* 1. Rectangle #1                *"
                        + "\n* 2. Rectangle #2                *"
                        + "\n* 3. Circle #1                   *"
                        + "\n* 4. Circle #2                   *"
                        + "\n* 5. Cylinder #1                 *"
                        + "\n* 6. Cylinder #2                 *"
                        + "\n* 7. Box #1                      *"
                        + "\n* 8. Box #2                      *"
                        + "\n**********************************");
                System.out.print("  Select a Shape to compare the areas: ");
                option = scanner.nextInt();
                if (option < 1 || option > 8) {
                    do {
                        System.out.println("\n Wrong Option!");
                        System.out.print("  Select a shape from"
                                + "1 through 8: ");
                        option = scanner.nextInt();
                    } while (option < 1 || option > 8);
                }

                object[i] = shape[option - 1];
                System.out.println("\nShape #" + (i + 1) + " selected.");
                area[i] = object[i].computeArea();
            }
            if (area[0].compareTo(area[1]) == 1) {
                System.out.println("\nThe 1st Shape "
                        + "is larger than the 2nd.");
            } else if (area[0].compareTo(area[1]) == -1) {
                System.out.println("\nThe 2nd Shape "
                        + "is largest than the 1st.");
            } else {
                System.out.println("\nBoth areas are equal.");
            }
        } else {
            System.out.println("\nPlease create all objects first!");
        }
    }

    public static void volumeMenu(RectangleToniviT[] rec, CircleToniviT[] cir,
            CylinderToniviT[] cyl, BoxToniviT[] box) {
        int option;
        int i;
        Scanner scanner = new Scanner(System.in);
        Shape[] object = new Shape[2];
        Shape[] shape = {rec[0], rec[1], cir[0],
            cir[1], cyl[0], cyl[1], box[0], box[1]};
        FractionToniviT[] volume = new FractionToniviT[2];

        if (rec != null && cir != null && cyl != null && box != null) {
            for (i = 0; i < object.length; i++) {
                System.out.println("\n***********************"
                        + "***********"
                        + "\n* Please select 2 SHAPES         *"
                        + "\n* 1. Rectangle #1                *"
                        + "\n* 2. Rectangle #2                *"
                        + "\n* 3. Circle #1                   *"
                        + "\n* 4. Circle #2                   *"
                        + "\n* 5. Cylinder #1                 *"
                        + "\n* 6. Cylinder #2                 *"
                        + "\n* 7. Box #1                      *"
                        + "\n* 8. Box #2                      *"
                        + "\n**********************************");
                System.out.print("  Select a Shape to compare "
                        + "the volumes: ");
                option = scanner.nextInt();
                if (option < 1 || option > 8) {
                    do {
                        System.out.println("\n Wrong Option!");
                        System.out.print("  Select a shape from"
                                + "1 through 8: ");
                        option = scanner.nextInt();
                    } while (option < 1 || option > 8);
                }

                object[i] = shape[option - 1];
                System.out.println("\nShape #" + (i + 1)
                        + " selected.");
                volume[i] = object[i].computeVolume();
            }
            if (volume[0].compareTo(volume[1]) == 1) {
                System.out.println("\nThe 1st Shape "
                        + "is larger than the 2nd.");
            } else if (volume[0].compareTo(volume[1]) == -1) {
                System.out.println("\nThe 2nd Shape "
                        + "is larger than the 1st.");
            } else {
                System.out.println("\nBoth volumes are equal.");
            }

        } else {
            System.out.println("\nPlease create all objects first!");
        }
    }

    public static void printMenu(RectangleToniviT[] rec, CircleToniviT[] cir,
            CylinderToniviT[] cyl, BoxToniviT[] box) {
        int option;
        Scanner scanner = new Scanner(System.in);
        Shape[] shape = {rec[0], rec[1], cir[0],
            cir[1], cyl[0], cyl[1], box[0], box[1]};
        if (rec != null && cir != null && cyl != null && box != null) {
            System.out.println("\n***********************"
                    + "***********"
                    + "\n* Please select 2 SHAPES         *"
                    + "\n* 1. Rectangle #1                *"
                    + "\n* 2. Rectangle #2                *"
                    + "\n* 3. Circle #1                   *"
                    + "\n* 4. Circle #2                   *"
                    + "\n* 5. Cylinder #1                 *"
                    + "\n* 6. Cylinder #2                 *"
                    + "\n* 7. Box #1                      *"
                    + "\n* 8. Box #2                      *"
                    + "\n**********************************");
            System.out.print(" Pick a shape to print: ");
            option = scanner.nextInt();

            if (option < 1 || option > 8) {
                    do {
                        System.out.println("\n Wrong Option!");
                        System.out.print("  Select a shape from"
                                + "1 through 8: ");
                        option = scanner.nextInt();
                    } while (option < 1 || option > 8);
                }
            System.out.println(shape[option - 1]);
        } else {
            System.out.println("\nPlease create all objects first!");
        }
    }
}

/** COMMENTS
 * I was unable to figure out the compareTo when it comes to 3D shapes
 * and cannot find why I am not getting the else statement for the menu,
 * I cannot seem to find the issue even after trying different approaches.
 * I can do the long way, and make a switch statement for shape menu and
 * have an if/else for each shape.
 * 
 * Throughout the project I am able to create and print the objects, 
 * but I get a lot of errors when I finding area and volume 
 * between area and volume.
 * 
 * a pretty tedious lab that could be probably shortened so we can 
 * have time for a lab 8.
 * 
 * area of box: (ur*h) + (ll * h) + (ur * ll)
 * volume of box: ur * ll * h
 * area of cylinder: (2pi * rad * h) + (2pi*rad*rad)
 * volume of cylinder: (pi * rad * rad * h)
 */
