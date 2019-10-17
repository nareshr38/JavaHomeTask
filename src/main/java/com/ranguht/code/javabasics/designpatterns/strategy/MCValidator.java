package com.ranguht.code.javabasics.designpatterns.strategy;

public class MCValidator implements CardValidator {

    public boolean validate(CreditCard creditcard) {
        return creditcard.getNumber().startsWith("MC");
    }

}