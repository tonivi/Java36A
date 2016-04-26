/*
 * Project Name : BoxToniviT.java
 * Discussion :   Box Class
 * Written By :   Tonivi Truong
 * Date :         2015/12/17
 */
package cis36afall2015tonivitruonglab7ex1;

public class BoxToniviT extends Shape implements Cloneable,
        Comparable<Shape> {

    private RectangleToniviT rec;
    private FractionToniviT height;

    public BoxToniviT() {
        super();
        rec = new RectangleToniviT();
        height = new FractionToniviT();
    }

    public BoxToniviT(RectangleToniviT r, FractionToniviT h) {
        super();
        rec = r;
        height = h;
    }

    public static BoxToniviT createBox() {
        RectangleToniviT rec;
        FractionToniviT h;
        System.out.println("Create Rectangle for Base:");
        rec = RectangleToniviT.createRec();
        System.out.println("\nEnter Fraction for Height:");
        h = FracUtil.createFracObject();
        return new BoxToniviT(rec, h);
    }
    

    @Override
    public FractionToniviT computeArea() {
        FractionToniviT area;
        FractionToniviT two = new FractionToniviT(2);

        FractionToniviT temp1 = rec.computeArea().multiply(two);
        FractionToniviT temp2
                = rec.getUr().getX().subtract(rec.getLl().getX());
        FractionToniviT temp3
                = rec.getUr().getY().subtract(rec.getLl().getY());

        temp2 = temp2.multiply(height);
        temp2 = temp2.multiply(two);
        temp3 = temp3.multiply(height);
        temp3 = temp3.multiply(two);
        area = temp1.add(temp3);
        area = area.add(temp2);
        area.simplify(area.getNum(), area.getDenom());

        if (area.getNum() < 0) {
            area.setNum(-area.getNum());
        }
        return area;
    }

    @Override
    public FractionToniviT computeVolume() {
        FractionToniviT volume
                = FracUtil.multiply(rec.computeArea(), height);
        volume.simplify(volume.getNum(), volume.getDenom());
        return volume;
    }

    @Override
    public String toString() {
        return rec + "\n  HEIGHT: " + height;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        try {
            BoxToniviT a = (BoxToniviT) super.clone();
            a.rec = rec.clone();
            a.height = (FractionToniviT) height.clone();
            return a;
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    @Override
    public int compareTo(Shape s) {
        if (computeArea().compareTo(s.computeArea()) == 1) {
            return 1;
        } else if (computeArea().compareTo(s.computeArea()) == -1) {
            return -1;
        } else {
            return 0;
        }
    }
}
