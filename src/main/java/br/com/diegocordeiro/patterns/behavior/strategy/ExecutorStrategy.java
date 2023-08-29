package br.com.diegocordeiro.patterns.behavior.strategy;

import br.com.diegocordeiro.patterns.ExecutorPatterns;
import br.com.diegocordeiro.patterns.behavior.strategy.models.Method;
import br.com.diegocordeiro.patterns.behavior.strategy.models.Payment;
import br.com.diegocordeiro.patterns.behavior.strategy.payment.MethodPaymentStrategy;
import br.com.diegocordeiro.patterns.behavior.strategy.payment.impl.CreditCardStrategy;
import br.com.diegocordeiro.patterns.behavior.strategy.payment.impl.DebitCardStrategy;

import java.math.BigDecimal;

public class ExecutorStrategy implements ExecutorPatterns {

    @Override
    public void execute() {

        System.out.println("----- Start - Using Strategy Pattern. -----");
        System.out.println("----- -----");

        Payment debitPayment = new Payment.Builder()
                .withLabel("Visa")
                .withPaymentMethod(Method.DEBIT)
                .withValue(new BigDecimal("10.0"))
                .build();

        Payment creditPayment = new Payment.Builder()
                .withLabel("Mastercard")
                .withPaymentMethod(Method.CREDIT)
                .withValue(new BigDecimal("10.0")).build();

        MethodPaymentStrategy debitPaymentStrategy = new DebitCardStrategy(debitPayment);
        MethodPaymentStrategy creditPaymentStrategy = new CreditCardStrategy(creditPayment);

        debitPaymentStrategy.process();
        creditPaymentStrategy.process();

        System.out.println("----- -----");
        System.out.println("----- End - Using Strategy Pattern. -----");
    }
}
