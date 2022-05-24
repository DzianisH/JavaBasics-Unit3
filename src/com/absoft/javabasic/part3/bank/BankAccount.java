package com.absoft.javabasic.part3.bank;

public abstract class BankAccount {
    private double amount;
    private final String currency;

    public BankAccount(String currency) {
        this.currency = currency;
    }

    public void withdraw(double amount) {
        transferMoney(amount);

        this.amount -= amount;
    }

    public void receive(double amount) {
        this.amount += amount;
    }


    public String getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }

    protected abstract void transferMoney(double amount);

    abstract String getBankName();

    @Override
    public String toString() {
        return amount + " " + currency + " in " + getBankName();
    }
}
