package com.ranguht.code.javabasics.hometask_5;

import java.util.Scanner;

public class CaughtSpeeding {
    /*static int speed;
    static boolean isBirthday;

    public static void main(String[] args) {

        System.out.println("Enter the integer number for speed : ");
        Scanner s = new Scanner(System.in);
        speed = s.nextInt();
        System.out.println("Enter the boolean: ");
        isBirthday = s.nextBoolean();
        int speedResult = speed(speed, isBirthday);
        System.out.println(speedResult);
    }*/

    public static int speed(int speed, boolean isBirthday) {

        if (isBirthday == false) {
            if (speed <= 60) {
                return 0;

            } else if (speed >= 61 && speed <= 80) {
                return 1;
            } else {

                return 2;
            }
        } else {
            if (speed <= 65) {
                return 0;

            } else if (speed >= 66 && speed <= 85) {
                return 1;
            } else {

                return 2;
            }
        }
    }
}