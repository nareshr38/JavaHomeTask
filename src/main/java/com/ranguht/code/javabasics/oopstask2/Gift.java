package com.ranguht.code.javabasics.oopstask2;

import java.util.*;

public class Gift extends Object{

    List gifts = new ArrayList();


    public void add(int number, Object gift) {
        for (int index = 0; index < number; index++) {
            if (gift instanceof Chocolates || gift instanceof Sweets)
                gifts.add(gift);
        }
    }

    public void add(Object gift) {
        gifts.add(gift);
    }

    public List<Gift> getGifts() {
        return gifts;
    }

    public int calculateGiftTotalWeight() {
        int TotalWeight = 0;
        Iterator iterator = gifts.iterator();
        while (iterator.hasNext()) {

            Object object = iterator.next();
            object.getClass().getSimpleName();
            if (object instanceof Chocolates)
                TotalWeight += ((Chocolates) object).grams;
            else if (object instanceof Sweets)
                TotalWeight += ((Sweets) object).grams;
        }
        return TotalWeight;
    }

}