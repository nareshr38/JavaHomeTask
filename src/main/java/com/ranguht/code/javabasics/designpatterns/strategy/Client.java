package com.ranguht.code.javabasics.designpatterns.strategy;

public class Client {
    public static void main(String[] args) {
        CreditCard masterCard = new CreditCard("MC-123456");
//        CreditCard visaCard = new CreditCard("VI-123456");
        CreditCard amexCard = new CreditCard("NR-123456");

        CardValidator validator = new MCValidator();
        masterCard.setValidator(validator);


    }
}