package com.ranguht.code.javabasics.hometask5;

public class BlueLotteryTicket {

    public int blueTicket(int a, int b, int c) {

        if (a + b == 10 || b + c == 10 || c + a == 10)
            return 10;
        else if ((a + b >= b + c + 10) || (a + b >= c + a + 10))
            return 5;
        else
            return 0;


    }
}
