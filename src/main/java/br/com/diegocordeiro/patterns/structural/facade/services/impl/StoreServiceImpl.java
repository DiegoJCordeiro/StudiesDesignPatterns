package br.com.diegocordeiro.patterns.structural.facade.services.impl;

import br.com.diegocordeiro.patterns.structural.facade.model.Phone;
import br.com.diegocordeiro.patterns.structural.facade.services.BuyPhoneFacade;
import br.com.diegocordeiro.patterns.structural.facade.services.ChangePhoneFacade;
import br.com.diegocordeiro.patterns.structural.facade.services.StockPhoneFacade;
import br.com.diegocordeiro.patterns.structural.facade.services.StoreServiceFacade;

public class StoreServiceImpl implements StoreServiceFacade {


    @Override
    public Phone buy(Phone phone) {

        BuyPhoneFacade phoneStoreService = PhoneStoreServiceImpl.getInstance();

        return phoneStoreService.buy(phone);
    }

    @Override
    public Phone change(Phone phone) {

        ChangePhoneFacade phoneStoreService = PhoneStoreServiceImpl.getInstance();

        return phoneStoreService.change(phone);
    }

    @Override
    public Phone stock(Phone phone, Long quantityStock) {

        StockPhoneFacade phoneStoreService = PhoneStoreServiceImpl.getInstance();

        return phoneStoreService.stock(phone, quantityStock);
    }
}
