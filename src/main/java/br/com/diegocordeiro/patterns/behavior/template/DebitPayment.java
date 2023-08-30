package br.com.diegocordeiro.patterns.behavior.template;

import java.math.BigDecimal;

public class DebitPayment extends TemplateMethod {

    @Override
    boolean executePayment(String account, BigDecimal value) {

        System.out.println("This payment is on Debit to account " + account + " and value " + value);

        return false;
    }
}
