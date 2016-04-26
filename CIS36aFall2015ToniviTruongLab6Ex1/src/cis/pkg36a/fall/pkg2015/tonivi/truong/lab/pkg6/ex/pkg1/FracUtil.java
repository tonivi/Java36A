 /*
 * Project Name : FractionUtil.java
 * Discussion :   Fraction Utility Class
 * Written By :   Tonivi Truong
 * Date :         2015/12/1
 */

package cis.pkg36a.fall.pkg2015.tonivi.truong.lab.pkg6.ex.pkg1;

import java.util.Scanner;

public class FracUtil {

    public static FractionToniviT createFracObject() {
        int num, denom;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter num: ");
        num = scanner.nextInt();
        System.out.print("Enter denom: ");
        denom = scanner.nextInt();
        if (denom == 0) {
            do {
                System.out.println("Denominator cannot be zero !");
                System.out.print("Please try again!: ");
                denom = scanner.nextInt();
            } while (denom == 0);
        }

        num = (num < 0) ? -num : num;
        denom = (denom < 0) ? -denom : denom;

        return new FractionToniviT(num, denom);
    }

    public static FractionToniviT add(FractionToniviT a,
            FractionToniviT b) {
        return new FractionToniviT(
                a.getNum() * b.getDenom() + a.getDenom() * b.getNum(),
                a.getDenom() * b.getDenom());
    }

    public static FractionToniviT subtract(FractionToniviT a,
            FractionToniviT b) {
        return new FractionToniviT(
                a.getNum() * b.getDenom() - a.getDenom() * b.getNum(),
                a.getDenom() * b.getDenom());
    }

    public static FractionToniviT multiply(FractionToniviT a,
            FractionToniviT b) {
        return new FractionToniviT(
                a.getNum() * b.getNum(), a.getDenom() * b.getDenom());
    }

    public static FractionToniviT divide(FractionToniviT a,
            FractionToniviT b) {
        return new FractionToniviT(
                a.getNum() * b.getDenom(), a.getDenom() * b.getNum());
    }
}
