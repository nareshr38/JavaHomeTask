package com.ranguht.code.javabasics.hometask_5;

public class TeaParty {
    public int partyDescription(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        } else if ((tea >= 2 * candy) || (candy >= 2 * tea)) {
            return 2;
        } else {
            return 1;
        }
    }
}
