package com.ranguht.code.javabasics.hometask_6;

public class MaxSpan {
 /*   static int max = 0;

    public static void main(String[] args) {
        int[] maxSpanData = {1, 4, 2, 1, 4, 1, 4};
        int maxSpanResult = noOfElementsInSpan(maxSpanData);
        System.out.println(maxSpanResult);

    }*/

    public static int noOfElementsInSpan(int[] nums) {
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            int j = nums.length - 1;

            while (nums[i] != nums[j])
                j--;

            int span = j - i + 1;

            if (span > max)
                max = span;
        }

        return max;
    }


}