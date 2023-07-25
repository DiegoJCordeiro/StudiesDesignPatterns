package br.com.diegocordeiro.patterns.structural.facade.services;

import br.com.diegocordeiro.patterns.structural.facade.model.Phone;

public interface StoreServiceFacade {

    Phone buy(Phone phone);

    Phone change(Phone phone);

    Phone stock(Phone phone, Long quantityStock);
}
