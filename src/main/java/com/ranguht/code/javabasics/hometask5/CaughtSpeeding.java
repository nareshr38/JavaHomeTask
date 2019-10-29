package com.ranguht.code.javabasics.hometask5;

public class CaughtSpeeding {

    public int speed(int speed, boolean isBirthday) {

        if (!isBirthday) {
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
