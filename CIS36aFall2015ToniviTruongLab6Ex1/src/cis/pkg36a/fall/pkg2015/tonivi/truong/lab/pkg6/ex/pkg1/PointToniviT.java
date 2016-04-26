 /*
 * Project Name : PointToniviT.java
 * Discussion :   Point Class
 * Written By :   ToniviToniviT
 * Date :         2015/12/1
 */

package cis.pkg36a.fall.pkg2015.tonivi.truong.lab.pkg6.ex.pkg1;

public class PointToniviT {

    private FractionToniviT fx;
    private FractionToniviT fy;

    public PointToniviT() {
        super();
        fx = new FractionToniviT();
        fy = new FractionToniviT();
    }

    public PointToniviT(PointToniviT arg) {
        fx = new FractionToniviT(arg.fx);
        fy = new FractionToniviT(arg.fy);
    }

    public PointToniviT(FractionToniviT fr) {
        fx = new FractionToniviT(fr);
        fy = new FractionToniviT(fr);
    }

    public PointToniviT(FractionToniviT fr, FractionToniviT fr2) {
        fx = new FractionToniviT(fr);
        fy = new FractionToniviT(fr2);
    }

    public void setX(FractionToniviT arg) {
        fx = arg;
    }

    public FractionToniviT getX() {
        return fx;
    }

    public void setY(FractionToniviT arg) {
        fy = arg;
    }

    public FractionToniviT getY() {
        return fy;
    }

    public void moveBy(FractionToniviT fr1, FractionToniviT fr2) {
        fx.add(fr1);
        fy.add(fr2);
    }

    public void moveBy(int arg) {
        FractionToniviT fr = new FractionToniviT(arg);
        fx.simplify(fx.getNum(), fx.getDenom());
        fx.add(fr);
        fx.simplify(fy.getNum(), fy.getDenom());
        fy.add(fr);
    }

    public void flipByX() {
        fx.setNum(-fx.getNum());
    }

    public void flipByY() {
        fy.setNum(-fy.getNum());
    }

    public void flipThroughOrigin() {
        fx.setNum(-fx.getNum());
        fy.setNum(-fy.getNum());
    }

    public static PointToniviT createPoint() {
        FractionToniviT Xp;
        FractionToniviT Yp;
        System.out.println("Enter X Point: ");
        Xp = FracUtil.createFracObject();
        System.out.println("Enter Y Point: ");
        Yp = FracUtil.createFracObject();
        return new PointToniviT(Xp, Yp);
    }

    @Override
    public String toString() {
        return "X Point: " + fx.getNum() + " / " + fx.getDenom()
                + "\nY Point: " + fy.getNum() + " / " + fy.getDenom();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        try {
            PointToniviT a = (PointToniviT) super.clone();
            return a;
        } catch (CloneNotSupportedException b) {
            return null;
        }
    }
}
