package com.tom.javalib;

public class Person {
    float weight;
    float height;
    public void sayHello() {
        System.out.println("Hello");
    }
    public float getBmi() {
        float bmi = weight / (height * height);
        return bmi;
    }
    public float getWeight() {
        return weight;
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.height = 1.7f;
        p.weight = 65f;
        System.out.println("Your BMI is " + p.getBmi());
    }
}
