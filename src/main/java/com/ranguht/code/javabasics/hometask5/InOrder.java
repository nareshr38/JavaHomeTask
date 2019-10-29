package com.ranguht.code.javabasics.hometask5;

public class InOrder {

    public boolean Order(int a, int b, int c, boolean bool) {

        if (bool)
            return c > b;

        return b > a && c > b;

    }
}

