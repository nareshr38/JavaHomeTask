package com.ranguht.code.javabasics.hometask_6;
public class LinearIn {
    /*public static void main(String[] args) {
        int[] outerLinearInData = {1, 2, 4, 6};
        int[] InnerLinearInData = {2, 3, 4};
        boolean linearInResult = twoArrayCompare(outerLinearInData, InnerLinearInData);
        System.out.println(linearInResult);
    }*/

    public static boolean twoArrayCompare(int[] outer, int[] inner) {
        int i = 0;
        int j = 0;

        while (i < inner.length && j < outer.length) {
            if (inner[i] > outer[j]) {
                j++;
            } else if (inner[i] < outer[j]) {
                return false;
            } else {
                i++;
            }
        }

        if (i != inner.length)
            return false;

        return true;
    }
}
