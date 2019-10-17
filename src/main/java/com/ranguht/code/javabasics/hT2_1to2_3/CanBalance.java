package com.ranguht.code.javabasics.hT2_1to2_3;

public class CanBalance {
    public static void main(String[] args) {
        int [] CanBalancedata=  {1, 1, 1, 2, 1};
        boolean canBalanceResult = canBalance(CanBalancedata);
        System.out.println(canBalanceResult);

    }

    public static boolean canBalance(int[] nums) {
        int first = 0;
        int second = 0;

        for(int i = 0; i < nums.length; i++)
            second += nums[i];

        for(int i = 0; i <= nums.length - 2; i++) {
            first += nums[i];
            second -= nums[i];

            if(first == second)
                return true;
        }

        return false;
    }
}
