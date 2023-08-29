package br.com.diegocordeiro.patterns.behavior.strategy.payment.impl;

import br.com.diegocordeiro.patterns.behavior.strategy.models.Method;
import br.com.diegocordeiro.patterns.behavior.strategy.models.Payment;
import br.com.diegocordeiro.patterns.behavior.strategy.payment.MethodPaymentStrategy;

public class CreditCardStrategy implements MethodPaymentStrategy {

    private final Payment payment;

    public CreditCardStrategy(Payment payment){
        this.payment = payment;
    }

    @Override
    public void process() {

        if(!this.payment.getPaymentMethod().equals(Method.CREDIT)){
            throw new RuntimeException("Not is possible process this payment. Payment Method invalid.");
        }

        System.out.println("Process Payment Method - Credit.");
    }
}
