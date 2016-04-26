/*
 * Project Name : RectangleUtil.java
 * Discussion :   Rectangle Utility Class
 * Written By :   Tonivi Truong
 * Date :         2015/12/1
 */
package cis.pkg36a.fall.pkg2015.tonivi.truong.lab.pkg6.ex.pkg1;

public class RectUtil {

    public static RectangleToniviT createRec() {
        PointToniviT Up;
        PointToniviT Lp;
        System.out.println("Upper Right Point: ");
        Up = PointToniviT.createPoint();
        System.out.println("Lower Left Point: ");
        Lp = PointToniviT.createPoint();
        return new RectangleToniviT(Up, Lp);
    }

    public static FractionToniviT computeRecArea(
            PointToniviT l, PointToniviT r) {
        int a;
        FractionToniviT x = FracUtil.subtract(
                l.getY(), r.getX());
        FractionToniviT y = FracUtil.subtract(
                r.getX(), l.getY());
        x = FracUtil.multiply(x, y);
        x.simplify(x.getNum(), x.getDenom());

        if (x.getNum() < 0) {
            a = -x.getNum();
            x.setNum(a);
        }
        return x;
    }

    public static void compareRecArea(RectangleToniviT[] rec) {
        FractionToniviT x = rec[0].computeArea();
        FractionToniviT y = rec[1].computeArea();
        if (x.compareTo(y) == 1) {
            System.out.println("\nRECTANGLE #1 has an area of:" + x
                    + "\nWhich is LARGER THAN\n"
                    + "\nRECTANGLE #2's AREA :" + y);
        } else if (x.compareTo(y) == -1) {
            System.out.println("\nRECTANGLE #2 has an area of:" + y
                    + "\nWhich is LARGER THAN RECTANGLE #1's AREA :" + x);
        } else {
            System.out.println("\nThe areas are equal!" + x);
        }
    }
}
