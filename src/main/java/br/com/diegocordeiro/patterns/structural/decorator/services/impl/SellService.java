package br.com.diegocordeiro.patterns.structural.decorator.services.impl;

import br.com.diegocordeiro.patterns.structural.decorator.models.Sell;
import br.com.diegocordeiro.patterns.structural.decorator.services.ISellService;

import java.math.BigDecimal;
import java.util.Arrays;

public class SellService implements ISellService {
    @Override
    public Double calculate(Sell ...soldParams) {

        for(Sell sold: soldParams){

            sold.sum(sold.percentSell());
        }

        return Arrays.stream(soldParams)
                .mapToDouble(Sell::percentSell)
                .sum();
    }
}
