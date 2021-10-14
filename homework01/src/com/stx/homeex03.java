package com.stx;

public class homeex03 {
    public static void main(String[] args) {
        cale c = new cale(10.0,5.0);
        System.out.println("和"+c.summation());
        System.out.println("积"+c.mul());
        System.out.println("差"+c.sub());
        Double res =c.div();
        if (res!=null){
            System.out.println("商："+c.div());
        }
    }
}

class cale {
    double n1;
    double n2;

    public cale(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double summation() {

        return n1 + n2;
    }

    public double sub() {

        return n1 - n2;
    }

    public double mul() {
        return n1 * n2;
    }

    public Double div() {
        if (n2 == 0) {
            System.out.println("除数不得为0");
            return null;
        } else {
            return n1 / n2;
        }
    }
}