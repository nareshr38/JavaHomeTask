package com.ranguht.code.javabasics.designpatterns.factory;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}