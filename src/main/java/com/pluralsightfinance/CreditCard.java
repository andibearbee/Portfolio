package com.pluralsightfinance;

public class CreditCard implements Valuable {
    private String name, accountNumber;
    private double balance;

    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public static double Charge(double amount) {
        return amount;
    }
    public static double Pay(double amount) {
        return amount;
    }


    @Override
    public double getValue() {
        return 0;
    }
}
