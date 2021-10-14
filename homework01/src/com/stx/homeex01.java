package com.stx;

public class homeex01 {
    public static void main(String[] args) {
        book b1 = new book(190);
        b1.updateprice();
    }
}

class book {
    double price;

    public book(double price) {
        this.price = price;
    }

    public void updateprice() {
        if (this.price > 150) {
            this.price = 150;
        } else if (this.price > 100) {
            this.price = 100;
        }
        System.out.println("书本的价格更新为" + this.price);
    }
}