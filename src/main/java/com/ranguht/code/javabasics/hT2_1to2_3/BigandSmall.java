package com.ranguht.code.javabasics.hT2_1to2_3;

public class BigandSmall {
        public static void main(String[] args) {
            int arr[]={4,5,1,23,56};
            int min = arr[0];
            int max = arr[0];

            for (int index=0;index<arr.length;index++)
            {

                if (arr[index] < arr[0])
                    min = arr[index];
                else
                if(arr[index]> arr[0])
                    max=arr[index];
            }

            System.out.println("Smallest Number is : " + min);
            System.out.println("Biggest Number is : " + max);
        }}
