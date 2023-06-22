package br.com.diegocordeiro.patterns.creational.factorymethod.models;

import java.math.BigDecimal;

public class Samsung extends Phone {
    public Samsung() {
    }

    public Samsung(String name, String model, String level, BigDecimal valor, String information) {
        super(name, model, level, valor, information);
    }
}
