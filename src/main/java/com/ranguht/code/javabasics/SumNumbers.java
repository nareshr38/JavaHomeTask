package com.ranguht.code.javabasics;
public class SumNumbers {
    public static void main(String[] args) {
        int SumNumbersResult=sumNumbers("abc123xyz");
        System.out.println(SumNumbersResult);

    }
    public static int sumNumbers(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                int count = 0;
                for (int j = i; j < str.length(); j++) {
                    if (Character.isDigit(str.charAt(j))) count++;
                    else break;
                }
                sum += Integer.parseInt(str.substring(i, i + count));
                i += count;
            }
        }
        return sum;
    }

}