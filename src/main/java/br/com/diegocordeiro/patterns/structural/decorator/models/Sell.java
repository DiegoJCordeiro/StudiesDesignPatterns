package br.com.diegocordeiro.patterns.structural.decorator.models;

import java.math.BigDecimal;

public abstract class Sell {

    protected BigDecimal value = new BigDecimal("0.0");

    public void sum(Double value){

        this.value = this.value.add(new BigDecimal(value));
    }

    public abstract Double percentSell();
}
