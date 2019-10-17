package com.ranguht.code.javabasics.hT2_1to2_3;

public class SumLimit {
    public static void main(String[] args) {
        int LimitResult = sumLimit(8,3);
        System.out.println(LimitResult);

    }

    public static int sumLimit(int a, int b) {
        int sum = a + b;
        int aLength = String.valueOf(a).length();
        int sumLength = String.valueOf(sum).length();

        if(sumLength == aLength)
            return sum;

        return a;
    }

}