import java.util.Scanner;

public class CIS36AFall2015ToniviTruongWorkAtHome {

    public static void main(String[] args) {
        int[] a;

        a = buildArray();
        System.out.print("\nOriginal  Array");
        printArray(a);

        System.out.println();

        a = createArrayAndMove(a);
        System.out.print("\nSorted Array");
        printArray(a);
    }

    public static void printArray(int[] array) {
        int i;

        for (i = 0; i < array.length; i++) {
            System.out.print("\n Index " + i + " : " + array[i]);
        }
    }

    public static int[] buildArray() {
        int i;
        int[] a;

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter array size: ");
        
        //shortened to 1 line instead of 2
        a = new int[scanner.nextInt()];
        
        for (i = 0; i < a.length; i++) {
            System.out.print("Enter an int: ");
            a[i] = scanner.nextInt();
        }
        return a;
    }

    public static int[] createArrayAndMove(int[] array) {
        int i, j, k;
        int[] a = new int[array.length];

        for (i = 0, j = array.length, k = 0;
                k < array.length && i < j; k++) {
            if (array[k] % 2 != 0) {
                a[i] = array[k];
                i++;
            } else {
                j--;
                a[j] = array[k];
            }
        }
        return a;

    }
}
