/*
 * Project Name : CylinderToniviT.java
 * Discussion :   Cylinder Class
 * Written By :   Tonivi Truong
 * Date :         2015/12/17
 */
package cis36afall2015tonivitruonglab7ex1;

public class CylinderToniviT extends Shape implements Cloneable,
        Comparable<Shape> {

    private CircleToniviT cir;
    private FractionToniviT height;

    public CylinderToniviT() {
        super();
        cir = new CircleToniviT();
        height = new FractionToniviT();
    }

    public CylinderToniviT(CircleToniviT c, FractionToniviT h) {
        super();
        cir = c;
        height = h;
    }

    public static CylinderToniviT createCylinder() {
        CircleToniviT cir;
        FractionToniviT h;
        System.out.println("Base of Cylinder: ");
        cir = CircleToniviT.createCir();
        System.out.println("\nHeight of Cylinder: ");
        h = FracUtil.createFracObject();
        return new CylinderToniviT(cir, h);
    }

    @Override
    public FractionToniviT computeArea() {
        FractionToniviT twoPi = FracUtil.multiply(new FractionToniviT(157,
                50), new FractionToniviT(2));
        FractionToniviT t1
                = FracUtil.multiply(cir.getRadius(), height);
        FractionToniviT t2
                = FracUtil.multiply(cir.getRadius(), cir.getRadius());
        FractionToniviT p1 = twoPi.multiply(t1);
        FractionToniviT p2 = twoPi.multiply(t2);
        FractionToniviT area = FracUtil.add(p1, p2);
        area.simplify(area.getNum(), area.getDenom());
        return area;
    }

    @Override
    public FractionToniviT computeVolume() {
        FractionToniviT pi = new FractionToniviT(157, 50);
        FractionToniviT d
                = FracUtil.multiply(cir.getRadius(), cir.getRadius());
        FractionToniviT piD = FracUtil.multiply(pi, d);
        FractionToniviT volume = FracUtil.multiply(height, piD);
        volume.simplify(volume.getNum(), volume.getDenom());
        return volume;
    }

    @Override
    public String toString() {
        return "\n CENTER: \n" + cir.getCen()
                + "\n RADIUS: \n" + cir.getRadius()
                + "\n HEIGHT: \n" + height;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        try {
            CylinderToniviT a = (CylinderToniviT) super.clone();
            a.cir = cir.clone();
            a.height = (FractionToniviT) height.clone();
            return a;
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    @Override
    public int compareTo(Shape o) {
        if (computeArea().compareTo(o.computeArea()) == 1) {
            return 1;
        } else if (computeArea().compareTo(o.computeArea()) == -1) {
            return -1;
        } else {
            return 0;
        }
    }
}
