package com.ranguht.code.javabasics.hT2_1to2_3;
public class MaxBlock {
    static String str;

    public static void main(String[] args) {
        int MaxBlockResult=maxBlock("abbCCCddBBBxx");
        System.out.println(MaxBlockResult);
    }
    public static int maxBlock(String str) {
        int maxCounter = 1;
        int counter = 1;
        if (str.isEmpty()) {
            return 0;
        }
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == str.charAt(i)) {
                if (++counter > maxCounter) {
                    maxCounter = counter;
                }
            } else {
                counter = 1;
            }
        }

        return maxCounter;
    }

}