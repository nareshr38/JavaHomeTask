package com.ranguht.code.javabasics.hT2_1to2_3;

public class Caughtspeeding {
    static int speed;
    public static void main(String[] args) {


        int CaughtSpeed=speed(65,false);
        System.out.println(CaughtSpeed);
    }

    public static int speed(int speed,boolean isBirthday) {

        if(isBirthday == false) {
            if (speed <= 60) {
                return 0;

            } else if (speed >= 61 && speed <= 80) {
                return 1;
            } else {

                return 2;
            }
        }
        else
        {
            if (speed <= 65)
            {
                return 0;

            } else if (speed >= 66 && speed <= 85)
            {
                return 1;
            } else
            {

                return 2;
            }
        }
    }
}
