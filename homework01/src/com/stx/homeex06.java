package com.stx;

public class homeex06 {
    public static void main(String[] args) {

    }
}

class Circle {
    double r;

    public double findArea(double r) {
        return 3.14 * r * r;
    }
}

class PassObject {
    public void printAreas(Circle c, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(i);
        }
    }
}