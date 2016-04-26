/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis36afall2015tonivitruonglab5ex1;

public class PointToniviT {

    private FractionToniviT fx;
    private FractionToniviT fy;

    public PointToniviT() {
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
        //fx.simplify(fx.getNum(), fx.getDenom());
        fx.add(fr);
        //fx.simplify(fy.getNum(), fy.getDenom());
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

    public void print() {
        System.out.println("X Point: " + fx.getNum() + " / " + fx.getDenom()
                + "\nY Point: " + fy.getNum() + " / " + fy.getDenom());
    }
}
