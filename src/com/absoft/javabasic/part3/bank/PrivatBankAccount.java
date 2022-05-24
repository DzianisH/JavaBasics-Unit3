package com.absoft.javabasic.part3.bank;

public class PrivatBankAccount extends BankAccount{

    public PrivatBankAccount(String currency) {
        super(currency);
    }

    @Override
    protected void transferMoney(double amount) {
        System.out.println("Sending " + amount + " of " + getCurrency() + " via privat....");

//        System.out.println(currency); // error
    }

    @Override
    String getBankName() {
        return "Privat";
    }
}
