package com.ranguht.code.javabasics.hT2_1to2_3;

public class SumofArray {
    public static void main(String[] args) {
        int a[]={2,7,3,10,16};
        int counter=0;
        for(int i=0;i<a.length-1;i++)
        {
              counter=counter+a[i];
        }
        System.out.println(counter);
    }
}

