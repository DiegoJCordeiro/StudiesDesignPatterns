package br.com.diegocordeiro.patterns.creational.factorymethod.models;

import java.math.BigDecimal;

public class Phone {

    private String name;

    private String model;

    private String level;

    private BigDecimal valor;

    private String information;

    public Phone(){
    }
    
    public Phone(String name, String model, String level, BigDecimal valor, String information) {
        this.name = name;
        this.model = model;
        this.level = level;
        this.valor = valor;
        this.information = information;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", level='" + level + '\'' +
                ", valor=" + valor +
                ", information='" + information + '\'' +
                '}';
    }
}
