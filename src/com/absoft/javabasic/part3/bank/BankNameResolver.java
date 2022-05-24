package com.absoft.javabasic.part3.bank;

import com.absoft.javabasic.part3.bank.BankAccount;

public class BankNameResolver {
    public static String getBankNameOf(BankAccount bankAccount) {
        return bankAccount.getBankName();
    }
}
