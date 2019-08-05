package com.ranguht.code.javabasics;

public class LinearIn {
    public static void main(String[] args) {
        int[] outerlinearIndata ={1,2,4,6};
        int [] innerlinearIndata=  {2,3,4};
        boolean linearInResult = linearIn(outerlinearIndata,innerlinearIndata);
        System.out.println(linearInResult);
    }
    public static boolean linearIn(int[] outer, int[] inner) {
        int i = 0;
        int j = 0;

        while(i < inner.length && j < outer.length) {
            if(inner[i] > outer[j]) {
                j++;
            } else if(inner[i] < outer[j]) {
                return false;
            } else {
                i++;
            }
        }

        if(i != inner.length)
            return false;

        return true;
    }
}