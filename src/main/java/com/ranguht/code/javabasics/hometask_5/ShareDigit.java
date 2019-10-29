package com.ranguht.code.javabasics.hometask_5;

public class ShareDigit {

    public boolean digit(int a, int b) {

        return a / 10 == b / 10 || a / 10 == b % 10 || a % 10 == b / 10 || a % 10 == b % 10;

    }
}