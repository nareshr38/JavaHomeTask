package com.ranguht.code.javabasics;
public class MaxSpan {
    static int max =0;
    public static void main(String[] args) {
        int [] maxSpandata=  {1, 4, 2, 1, 4, 1, 4};
        int maxSpanresult=maxSpan1(maxSpandata);
        System.out.println(maxSpanresult);

    }
    public static int maxSpan1(int[] nums) {
        int max = 0;

        for(int i = 0; i < nums.length; i++) {
            int j = nums.length - 1;

            while(nums[i] != nums[j])
                j--;

            int span = j - i + 1;

            if(span > max)
                max = span;
        }

        return max;
    }


}