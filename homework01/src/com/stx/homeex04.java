package com.stx;

public class homeex04 {
    public static void main(String[] args) {
        Dog dog = new Dog("小夫","白色",5);
        dog . show();
    }
}

class Dog {
    String name;
    int age;
    String color;

    public Dog(String name, String color, int age) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void show() {
        System.out.println("小狗的名字叫" + name);
        System.out.println("小狗的年龄是" + age + "岁");
        System.out.println("小狗的毛色是" + color);
    }
}