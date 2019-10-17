package com.ranguht.code.javabasics.hometask_4;

public class MaxAndMin {
    public static void main(String[] args) {
        int arr[] = {4, 5, 1, 23, 56};
        int minimum = arr[0];
        int maximum = arr[0];

        for (int index = 0; index < arr.length; index++) {

            if (arr[index] < arr[0])
                minimum = arr[index];
            else if (arr[index] > arr[0])
                maximum = arr[index];
        }

        System.out.println("Smallest Number in an array is : " + minimum);
        System.out.println("Biggest Number in an array is : " + maximum);


    }
}