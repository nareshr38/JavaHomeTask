package com.ranguht.code.javabasics.hometask5;

public class SumLimit {

    public int sumLimitCompare(int a, int b) {
        int sum = a + b;
        int aLength = String.valueOf(a).length();
        int sumLength = String.valueOf(sum).length();

        if (sumLength == aLength)
            return sum;

        return a;
    }

}