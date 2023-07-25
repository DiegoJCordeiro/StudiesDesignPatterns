package br.com.diegocordeiro.patterns.structural.facade.services;

import br.com.diegocordeiro.patterns.structural.facade.model.Phone;

public interface StockPhoneFacade {

    Phone stock(Phone phone, long quantityStock);
}
