package com.ranguht.code.javabasics.hometask_6;

public class MaxMirror {
    public int elementInReverse(int[] nums) {
        int max = 0;

        for (int index = 0; index < nums.length; index++) {
            int counter = 0;
            for (int jindex = nums.length - 1; jindex >= 0 && index + counter < nums.length; jindex--) {
                if (nums[index + counter] == nums[jindex]) {
                    counter++;
                } else {
                    max = Math.max(max, counter);
                    counter = 0;
                }
            }

            max = Math.max(max, counter);
        }

        return max;
    }
}
