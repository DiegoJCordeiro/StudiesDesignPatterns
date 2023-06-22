package br.com.diegocordeiro.patterns.creational.abstractfactory.models;

import java.math.BigDecimal;

public class Samsung extends Phone {

    public Samsung(String name, String model, String level, BigDecimal value, String information) {
        super(name, model, level, value, information);
    }
}
