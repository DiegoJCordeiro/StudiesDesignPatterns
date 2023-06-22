package br.com.diegocordeiro.patterns.creational.factorymethod.models;

import java.math.BigDecimal;

public class IPhone extends Phone {

    public IPhone(){
        super();
    }

    public IPhone(String name, String model, String level, BigDecimal valor, String information) {
        super(name, model, level, valor, information);
    }
}
