/**
 * Program Name: Cis36aFall2015ToniviTruongMidtermQuiz.java 
 * Discussion: MidtermQuiz 
 * Written By: Tonivi Truong 
 * Date: 11/14/15
 */
package midterm;

import java.util.Scanner;

public class Midterm {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int i;
        int option;
        int[] integer;
        int[] ary;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\n**********************"
                    + "*************"
                    + "\n* 1. extractUnduplicatedDigit()   *"
                    + "\n* 2. Quit                         *"
                    + "\n***********************************");
            System.out.print("Select an option (1 or 2): ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.print("\nHow many integers? ");
                    integer = new int[scanner.nextInt()];

                    for (i = 0; i < integer.length; i++) {
                        System.out.print("Enter integer #" + (i + 1)
                                + ": ");
                        integer[i] = scanner.nextInt();
                    }
                    System.out.println("Calling "
                            + "extractUnduplicatedDigit()--");
                    ary = extractUnduplicatedDigit(integer);
                    print(ary);
                    break;
                case 2:
                    System.out.println("\nWorking good!");
                    break;
                default:
                    System.out.println("\nWRONG OPTION!");
            }
        } while (option != 2);
    }

    public static int[] extractUncommonDigit(int[] ary) {
        int[][] digitInfoAry = new int[ary.length][10];
        int tmp;
        int i, j, k;
        int[] returnAry = null;
        int ucDigitCount = 0;
        int ucCount = 0;
        int ucOdd = 0;
        int[] ucDigitAry = new int[10];

        for (i = 0; i < digitInfoAry.length; i++) {
            tmp = ary[i] < 0 ? -ary[i] : ary[i];
            do {
                digitInfoAry[i][tmp % 10] = 1;
                tmp /= 10;
            } while (tmp != 0);
        }

        for (i = 0; i < 10; i++) {
            for (j = 0, ucDigitCount = 0;
                    j < digitInfoAry.length; j++) {
                ucDigitCount += digitInfoAry[j][i];
            }
            if (ucDigitCount == 1) {
                if (i % 2 != 0) {
                    ucOdd++;
                }
            }
        }

        returnAry = new int[ucCount + 1];
        returnAry[0] = ucCount;

        if (ucCount != 0) {
            for (i = 0, j = 1, k = 0; i < 10; i++) {
                if ((ucDigitAry[i] == 1) && (i % 2 != 0)) {
                    returnAry[j] = i;
                    j++;
                }
                if ((ucDigitAry[i] == 1)
                        && (i % 2 == 0)) {
                    returnAry[ucOdd + 1 + k] = i;
                    k++;
                }
            }
        }
        return returnAry;
    }

    public static int isMatched(int[] ary, int match) {
        int matchValue = 0;

        for (int i = 0; i < ary.length; i++) {
            if (match == ary[i]) {
                matchValue = 1;
                i = ary.length;
            }
        }
        return matchValue;
    }

    public static int getLargest(int[] ary) {
        int largest;
        int i;

        for (largest = ary[0], i = 1; i < ary.length; i++) {
            if (largest < ary[i]) {
                largest = ary[i];
            }
        }
        return largest;
    }

    public static int[] extractLargest(int[][] ary) {
        int largest;
        int[] largestFlag = new int[ary.length];
        int[] largestInfo;
        int actualSize = 0;
        int i, j;
        int tmp;

        largest = ary[0][0];
        for (i = 0; i < ary.length; i++) {
            tmp = getLargest(ary[i]);
            if (largest < tmp) {
                largest = tmp;
            }
        }
        for (i = 0; i < ary.length; i++) {
            largestFlag[i] = isMatched(ary[i], largest);
            actualSize += largestFlag[i];
        }
        largestInfo = new int[1 + 1 + actualSize];
        largestInfo[0] = largest;
        largestInfo[1] = actualSize;

        for (i = 2, j = 0; j < largestFlag.length; j++) {
            if (largestFlag[j] != 0) {
                largestInfo[i] = j + 1;
                i++;
            }
        }
        return largestInfo;
    }

    public static int[] extractUnduplicatedDigit(int[] ary) {
        int[] returnAry = null;
        int[] ucDigitAry;
        int i, j, k;
        int tmp;
        int temp2 = 0;
        int[] countAry;
        int countOneTimeDigit = 0;
        int[] tempAry = new int[10];

        ucDigitAry = extractUncommonDigit(ary);
        countAry = new int[ucDigitAry[0]];

        for (i = 1, k = 0; i < ucDigitAry[0]; i++, k++) {
            for (j = 0; j < ary.length; j++) {
                tmp = (ary[j] < 0) ? -ary[j] : ary[j];
                do {
                    if (tmp % 10 == ucDigitAry[i]) {
                        countAry[k]++;
                    }
                } while (tmp != 0);
            }
            if (countAry[k] == 1) {
                countOneTimeDigit++;
                tempAry[temp2] = ucDigitAry[i];
                temp2++;
            }
            k++;
        }

        returnAry = new int[1 + ucDigitAry[0] * 2];

        returnAry[0] = ucDigitAry[0];
        if (returnAry[0] != 0) {
            for (i = 0, j = 1, k = 0; i < countAry.length; i++) {
                if (countAry[i] == 1) {
                    returnAry[j] = tempAry[k];
                    j++;
                    returnAry[j] = retrieveElement(ary,
                            tempAry[k]);
                    j++;
                    k++;
                }
            }
        }
        return returnAry;
    }

    public static int retrieveElement(int[] ary, int ucUdDigit) {
        int i;
        int value = 0;
        int temp;
        for (i = 0; i < ary.length; i++) {
            temp = (ary[i] < 0) ? -ary[i] : ary[i];
            do {
                if (temp % 10 == ucUdDigit) {
                    value = ary[i];
                    i = ary.length;
                }
                temp /= 10;
            } while (temp != 0);
        }
        return value;
    }

    public static void print(int[] ary) {
        int i, j;

        System.out.println("\n  The non-duplicate uncommon "
                + "digits: ");
        if (ary[0] == 0) {
            System.out.println("    There are no "
                    + "unduplicated digits...");
        } else {
            System.out.println("      There is/are "
                    + ary[0] + " non-duplicate uncommon digits");
            for (i = 1, j = 2; j < ary.length; i++, j++) {
                System.out.println("      digit " + ary[i]
                        + " is found in " + ary[j]);
                i++;
                j++;
            }
        }
    }
}

