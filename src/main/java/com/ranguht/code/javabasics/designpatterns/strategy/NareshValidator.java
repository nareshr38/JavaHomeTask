package com.ranguht.code.javabasics.designpatterns.strategy;

public class NareshValidator implements CardValidator{

    public boolean validate(CreditCard card) {
        return card.getNumber().contains("NR");
    }

}
