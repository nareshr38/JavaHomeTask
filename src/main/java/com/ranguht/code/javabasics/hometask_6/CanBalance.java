package com.ranguht.code.javabasics.hometask_6;

public class CanBalance {


    /*public static void main(String[] args) {
        int[] CanBalanceData = {1, 1, 1, 2, 1};
        boolean canBalanceResult = calculateAfterSplit(CanBalanceData);
        System.out.println(canBalanceResult);

    }*/

    public static boolean calculateAfterSplit(int[] nums) {
        int first = 0;
        int second = 0;

        for (int index = 0; index < nums.length; index++)
            second += nums[index];

        for (int index = 0; index <= nums.length - 2; index++) {
            first += nums[index];
            second -= nums[index];

            if (first == second)
                return true;
        }

        return false;
    }


}