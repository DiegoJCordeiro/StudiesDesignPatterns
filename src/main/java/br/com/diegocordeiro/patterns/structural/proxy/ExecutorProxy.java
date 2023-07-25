package br.com.diegocordeiro.patterns.structural.proxy;

import br.com.diegocordeiro.patterns.ExecutorPatterns;
import br.com.diegocordeiro.patterns.structural.proxy.services.ATMProxy;
import br.com.diegocordeiro.patterns.structural.proxy.services.BankService;
import br.com.diegocordeiro.patterns.structural.proxy.services.Operations;

import java.math.BigDecimal;

public class ExecutorProxy implements ExecutorPatterns {

    @Override
    public void execute() {

        System.out.println("----- Start - Using Proxy Pattern. -----");

        String firstAccount = "11111-1";
        BigDecimal firstValue = new BigDecimal("100.0");

        String secondAccount = "22222-2";

        Operations bankOperations = new BankService();

        bankOperations.deposit(firstAccount, firstValue);
        bankOperations.deposit(secondAccount, firstValue);
        bankOperations.transfer(firstAccount, secondAccount, new BigDecimal("50.0"));
        bankOperations.grab(secondAccount, new BigDecimal("50.0"));

        Operations atmOperations = new ATMProxy(bankOperations);

        atmOperations.deposit(firstAccount, firstValue);
        atmOperations.deposit(secondAccount, firstValue);
        atmOperations.transfer(firstAccount, secondAccount, new BigDecimal("50.0"));
        atmOperations.grab(secondAccount, new BigDecimal("50.0"));

        System.out.println("----- End - Using Proxy Pattern. -----");
    }
}