package br.com.diegocordeiro.patterns.behavior.strategy.payment.impl;

import br.com.diegocordeiro.patterns.behavior.strategy.models.Method;
import br.com.diegocordeiro.patterns.behavior.strategy.models.Payment;
import br.com.diegocordeiro.patterns.behavior.strategy.payment.MethodPaymentStrategy;

public class DebitCardStrategy implements MethodPaymentStrategy {

    private final Payment payment;

    public DebitCardStrategy(Payment payment) {
        this.payment = payment;
    }

    @Override
    public void process() {

        if(!this.payment.getPaymentMethod().equals(Method.DEBIT)){
            throw new RuntimeException("Not is possible process this payment. Payment Method invalid.");
        }

        System.out.println("Process Payment Method - Debit.");
    }
}
