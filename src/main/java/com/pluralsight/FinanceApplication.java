package com.pluralsight;


import com.pluralsightfinance.BankAccount;


public class FinanceApplication {
    public static <Valuable> void main(String[] args) {

        BankAccount account1 = new BankAccount("Joey", "123", 12500);
        Valuable account2 = (Valuable) new BankAccount("Chandler", "456", 1500);
// try to deposit money into both accounts
        account1.deposit(100);
        account2.deposit(100);

    }
}
