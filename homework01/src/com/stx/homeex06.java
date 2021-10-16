package com.stx;

public class homeex06 {
    public static void main(String[] args) {
        Circle C= new Circle();
        PassObject p = new PassObject();
        p.printAreas(C, 5);
    }
}

class Circle {
    double r;

    public double findArea() {
        return 3.14 * r * r;
    }

    public void setRadius(double r) {
        this.r = r;
    }
}


class PassObject {
    public void printAreas(Circle c, int times) {
        for (int i = 0; i <= times; i++) {
            System.out.println("r\tarea");
            c.setRadius(i);
            System.out.println(i + "\t" + c.findArea());
        }
    }
}