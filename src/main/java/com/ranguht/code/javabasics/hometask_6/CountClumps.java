package com.ranguht.code.javabasics.hometask_6;

public class CountClumps {

    public int seriesInArray(int[] nums) {

        int counter = 0;
        int index = 0;

        while (index < nums.length) {
            int val = nums[index];
            index++;
            int length = 1;
            while (index < nums.length && nums[index] == val) {
                index++;
                length++;
            }

            if (length > 1)
                counter++;
        }

        return counter;
    }


}
