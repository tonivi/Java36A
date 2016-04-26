import java.util.ArrayList;
import java.util.Scanner;

public class Cis36a25Fall20015ToniviTruongLab1Ex1 {
    public static void main(String[] args) {
        displayClassInfo();
        menu();
    }
    
    public static void displayClassInfo() {
        System.out.println("CIS 36A - Java Programing\n" +
                "Laney College\nFrancisco Aguilar\n" +
                "Assignment Information --\n  Assignment Number: Lab 01," +
                "\n\t\t     Coding Assignment -- Exersice #1\n" +
                "  Written by:\t     Francisco Aguilar\n" +
                "  Submitted Date     2015/09/15\n");
    }
    
    public static void menu() {
        int option;
        int x = 0;
        int a = 0;
        
        do {
            System.out.println("********************MENU*******************");
            System.out.println("*  (1) Calling getMostOccurredDigit()     *");
            System.out.println("*  (2) Quit                               *");
            System.out.println("*******************************************");
          
         System.out.print("Enter Your option (1 or 2): ");
         Scanner scan = new Scanner(System.in);
         option = scan.nextInt();
         
         switch (option) {
             case 1:
                 System.out.print("Enter an Integer: ");
                 x = scan.nextInt();
                 System.out.println(getMostOccurredDigit(x));                 
                 break;
             case 2:
                 System.out.println("Working Good!");
                 break;
             default:
                 System.out.println("invalid");
         }
        } while (option != 2);
    }
    
    public static int getMostOccurredDigit(int val) {
        int max = 0;
        int temp = val;
        int index = -1;
        
        if (temp < 0) {
            temp = -temp;
        }
        
        ArrayList<Integer> array = new ArrayList<Integer>();
        int[] arrayDigits = new int[10];
        int intArray[];
        
        do {
            array.add(temp % 10);
            temp /= 10;
        } while (temp > 0);

        for (Integer array1 : array) {
            arrayDigits[array1] += 1;
        }
        
        for (int i = 0; i < arrayDigits.length; i++) {
            if (arrayDigits[i] > max) {
                max = arrayDigits[i];
                index = i;
            }
        }
        System.out.print("The digit occurred most in: " + val + " is: ");
        return index;
    }      
}
