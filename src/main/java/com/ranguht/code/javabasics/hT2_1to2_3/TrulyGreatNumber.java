package com.ranguht.code.javabasics.hT2_1to2_3;
public class TrulyGreatNumber {
    public static void main(String[] args) {
        boolean GreatNumber =GreatNumber(12,6);
        System.out.println(GreatNumber);

    }
    public static boolean GreatNumber(int a, int b) {
        if(a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6)
            return true;

        return false;
    }
}