package com.ranguht.code.javabasics.hometask_6;

public class CountClumps {
    /*public static void main(String[] args) {
        int[] countClumpsData = {1, 2, 2, 3, 4, 4};
        int countClumpsResult = seriesInArray(countClumpsData);
        System.out.println(countClumpsResult);
    }*/

    public static int seriesInArray(int[] nums) {

        int count = 0;
        int i = 0;

        while (i < nums.length) {
            int val = nums[i];
            i++;
            int length = 1;
            while (i < nums.length && nums[i] == val) {
                i++;
                length++;
            }

            if (length > 1)
                count++;
        }

        return count;
    }


}