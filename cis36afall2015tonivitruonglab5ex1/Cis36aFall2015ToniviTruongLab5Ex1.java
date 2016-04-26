/**
 * Program Name: Cis36aFall2015ToniviTruongLab5Ex1.java 
 * Discussion: Lab 5 Exercise 1 
 * Written By: Tonivi Truong 
 * Date: 11/5/15
 */
package cis36afall2015tonivitruonglab5ex1;

import java.util.Scanner;

public class Cis36aFall2015ToniviTruongLab5Ex1 {

    public static void main(String[] args) {
        classInfo();
        menu();
    }

    public static void classInfo() {
        System.out.println("CIS 36a - Java Programming"
                + "\nLaney college"
                + "\nTonivi Truong"
                + "\n\nAssignment Information --"
                + "\n   Assignment Number:   Lab 05,"
                + "\n   Coding Assignment -- Exercise #1"
                + "\n   Written by:         Tonivi Truong"
                + "\n   Submitted Date:     November 5, 2015");
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int option;
        FractionToniviT fr1 = new FractionToniviT();
        FractionToniviT fr2 = new FractionToniviT();
        PointToniviT pt = new PointToniviT();
        do {
            System.out.println("\n********************"
                    + "***********"
                    + "\n*        Main MENU            *"
                    + "\n* 1. Fraction Menu            *"
                    + "\n* 2. Point Menu               *"
                    + "\n* 3. Quit                     *"
                    + "\n*******************************");
            System.out.print("Select an option(1, 2, or 3):");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    fractionMenu(fr1, fr2);
                    break;
                case 2:
                    pointMenu(fr1, fr2, pt);
                    break;
                case 3:
                    System.out.println("  Working Good!");
                    break;
                default:
                    System.out.println("  WRONG OPTION!");
            }
        } while (option != 3);
    }

    public static void fractionMenu(FractionToniviT fr1,
            FractionToniviT fr2) {
        Scanner scanner = new Scanner(System.in);
        int option;
        FractionToniviT result = null;

        do {
            System.out.println("\n*************************"
                    + "******"
                    + "\n*         MENU Fraction       *"
                    + "\n* 1. Initialization           *"
                    + "\n* 2. Adding                   *"
                    + "\n* 3. Subtracting              *"
                    + "\n* 4. Multiplying              *"
                    + "\n* 5. Dividing                 *"
                    + "\n* 6. Printing                 *"
                    + "\n* 7. Return to main           *"
                    + "\n*******************************");
            System.out.print("Select an option "
                    + "(Use integer value only): ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Initialization Option --");
                    do {
                        System.out.println("\n********************"
                                + "**********"
                                + "\n*        INIT MENU            *"
                                + "\n* 1. Update 1st Integer       *"
                                + "\n* 2. Update 2st Integer       *"
                                + "\n* 3. Return to Previous MENU  *"
                                + "\n*******************************");
                        System.out.print("Select an option"
                                + "(1, 2, or 3): ");
                        option = scanner.nextInt();
                        switch (option) {
                            case 1:
                                System.out.print("Updating 1st:");
                                fr1.frac(init());
                                break;
                            case 2:
                                System.out.print("Updating 2nd:");
                                fr2.frac(init());
                                break;
                            case 3:
                                System.out.println("  Returning to"
                                        + " Menu..)");
                                break;
                            default:
                                System.out.println("  WRONG OPTION!");
                        }
                    } while (option != 3);
                    break;
                case 2:
                    System.out.println("Adding Option --");
                    if (fr1.getNum() != 0) {
                        do {
                            System.out.println("\n********************"
                                    + "***********"
                                    + "\n*       ADDING MENU           *"
                                    + "\n* 1. add() - Member           *"
                                    + "\n* 2. add() - Stand Alone      *"
                                    + "\n* 3. Return to Previous MENU  *"
                                    + "\n*******************************");
                            System.out.print("Select an option"
                                    + "(1, 2, or 3): ");
                            option = scanner.nextInt();
                            switch (option) {
                                case 1:
                                    System.out.println("  Calling member "
                                            + "add");
                                    result = fr1.add(fr2);
                                    result.print();
                                    break;
                                case 2:
                                    System.out.println("  Calling stand"
                                            + " alone add()");
                                    result = add(fr1, fr2);
                                    print(result);
                                    break;
                                case 3:
                                    System.out.println("  Returning to"
                                            + " Menu..)");
                                    break;
                                default:
                                    System.out.println("  WRONG OPTION!");
                            }
                        } while (option != 3);
                    } else {
                        System.out.println("\n      "
                                + "FRACTION not initialized.");
                    }
                    break;
                case 3:
                    System.out.println("Subtracting Option --");
                    if (fr1.getNum() != 0) {
                        do {
                            System.out.println("\n********************"
                                    + "***********"
                                    + "\n*     SUBTRACTING MENU        *"
                                    + "\n* 1. subtract() - Member      *"
                                    + "\n* 2. subtract() - Stand Alone *"
                                    + "\n* 3. Return to Previous MENU  *"
                                    + "\n*******************************");
                            System.out.print("Select an option"
                                    + "(1, 2, or 3): ");
                            option = scanner.nextInt();
                            switch (option) {
                                case 1:
                                    System.out.println("  Calling member "
                                            + "subtract");
                                    result = fr1.subtract(fr2);
                                    result.print();
                                    break;
                                case 2:
                                    System.out.println("  Calling stand"
                                            + " alone subtract()");
                                    result = subtract(fr1, fr2);
                                    print(result);
                                    break;
                                case 3:
                                    System.out.println("  Returning to"
                                            + " Menu..)");
                                    break;
                                default:
                                    System.out.println("  WRONG OPTION!");
                            }
                        } while (option != 3);
                    } else {
                        System.out.println("\n      "
                                + "FRACIION not initialized.");
                    }
                    break;
                case 4:
                    System.out.println("Multiplying Option --");
                    if (fr1.getNum() != 0) {
                        do {
                            System.out.println("\n********************"
                                    + "***********"
                                    + "\n*     Multiplying MENU        *"
                                    + "\n* 1. multiply() - Member      *"
                                    + "\n* 2. multiply() - Stand Alone *"
                                    + "\n* 3. Return to Previous MENU  *"
                                    + "\n*******************************");
                            System.out.print("Select an option"
                                    + "(1, 2, or 3): ");
                            option = scanner.nextInt();
                            switch (option) {
                                case 1:
                                    System.out.println("  Calling member "
                                            + "multiply");
                                    result = fr1.multiply(fr2);
                                    result.print();
                                    break;
                                case 2:
                                    System.out.println("  Calling stand"
                                            + " alone multiply()");
                                    result = multiply(fr1, fr2);
                                    print(result);
                                    break;
                                case 3:
                                    System.out.println("  Returning to"
                                            + " Menu..)");
                                    break;
                                default:
                                    System.out.println("  WRONG OPTION!");
                            }
                        } while (option != 3);
                    } else {
                        System.out.println("\n      "
                                + "FRACTION not initialized.");
                    }
                    break;
                case 5:
                    System.out.println("Dividing Option --");
                    if (fr1.getNum() != 0) {
                        do {
                            System.out.println("\n********************"
                                    + "***********"
                                    + "\n*       Dividing MENU         *"
                                    + "\n* 1. dividing() - Member      *"
                                    + "\n* 2. dividing() - Stand Alone *"
                                    + "\n* 3. Return to Previous MENU  *"
                                    + "\n*******************************");
                            System.out.print("Select an option"
                                    + "(1, 2, or 3): ");
                            option = scanner.nextInt();
                            switch (option) {
                                case 1:
                                    System.out.println("  Calling member "
                                            + "divide");
                                    result = fr1.divide(fr2);
                                    result.print();
                                    break;
                                case 2:
                                    System.out.println("  Calling stand"
                                            + " alone dividing()");
                                    result = divide(fr1, fr2);
                                    print(result);
                                    break;
                                case 3:
                                    System.out.println("  Returning to"
                                            + " Menu..)");
                                    break;
                                default:
                                    System.out.println("  WRONG OPTION!");
                            }
                        } while (option != 3);
                    } else {
                        System.out.println("\n      "
                                + "FRACTION not initialized.");
                    }
                    break;
                case 6:
                    System.out.println("Printing Option --");
                    if (fr1.getNum() != 0) {
                        do {
                            System.out.println("\n********************"
                                    + "**********"
                                    + "\n*       Printing MENU         *"
                                    + "\n* 1. print() - Member         *"
                                    + "\n* 2. print() - Stand Alone    *"
                                    + "\n* 3. Return to Previous MENU  *"
                                    + "\n******************************");
                            System.out.print("Select an option"
                                    + "(1, 2, or 3): ");
                            option = scanner.nextInt();
                            switch (option) {
                                case 1:
                                    System.out.println("  Calling init "
                                            + "member print");
                                    System.out.println("Fraction #1:");
                                    fr1.print();
                                    System.out.println("\nFraction #2:");
                                    fr2.print();
                                    break;
                                case 2:
                                    System.out.println("  Calling stand"
                                            + " alone print()");
                                    System.out.println("Fraction #1:");
                                    print(fr1);
                                    System.out.println("Fraction #2:");
                                    print(fr2);
                                    break;
                                case 3:
                                    System.out.println("  Returning to"
                                            + " Menu..)");
                                    break;
                                default:
                                    System.out.println("  WRONG OPTION!");
                            }
                        } while (option != 3);
                    } else {
                        System.out.println("\n      "
                                + "FRACTION not initialized.");
                    }
                    break;
                case 7:
                    System.out.println("Returning to Menu");
                    break;
                default:
                    System.out.println("Wrong Option!");
            }
        } while (option != 7);
    }

    public static void pointMenu(FractionToniviT fr1,
            FractionToniviT fr2, PointToniviT pt) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n*************************"
                    + "**"
                    + "\n*         Menu Point      *"
                    + "\n* 1. Initialization       *"
                    + "\n* 2. Moving               *"
                    + "\n* 3. Flipping             *"
                    + "\n* 4. Printing             *"
                    + "\n* 5. Return to main       *"
                    + "\n***************************");
            System.out.print("Select an option "
                    + "(Use integer value only): ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Initialization --");
                    System.out.println("\n Enter points : ");
                    pt.moveBy(init(), init());
                    fr1.setNum(1);
                    break;
                case 2:
                    System.out.println("Moving Option --");
                    if (fr1.getNum() != 0) {
                        do {
                            System.out.println("\n********************"
                                    + "***********"
                                    + "\n*       Moving MENU           *"
                                    + "\n* 1. by (frX, frY)            *"
                                    + "\n* 2. By fr                    *"
                                    + "\n* 3. Printing                 *"
                                    + "\n* 4. Return to Point Menu     *"
                                    + "\n*******************************");
                            System.out.print("Select an option "
                                    + "(Use integer value only): ");
                            option = scanner.nextInt();
                            switch (option) {
                                case 1:
                                    System.out.println("\n Moving "
                                            + "X Frac by: ");
                                    fr1 = new FractionToniviT(init());
                                    System.out.println("\n Moving "
                                            + "Y Frac by: ");
                                    fr2 = new FractionToniviT(init());
                                    pt.moveBy(fr1, fr2);
                                    break;
                                case 2:
                                    System.out.print("\n Moving by"
                                            + " Fraction: ");
                                    pt.moveBy(scanner.nextInt());
                                    break;
                                case 3:
                                    System.out.println("\n Printing -- ");
                                    System.out.println("The values "
                                            + "for Point Object are :");
                                    pt.print();
                                    break;
                                case 4:
                                    System.out.println("  Returning to"
                                            + " Menu..)");
                                    break;
                                default:
                                    System.out.println("  WRONG OPTION!");
                            }
                        } while (option != 4);
                    } else {
                        System.out.println("\n      "
                                + "POINT object not"
                                + "initialized.");
                    }
                    break;
                case 3:
                    System.out.println("Flipping Options --");
                    if (fr1.getNum() != 0) {
                        do {
                            System.out.println("\n********************"
                                    + "***********"
                                    + "\n*      Flipping MENU          *"
                                    + "\n* 1. by X                     *"
                                    + "\n* 2. By Y                     *"
                                    + "\n* 3. by Origin                *"
                                    + "\n* 4. Printing                 *"
                                    + "\n* 5. Return to Point Menu     *"
                                    + "\n*******************************");
                            System.out.print("Select an option "
                                    + "(Use integer value only): ");
                            option = scanner.nextInt();
                            switch (option) {
                                case 1:
                                    System.out.println("\n Flipping"
                                            + " by X");
                                    pt.flipByX();
                                    pt.print();
                                    break;
                                case 2:
                                    System.out.println("\n Flipping"
                                            + " by X");
                                    pt.flipByY();
                                    pt.print();
                                    break;
                                case 3:
                                    System.out.println("\n Flipping by X");
                                    pt.flipThroughOrigin();
                                    pt.print();
                                    break;
                                case 4:
                                    System.out.println("\n Printing -- ");
                                    System.out.println("The values "
                                            + "for Point Object are :");
                                    pt.print();
                                    break;
                                case 5:
                                    System.out.println("  Returning to"
                                            + " Menu..)");
                                    break;
                                default:
                                    System.out.println("  WRONG OPTION!");
                            }
                        } while (option != 5);
                    } else {
                        System.out.println("\n      "
                                + "POINT object not"
                                + "initialized.");
                    }
                    break;
                case 4:
                    System.out.println("PRINTING "
                            + "Option --");
                    if (fr1.getNum() != 0) {
                        System.out.println("The values "
                                + "for Point Object are :");
                        pt.print();
                    } else {
                        System.out.println("\n      "
                                + "POINT object not"
                                + "initialized.");
                    }
                    break;
                case 5:
                    System.out.println("Returning to Menu..");
                    break;
                default:
                    System.out.println("Wrong Option!");
            }
        } while (option
                != 5);
    }

    public static FractionToniviT init() {
        FractionToniviT fr;
        int num, denom;
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter a num: ");
        num = scanner.nextInt();
        System.out.print("Enter a denom (Cannot be zero!): ");
        denom = scanner.nextInt();
        if (denom == 0) {
            do {
                System.out.println("\nError.. "
                        + "cannot be ZERO!");
                System.out.print("\nEnter a denom: ");
                denom = scanner.nextInt();
            } while (denom == 0);
        }

        if (denom < 0) {
            num = -num;
            denom = -denom;
        }
        return new FractionToniviT(num, denom);
    }

    public static FractionToniviT add(FractionToniviT fr1,
            FractionToniviT fr2) {
        return new FractionToniviT(
                (fr1.getNum() * fr2.getDenom()) + (fr1.getDenom()
                * fr2.getNum()), (fr1.getDenom() * fr2.getDenom()));
    }

    public static FractionToniviT subtract(FractionToniviT fr1,
            FractionToniviT fr2) {
        return new FractionToniviT(
                (fr1.getNum() * fr2.getDenom()) - (fr1.getDenom()
                * fr2.getNum()), (fr1.getDenom() * fr2.getDenom()));
    }

    public static FractionToniviT multiply(FractionToniviT fr1,
            FractionToniviT fr2) {
        return new FractionToniviT(
                (fr1.getNum() * fr2.getNum()),
                (fr1.getDenom() * fr2.getDenom()));
    }

    public static FractionToniviT divide(FractionToniviT fr1,
            FractionToniviT fr2) {
        return new FractionToniviT(
                (fr1.getNum() * fr2.getDenom()),
                (fr1.getDenom() * fr2.getNum()));
    }

    public static void print(FractionToniviT fr) {
        System.out.println(fr.getNum() + " / " + fr.getDenom());
    }
}
/** Output
CIS 36a - Java Programming
Laney college
Tonivi Truong

Assignment Information --
   Assignment Number:   Lab 05,
   Coding Assignment -- Exercise #1
   Written by:         Tonivi Truong
   Submitted Date:     November 5, 2015

*******************************
*        Main MENU            *
* 1. Fraction Menu            *
* 2. Point Menu               *
* 3. Quit                     *
*******************************
Select an option(1, 2, or 3):1

*******************************
*         MENU Fraction       *
* 1. Initialization           *
* 2. Adding                   *
* 3. Subtracting              *
* 4. Multiplying              *
* 5. Dividing                 *
* 6. Printing                 *
* 7. Return to main           *
*******************************
Select an option (Use integer value only): 2
Adding Option --

      FRACTION not initialized.

*******************************
*         MENU Fraction       *
* 1. Initialization           *
* 2. Adding                   *
* 3. Subtracting              *
* 4. Multiplying              *
* 5. Dividing                 *
* 6. Printing                 *
* 7. Return to main           *
*******************************
Select an option (Use integer value only): 1
Initialization Option --

******************************
*        INIT MENU            *
* 1. Update 1st Integer       *
* 2. Update 2st Integer       *
* 3. Return to Previous MENU  *
*******************************
Select an option(1, 2, or 3): 1
Updating 1st:
Enter a num: 1
Enter a denom (Cannot be zero!): 2

******************************
*        INIT MENU            *
* 1. Update 1st Integer       *
* 2. Update 2st Integer       *
* 3. Return to Previous MENU  *
*******************************
Select an option(1, 2, or 3): 2
Updating 2nd:
Enter a num: 3
Enter a denom (Cannot be zero!): 4

******************************
*        INIT MENU            *
* 1. Update 1st Integer       *
* 2. Update 2st Integer       *
* 3. Return to Previous MENU  *
*******************************
Select an option(1, 2, or 3): 3
  Returning to Menu..)

*******************************
*         MENU Fraction       *
* 1. Initialization           *
* 2. Adding                   *
* 3. Subtracting              *
* 4. Multiplying              *
* 5. Dividing                 *
* 6. Printing                 *
* 7. Return to main           *
*******************************
Select an option (Use integer value only): 6
Printing Option --

******************************
*       Printing MENU         *
* 1. print() - Member         *
* 2. print() - Stand Alone    *
* 3. Return to Previous MENU  *
******************************
Select an option(1, 2, or 3): 1
  Calling init member print
Fraction #1:
1 / 2
Fraction #2:
3 / 4
******************************
*       Printing MENU         *
* 1. print() - Member         *
* 2. print() - Stand Alone    *
* 3. Return to Previous MENU  *
******************************
Select an option(1, 2, or 3): 2
  Calling stand alone print()
Fraction #1:
1 / 2
Fraction #2:
3 / 4

******************************
*       Printing MENU         *
* 1. print() - Member         *
* 2. print() - Stand Alone    *
* 3. Return to Previous MENU  *
******************************
Select an option(1, 2, or 3): 3
  Returning to Menu..)

*******************************
*         MENU Fraction       *
* 1. Initialization           *
* 2. Adding                   *
* 3. Subtracting              *
* 4. Multiplying              *
* 5. Dividing                 *
* 6. Printing                 *
* 7. Return to main           *
*******************************
Select an option (Use integer value only): 2
Adding Option --

*******************************
*       ADDING MENU           *
* 1. add() - Member           *
* 2. add() - Stand Alone      *
* 3. Return to Previous MENU  *
*******************************
Select an option(1, 2, or 3): 1
  Calling member add
10 / 8
*******************************
*       ADDING MENU           *
* 1. add() - Member           *
* 2. add() - Stand Alone      *
* 3. Return to Previous MENU  *
*******************************
Select an option(1, 2, or 3): 3
  Returning to Menu..)

*******************************
*         MENU Fraction       *
* 1. Initialization           *
* 2. Adding                   *
* 3. Subtracting              *
* 4. Multiplying              *
* 5. Dividing                 *
* 6. Printing                 *
* 7. Return to main           *
*******************************
Select an option (Use integer value only): 3
Subtracting Option --

*******************************
*     SUBTRACTING MENU        *
* 1. subtract() - Member      *
* 2. subtract() - Stand Alone *
* 3. Return to Previous MENU  *
*******************************
Select an option(1, 2, or 3): 1
  Calling member subtract
8 / 16
*******************************
*     SUBTRACTING MENU        *
* 1. subtract() - Member      *
* 2. subtract() - Stand Alone *
* 3. Return to Previous MENU  *
*******************************
Select an option(1, 2, or 3): 3
  Returning to Menu..)

*******************************
*         MENU Fraction       *
* 1. Initialization           *
* 2. Adding                   *
* 3. Subtracting              *
* 4. Multiplying              *
* 5. Dividing                 *
* 6. Printing                 *
* 7. Return to main           *
*******************************
Select an option (Use integer value only): 6
Printing Option --

******************************
*       Printing MENU         *
* 1. print() - Member         *
* 2. print() - Stand Alone    *
* 3. Return to Previous MENU  *
******************************
Select an option(1, 2, or 3): 1
  Calling init member print
Fraction #1:
1 / 2
Fraction #2:
3 / 4
******************************
*       Printing MENU         *
* 1. print() - Member         *
* 2. print() - Stand Alone    *
* 3. Return to Previous MENU  *
******************************
Select an option(1, 2, or 3): 3
  Returning to Menu..)

*******************************
*         MENU Fraction       *
* 1. Initialization           *
* 2. Adding                   *
* 3. Subtracting              *
* 4. Multiplying              *
* 5. Dividing                 *
* 6. Printing                 *
* 7. Return to main           *
*******************************
Select an option (Use integer value only): 7
Returning to Menu

*******************************
*        Main MENU            *
* 1. Fraction Menu            *
* 2. Point Menu               *
* 3. Quit                     *
*******************************
Select an option(1, 2, or 3):2

***************************
*         Menu Point      *
* 1. Initialization       *
* 2. Moving               *
* 3. Flipping             *
* 4. Printing             *
* 5. Return to main       *
***************************
Select an option (Use integer value only): 1
Initialization --

 Enter points : 

Enter a num: 1
Enter a denom (Cannot be zero!): 2

Enter a num: 3
Enter a denom (Cannot be zero!): 4

***************************
*         Menu Point      *
* 1. Initialization       *
* 2. Moving               *
* 3. Flipping             *
* 4. Printing             *
* 5. Return to main       *
***************************
Select an option (Use integer value only): 4
PRINTING Option --
The values for Point Object are :
X Point: 1 / 2
Y Point: 3 / 4

***************************
*         Menu Point      *
* 1. Initialization       *
* 2. Moving               *
* 3. Flipping             *
* 4. Printing             *
* 5. Return to main       *
***************************
Select an option (Use integer value only): 3
Flipping Options --

*******************************
*      Flipping MENU          *
* 1. by X                     *
* 2. By Y                     *
* 3. by Origin                *
* 4. Printing                 *
* 5. Return to Point Menu     *
*******************************
Select an option (Use integer value only): 1

 Flipping by X
X Point: -1 / 2
Y Point: 3 / 4

*******************************
*      Flipping MENU          *
* 1. by X                     *
* 2. By Y                     *
* 3. by Origin                *
* 4. Printing                 *
* 5. Return to Point Menu     *
*******************************
Select an option (Use integer value only): 2

 Flipping by X
X Point: -1 / 2
Y Point: -3 / 4

*******************************
*      Flipping MENU          *
* 1. by X                     *
* 2. By Y                     *
* 3. by Origin                *
* 4. Printing                 *
* 5. Return to Point Menu     *
*******************************
Select an option (Use integer value only): 1

 Flipping by X
X Point: 1 / 2
Y Point: -3 / 4

*******************************
*      Flipping MENU          *
* 1. by X                     *
* 2. By Y                     *
* 3. by Origin                *
* 4. Printing                 *
* 5. Return to Point Menu     *
*******************************
Select an option (Use integer value only): 2

 Flipping by X
X Point: 1 / 2
Y Point: 3 / 4

*******************************
*      Flipping MENU          *
* 1. by X                     *
* 2. By Y                     *
* 3. by Origin                *
* 4. Printing                 *
* 5. Return to Point Menu     *
*******************************
Select an option (Use integer value only): 5
  Returning to Menu..)

*******************************
*        Main MENU            *
* 1. Fraction Menu            *
* 2. Point Menu               *
* 3. Quit                     *
*******************************
Select an option(1, 2, or 3):3
  Working Good!
BUILD SUCCESSFUL (total time: 1 minute 28 seconds)
*/

/** COMMENTS 
 * This lab was very difficult for me, and I
 * had to look online for how the print and simplify works.
 * I was glad I was able to get most of it down. I am still 
 * having a hard time fully simplifying the fractions when adding 
 * more than once, and keeping the outcome of the fraction when 
 * printing on the fraction menu. Overall, it was a great, tedious 
 * lab that taught me a lot.
*/