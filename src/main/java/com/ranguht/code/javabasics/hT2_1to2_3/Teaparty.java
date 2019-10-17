package com.ranguht.code.javabasics.hT2_1to2_3;

public class Teaparty {
    static int tea;
    static int candy;
    public static void main(String[] args) {
        int PartyResult = party(5,5);
        System.out.println(PartyResult);

    }

    public static int party(int tea,int candy) {
        if (tea<5 || candy<5)
        {
            return 0;
        }
        else if ((tea>= 2*candy) ||(candy>=2*tea))
        {
            return 2;
        }

        else
        {
            return 1;
        }
    }
}
