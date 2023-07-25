package br.com.diegocordeiro.patterns.structural.proxy.services;

import java.math.BigDecimal;

public class ATMProxy implements Operations {

    private Operations bankService;

    public ATMProxy(Operations bankService){

        this.bankService = new BankService();
    }

    @Override
    public boolean deposit(String account, BigDecimal value) {

        System.out.println("Deposit Operation - Proxy");

        return this.bankService.deposit(account, value);
    }

    @Override
    public boolean transfer(String accountSource, String accountTarget, BigDecimal value) {

        System.out.println("Transfer Operation - Proxy");

        return this.bankService.transfer(accountSource, accountTarget, value);
    }

    @Override
    public boolean grab(String account, BigDecimal value) {

        System.out.println("Grab Operation - Proxy");

        return this.bankService.grab(account, value);
    }
}
