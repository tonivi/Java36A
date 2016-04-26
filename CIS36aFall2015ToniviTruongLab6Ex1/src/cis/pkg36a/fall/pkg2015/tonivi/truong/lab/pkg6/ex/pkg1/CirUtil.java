/*
 * Project Name : CirUtil.java
 * Discussion :   Circle Utility Class
 * Written By :   Tonivi Truong
 * Date :         2015/12/1
 */
package cis.pkg36a.fall.pkg2015.tonivi.truong.lab.pkg6.ex.pkg1;

public class CirUtil {

    public static CircleToniviT createCir() {
        PointToniviT center;
        FractionToniviT radius;

        System.out.println("Center Point : ");
        center = PointToniviT.createPoint();
        System.out.println("Radius Fraction : ");
        radius = FracUtil.createFracObject();
        if (radius.getNum() < 0) {
            do {
                System.out.println("\nChoose a positive integer for radius: ");
                radius = FracUtil.createFracObject();
            } while (radius.getNum() < 0);
        }
        return new CircleToniviT(center, radius);
    }

    public static FractionToniviT computeCircleArea(
            PointToniviT center,
            FractionToniviT radius) {
        int a;
        FractionToniviT pi = new FractionToniviT(
                157, 50);
        FractionToniviT diameter = FracUtil.multiply(
                radius, radius);
        FractionToniviT area = FracUtil.multiply(
                diameter, pi);
        area.simplify(area.getNum(), area.getDenom());
        if (area.getNum() < 0) {
            a = -area.getNum();
            area.setNum(a);
        }
        return area;
    }

    public static void compareCirArea(CircleToniviT[] cir) {
        FractionToniviT x = cir[0].computeArea();
        FractionToniviT y = cir[1].computeArea();
        if (x.compareTo(y) == 1) {
            System.out.println("\nCircle #1 has an area of:" + x
                    + "\nWhich is LARGER THAN\n"
                    + "\nCircle #2's AREA :" + y);
        } else if (x.compareTo(y) == -1) {
            System.out.println("\nCircle #2 has an area of:" + y
                    + "\nWhich is LARGER THAN Circle #1's AREA :" + x);
        } else {
            System.out.println("\nThe areas are equal!" + x);
        }
    }
}
