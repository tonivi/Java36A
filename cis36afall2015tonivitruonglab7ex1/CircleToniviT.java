 /*
 * Project Name : CircleToniviT.java
 * Discussion :   Circle Class
 * Written By :   Tonivi Truong
 * Date :         2015/12/17
 */
package cis36afall2015tonivitruonglab7ex1;

public class CircleToniviT extends Shape implements Cloneable {

    private PointToniviT cen;
    private FractionToniviT rad;

    public CircleToniviT() {
        super();
        cen = new PointToniviT();
        rad = new FractionToniviT();
    }

    public CircleToniviT(FractionToniviT r, PointToniviT c) {
        super();
        rad = r;
        cen = c;
    }

    CircleToniviT(PointToniviT center, FractionToniviT radius) {
        cen = center;
        rad = radius;
    }

    public void setRadius(FractionToniviT r) {
        rad = r;
    }

    public FractionToniviT getRadius() {
        return rad;
    }

    public PointToniviT getCen() {
        return cen;
    }

    public void setCen(PointToniviT c) {
        cen = c;
    }

    public static CircleToniviT createCir() {
        PointToniviT center;
        FractionToniviT radius;

        System.out.println("  Center Point: ");
        center = PointToniviT.createPoint();
        System.out.println("\n  Radius Fraction: ");
        radius = FracUtil.createFracObject();
        return new CircleToniviT(center, radius);
    }

    public static FractionToniviT computeCircleArea(PointToniviT center,
            FractionToniviT radius) {
        int a;
        FractionToniviT pi = new FractionToniviT(157, 50);
        FractionToniviT d = FracUtil.multiply(radius, radius);
        FractionToniviT area = FracUtil.multiply(d, pi);
        area.simplify(area.getNum(), area.getDenom());
        if (area.getNum() < 0) {
            a = -area.getNum();
            area.setNum(a);
        }
        return area;
    }

    @Override
    public FractionToniviT computeArea() {
        int a;
        FractionToniviT pi = new FractionToniviT(157, 50);
        FractionToniviT d = FracUtil.multiply(rad, rad);
        FractionToniviT area = FracUtil.multiply(d, pi);
        area.simplify(area.getNum(), area.getDenom());
        if (area.getNum() < 0) {
            a = -area.getNum();
            area.setNum(a);
        }
        return area;
    }

    @Override
    public FractionToniviT computeVolume() {
        return new FractionToniviT();
    }

    @Override
    public String toString() {
        return "\n    Center: \n" + cen + "\n    Radius : \n" + rad;
    }

    @Override
    public CircleToniviT clone() throws CloneNotSupportedException {
        try {
            CircleToniviT a = (CircleToniviT) super.clone();
            a.cen = (PointToniviT) cen.clone();
            a.rad = (FractionToniviT) rad.clone();
            return a;
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }
}