/**Output
************************************
* 1. extractUnduplicatedDigit()   *
* 2. Quit                         *
***********************************
Select an option (1 or 2): 4

WRONG OPTION!

***********************************
* 1. extractUnduplicatedDigit()   *
* 2. Quit                         *
***********************************
Select an option (1 or 2): 1

How many integers? 3
Enter integer #1: 123456
Enter integer #2: -987156
Enter integer #3: 65432
Calling extractUnduplicatedDigit()--

  The non-duplicate uncommon digits: 
    There are no unduplicated digits...

***********************************
* 1. extractUnduplicatedDigit()   *
* 2. Quit                         *
***********************************
Select an option (1 or 2): 1

How many integers? 1
Enter integer #1: 3
Calling extractUnduplicatedDigit()--

  The non-duplicate uncommon digits: 
    There are no unduplicated digits...

***********************************
* 1. extractUnduplicatedDigit()   *
* 2. Quit                         *
***********************************
Select an option (1 or 2): 1

How many integers? 3
Enter integer #1: 3216
Enter integer #2: -316
Enter integer #3: 6459
Calling extractUnduplicatedDigit()--

  The non-duplicate uncommon digits: 
    There are no unduplicated digits...

***********************************
* 1. extractUnduplicatedDigit()   *
* 2. Quit                         *
***********************************
Select an option (1 or 2): 2

Working good!
**/

/*Comments
 * I was unable to figure out how to test it. My print looks right,
 * or maybe I'm confused on the concept still. I don't really know
 */