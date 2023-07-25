package br.com.diegocordeiro.patterns.structural.decorator.services;

import br.com.diegocordeiro.patterns.structural.decorator.models.Sell;

public interface ISellService{

    public Double calculate(Sell ...sellProducts);
}
