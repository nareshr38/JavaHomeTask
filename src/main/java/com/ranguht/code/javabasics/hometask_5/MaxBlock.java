package com.ranguht.code.javabasics.hometask_5;

public class MaxBlock {

    public int maxCharInAString(String blockOfString) {
        int maxCounter = 1;
        int counter = 1;
        if (blockOfString.isEmpty()) {
            return 0;
        }
        for (int index = 1; index < blockOfString.length(); index++) {
            if (blockOfString.charAt(index - 1) == blockOfString.charAt(index)) {
                counter = counter + 1;
                if (counter > maxCounter) {
                    maxCounter = counter;
                }
            } else {
                counter = 1;
            }
        }

        return maxCounter;
    }

}
