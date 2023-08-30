package br.com.diegocordeiro.patterns.behavior.template;

import br.com.diegocordeiro.patterns.ExecutorPatterns;

import java.math.BigDecimal;

public class ExecutorTemplateMethod implements ExecutorPatterns {

    @Override
    public void execute() {

        System.out.println("----- Start - Using Template Method Pattern. -----");
        System.out.println("----- -----");

        TemplateMethod debitPayment = new DebitPayment();
        debitPayment.executePayment("1111-1", new BigDecimal("10.0"));

        TemplateMethod creditPayment = new CreditPayment();
        creditPayment.executePayment("2222-2", new BigDecimal("10.0"));

        System.out.println("----- -----");
        System.out.println("----- End - Using Template Method Pattern. -----");
    }
}
