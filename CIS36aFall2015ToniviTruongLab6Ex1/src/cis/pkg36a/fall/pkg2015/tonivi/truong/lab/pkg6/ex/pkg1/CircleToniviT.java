 /*
 * Project Name : CircleToniviT.java
 * Discussion :   Circle Class
 * Written By :   Tonivi Truong
 * Date :         2015/12/1
 */
package cis.pkg36a.fall.pkg2015.tonivi.truong.lab.pkg6.ex.pkg1;

public class CircleToniviT extends Shape implements Cloneable {

    private PointToniviT cen;
    private FractionToniviT rad;
    FractionToniviT pi = new FractionToniviT(157 / 50);

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

    @Override
    public FractionToniviT computeArea() {
        int a;
        FractionToniviT pi = new FractionToniviT(
                157, 50);
        FractionToniviT diameter = FracUtil.multiply(
                rad, rad);
        FractionToniviT area = FracUtil.multiply(
                diameter, pi);
        area.simplify(area.getNum(), area.getDenom());
        if (area.getNum() < 0) {
            a = -area.getNum();
            area.setNum(a);
        }
        return area;
    }

    @Override
    public FractionToniviT computeVolume() {
        return null;
    }

    @Override
    public String toString() {
        return "\n   Center: " + cen + "\n   Radius : " + rad;
    }

    @Override
    public CircleToniviT clone() throws CloneNotSupportedException {
        return (CircleToniviT) super.clone();
    }
}
