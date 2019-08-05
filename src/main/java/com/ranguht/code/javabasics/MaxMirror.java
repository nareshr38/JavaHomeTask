package com.ranguht.code.javabasics;

public class MaxMirror {
    public static void main(String[] args) {
        int [] maxMirrordata=  {1, 2, 3, 8, 9, 3, 2, 1};
        int maxMirrorresult=maxMirror(maxMirrordata);
        System.out.println(maxMirrorresult);
    }
    public static int maxMirror(int[] nums) {
        int max = 0;

        for(int i = 0; i < nums.length; i++) {
            int count = 0;
            for(int j = nums.length - 1; j >= 0 && i + count < nums.length; j--) {
                if(nums[i + count] == nums[j]) {
                    count++;
                } else {
                    max = Math.max(max, count);
                    count = 0;
                }
            }

            max = Math.max(max, count);
        }

        return max;
    }
}
