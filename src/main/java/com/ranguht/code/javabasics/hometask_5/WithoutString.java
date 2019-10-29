package com.ranguht.code.javabasics.hometask_5;

public class WithoutString {

    public String removeString(String base, String remove) {
        String result = "";
        for (int index = 0; index < base.length(); index++) {
            if (index > base.length() - remove.length()) {
                result =result+ base.substring(index, base.length());
                break;
            } else {
                String substring = base.substring(index, index + remove.length());
                if (!(substring.equalsIgnoreCase(remove))) {
                    result =result+ base.charAt(index);
                } else {
                    index = index + remove.length() - 1;
                }
            }
        }
        return result;
    }

}