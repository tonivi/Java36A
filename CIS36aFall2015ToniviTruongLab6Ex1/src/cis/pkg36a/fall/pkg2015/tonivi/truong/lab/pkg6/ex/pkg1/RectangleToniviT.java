 /*
 * Project Name : RectangleToniviT.java
 * Discussion :   Rectangle Class
 * Written By :   Tonivi Truong
 * Date :         2015/12/1
 */
package cis.pkg36a.fall.pkg2015.tonivi.truong.lab.pkg6.ex.pkg1;

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

    @Override
    public FractionToniviT computeArea() {
        int a;
        FractionToniviT x = FracUtil.subtract(
                ll.getX(), ur.getX());
        FractionToniviT y = FracUtil.subtract(
                ur.getY(), ll.getY());

        x = FracUtil.multiply(x, y);
        x.simplify(x.getNum(), x.getDenom());

        if (x.getNum() < 0) {
            a = -x.getNum();
            x.setNum(a);
        }
        return x;
    }

    public int compareCirArea(CircleToniviT cir) {
        FractionToniviT recArea = this.computeArea();
        FractionToniviT cirArea = cir.computeArea();
        if (recArea.compareTo(cirArea) == 1) {
            return 1;
        } else if (recArea.compareTo(cirArea)
                == -1) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public FractionToniviT computeVolume() {
        return null;
    }

    @Override
    public String toString() {
        return "\n   Upper Right : " + ur + "\n   Lower Left : " + ll;
    }

    @Override
    public RectangleToniviT clone() throws CloneNotSupportedException {
        return (RectangleToniviT) super.clone();
    }
}
