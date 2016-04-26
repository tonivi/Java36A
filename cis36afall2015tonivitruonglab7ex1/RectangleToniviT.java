 /*
 * Project Name : RectangleToniviT.java
 * Discussion :   Rectangle Class
 * Written By :   Tonivi Truong
 * Date :         2015/12/17
 */
package cis36afall2015tonivitruonglab7ex1;

public class RectangleToniviT extends Shape implements Cloneable {

    private PointToniviT ur;
    private PointToniviT ll;

    public RectangleToniviT() {
        super();
        this.ll = new PointToniviT();
        this.ur = new PointToniviT();
    }

    public RectangleToniviT(PointToniviT ur, PointToniviT ll) {
        super();
        this.ll = ll;
        this.ur = ur;
    }

    public PointToniviT getUr() {
        return ur;
    }

    public PointToniviT getLl() {
        return ll;
    }

    public static RectangleToniviT createRec() {
        PointToniviT Up;
        PointToniviT Lp;
        System.out.println("  Upper Right Point: ");
        Up = PointToniviT.createPoint();
        System.out.println("\n  Lower Left Point: ");
        Lp = PointToniviT.createPoint();
        return new RectangleToniviT(Up, Lp);
    }

    @Override
    public FractionToniviT computeArea() {
        int a;
        FractionToniviT x = FracUtil.subtract(ll.getX(), ur.getX());
        FractionToniviT y = FracUtil.subtract(ur.getY(), ll.getY());
        x = FracUtil.multiply(x, y);
        x.simplify(x.getNum(), x.getDenom());

        if (x.getNum() < 0) {
            a = -x.getNum();
            x.setNum(a);
        }
        return x;
    }

    @Override
    public FractionToniviT computeVolume() {
        return null;
    }

    public int compareTo(Shape s) {
        if (computeArea().compareTo(s.computeArea()) == 1) {
            return 1;
        } else if (computeArea().compareTo(s.computeArea()) == -1) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "\n    Upper Right : \n" + ur
                + "\n    Lower Left : \n" + ll;
    }

    @Override
    public RectangleToniviT clone() throws CloneNotSupportedException {
        try {
            RectangleToniviT a = (RectangleToniviT) super.clone();
            a.ur = (PointToniviT) ur.clone();
            a.ll = (PointToniviT) ll.clone();
            return a;
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }
}
