import java.util.Scanner;

public class Cis36aFall2015ToniviTruongQuiz31 {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int i, n, d;
        int option;
        int[] ary;
        int[] integer;
        int num, denom;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\n***********************"
                    + "***************"
                    + "\n* 1. extractCommonNumeratorFactor()  *"
                    + "\n* 2. Quit                            *"
                    + "\n**************************************");
            System.out.print("Select an option (1 or 2): ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.print("\nHow many Fractions? ");
                    integer = new int[scanner.nextInt()];

                    for (i = 0; i < integer.length; i++) {
                        System.out.print("Enter integer #" + (i + 1)
                                + ": ");

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
                        integer = (num,denom);
                        integer[i] = scanner.nextInt();
                    }

                    System.out.println("Calling "
                            + "extractUnduplicatedDigit()--");
                    System.out.println("Calling "
                            + "extractCommonNumeratorFactor()--");
                    ary = extractCommonNumeratorFactor(integer);
                    break;

                case 2:
                    System.out.println("\nWorking good!");
                    break;
                default:
                    System.out.println("\nWRONG OPTION!");
            }
        } while (option != 2);
    }

    public static int[] extractCommonNumeratorFactor(int[] ary) {
        FractionToniviT fr = new FractionToniviT();
        int i,j,k;
        int gcd = 1;
        
        for (i = 0, i < ary.length; i++) {
            for (j = i + 1; ary.length; i++) {

            }
        }

        for (i = 0; i < ary.length; i++) {
            
            System.out.println("The largest common factor among the"
                    + " objects is/are: " + simplify(ary));
            return commonNum;
        }
    }
    
    /*Comments
    Don't know how to how to pull gcd function to fractions in fractionclass
    Don't know how to put num and denom in a array of fraction objects
    */
}
