package br.com.diegocordeiro.patterns.creational.factorymethod.models;

import java.math.BigDecimal;

public class Xiaomi extends Phone {
    public Xiaomi() {
    }

    public Xiaomi(String name, String model, String level, BigDecimal valor, String information) {
        super(name, model, level, valor, information);
    }
}
