package br.com.diegocordeiro.patterns.behavior.template;

import java.math.BigDecimal;

public abstract class TemplateMethod {

    public void process(String account, BigDecimal value){

        if(!account.isEmpty() || value != null)
            this.executePayment(account, value);

        throw new RuntimeException("Value cannot be nullable.");
    }

    abstract boolean executePayment(String account, BigDecimal value);
}
