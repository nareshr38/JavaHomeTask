package com.ranguht.code.javabasics.designpatterns.strategy;

public class CreditCard {
    private String number;
    private String date;
    private String cvv;
    private String name;

    public CreditCard(String number, String date, String cvv, String name) {
        this.number = number;
        this.date = date;
        this.cvv = cvv;
        this.name = name;
    }

    public CreditCard(String number) {
        this.number = number;
    }

    private CardValidator validator = null;

    public boolean isValid(CardValidator validator) {
        this.setValidator(validator);
        return validator.validate(this);
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CardValidator getValidator() {
        return validator;
    }

    public void setValidator(CardValidator validator) {
        this.validator = validator;
    }

}