package br.com.diegocordeiro.patterns.structural.decorator.models;

import java.math.BigDecimal;

public class Product extends Sell {
    private Double price;

    private String name;

    private Integer quantity;

    public Product(Double price, String name, Integer quantity){

        this.price = price;
        this.name = name;
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public Double percentSell() {

        return (price * quantity) * 0.1;
    }
}
