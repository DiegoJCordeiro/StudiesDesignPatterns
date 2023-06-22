package br.com.diegocordeiro.patterns.creational.factorymethod.models;

import java.math.BigDecimal;

public class Nokia extends Phone {
    public Nokia() {
    }

    public Nokia(String name, String model, String level, BigDecimal valor, String information) {
        super(name, model, level, valor, information);
    }
}
