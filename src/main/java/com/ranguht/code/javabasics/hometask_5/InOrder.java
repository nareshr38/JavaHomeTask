package com.ranguht.code.javabasics.hometask_5;

public class InOrder {

    public boolean order(int a, int b, int c, boolean bool) {

        if (bool)
            return c > b;

        return b > a && c > b;

    }
}

