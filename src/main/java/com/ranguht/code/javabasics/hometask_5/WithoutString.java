package com.ranguht.code.javabasics.hometask_5;

import java.util.Scanner;

public class WithoutString {
    /*public static void main(String[] args) {

        System.out.println("Enter the base string : ");
        Scanner s = new Scanner(System.in);
        String base = s.nextLine();

        System.out.println("Enter the string to remove: ");
        String remove = s.nextLine();
        String WithoutStringResult = removeString(base, remove);
        System.out.println(WithoutStringResult);
    }*/

    public static String removeString(String base, String remove) {
        String result = "";
        for (int i = 0; i < base.length(); i++) {
            if (i > base.length() - remove.length()) {
                result += base.substring(i, base.length());
                break;
            } else {
                String substring = base.substring(i, i + remove.length());
                if (!(substring.equalsIgnoreCase(remove))) {
                    result += base.charAt(i);
                } else {
                    i = i + remove.length() - 1;
                }
            }
        }
        return result;
    }

}