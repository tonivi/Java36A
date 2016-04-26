/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis36afall2015tonivitruongquiz31;

public class FractionToniviT {

    private int num;
    private int denom;

    public FractionToniviT() {
        num = 0;
        denom = 1;
    }

    public FractionToniviT(int n) {
        num = n;
        denom = 1;
    }

    public FractionToniviT(int n, int d) {
        int gcd = 1;
        n /= gcd;
        d /= gcd;
        num = (d < 0) ? -n : n;
        denom = (d < 0) ? -d : d;
    }

    public FractionToniviT(FractionToniviT fr) {
        num = fr.num;
        denom = fr.denom;
    }

    public void setNum(int n) {
        num = n;
    }

    public int getNum() {
        return num;
    }

    public void setDenom(int d) {
        denom = d;
    }

    public int getDenom() {
        return denom;
    }

    public void frac(FractionToniviT fr) {
        num = fr.getNum();
        denom = fr.getDenom();
    }

    public FractionToniviT add(FractionToniviT fr) {
        int numerator = ((num * fr.denom) + (fr.num * denom));
        int denominator = denom * fr.denom;
        simplify(numerator, denominator);
        FractionToniviT arg = new FractionToniviT(numerator, denominator);
        return arg;
    }

    public FractionToniviT subtract(FractionToniviT fr) {
        int numerator = ((num * fr.denom) - (fr.num * denom));
        int denominator = denom * fr.denom;
        simplify(numerator, denominator);
        FractionToniviT arg = new FractionToniviT(numerator, denominator);
        return arg;
    }

    public FractionToniviT multiply(FractionToniviT fr) {
        int numerator = num * fr.num;
        int denominator = denom * fr.denom;
        simplify(numerator, denominator);
        FractionToniviT arg = new FractionToniviT(numerator, denominator);
        return arg;
    }

    public FractionToniviT divide(FractionToniviT fr) {
        int numerator = num * fr.denom;
        int denominator = fr.num * denom;
        FractionToniviT arg = new FractionToniviT(numerator, denominator);
        simplify(numerator, denominator);
        return arg;
    }

    public void print() {
        System.out.print(num + " / " + denom);
    }

    public void simplify(int n, int d) {
        int gcd = 1;
        int temp;
        int a = n;
        int b = d;

        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }

        a = (a < 0) ? -a : a;
        this.num = n / a;
        this.denom = (d < 0) ? -(d / a) : d / a;

        this.num /= gcd;
        this.denom /= gcd;
    }

    public int getGCD(int n, int d) {
        if (n % d == 0) {
            return d;
        } else {
            return getGCD(d, n % d);
        }
    }
}

