package com.stx;

public class homeex05 {
    public static void main(String[] args) {

    }
}

class Employee {
    String name;
    String gender;
    int age;
    String occupation;
    double salary;

    public Employee(String occupation, double salary) {
        this.occupation = occupation;
        this.salary = salary;
    }

    public Employee(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Employee(String name, int age, String gender, String occupation, double salary) {
        this(name, age, gender);
        this.occupation = occupation;
        this.salary = salary;

    }

}