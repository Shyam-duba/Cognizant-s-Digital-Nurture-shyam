package com.cognizant.account.model;

public class Account {
    private String number;
    private String type;
    private double balance;

    public Account(){}

    public Account(String number, String type, double balance) {
        this.number = number;
        this.balance = balance;
        this.type = type;
    }

    public double getBalance(){return this.balance;}

    public String getNumber(){return this.number;}

    public String getType(){return this.type;}
}
