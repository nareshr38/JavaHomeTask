package com.ranguht.code.javabasics.hometask6;

public class MaxSpan {

    public int noOfElementsInSpan(int[] nums) {
        int max = 0;

        for (int index = 0; index < nums.length; index++) {
            int jindex = nums.length - 1;

            while (nums[index] != nums[jindex])
                jindex--;

            int span = jindex - index + 1;

            if (span > max)
                max = span;
        }

        return max;
    }


}