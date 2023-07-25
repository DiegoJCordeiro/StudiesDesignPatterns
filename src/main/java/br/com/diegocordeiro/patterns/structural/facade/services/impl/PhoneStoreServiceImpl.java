package br.com.diegocordeiro.patterns.structural.facade.services.impl;

import br.com.diegocordeiro.patterns.structural.facade.model.Phone;
import br.com.diegocordeiro.patterns.structural.facade.services.BuyPhoneFacade;
import br.com.diegocordeiro.patterns.structural.facade.services.ChangePhoneFacade;
import br.com.diegocordeiro.patterns.structural.facade.services.StockPhoneFacade;

import java.util.ArrayList;
import java.util.List;

public class PhoneStoreServiceImpl implements BuyPhoneFacade, ChangePhoneFacade, StockPhoneFacade {

    private static PhoneStoreServiceImpl phoneStoreServiceImpl;
    private static List<Phone> phones = new ArrayList<>();

    private PhoneStoreServiceImpl() {
        phones = new ArrayList<>();
    }

    @Override
    public Phone buy(Phone phone) {

        if(phones.contains(phone)){

            int index = phones.indexOf(phone);

            Phone phoneCloned = phones.get(index).clone();

            phones.remove(index);

            Phone phoneChanged = new Phone.Builder()
                    .withId(phoneCloned.getId())
                    .withName(phoneCloned.getName())
                    .withVersion(phoneCloned.getVersion())
                    .withQuantity(phoneCloned.getQuantity() - 1L)
                    .build();

            phones.add(phoneChanged);

            return phoneChanged;
        }

        throw new RuntimeException("Phone not has stock.");
    }

    @Override
    public Phone change(Phone phone) {

        if(phones.contains(phone)){

            phones.remove(phone);

            Phone phoneChanged = new Phone.Builder()
                    .withId(phone.getId())
                    .withName(phone.getName())
                    .withVersion(phone.getVersion())
                    .withQuantity(phone.getQuantity())
                    .build();

            phones.add(phoneChanged);

            return phoneChanged;
        }

        throw new RuntimeException("Phone not has stock.");
    }

    @Override
    public Phone stock(Phone phone, long quantityStock) {

        Phone phoneCloned = phone.clone();

        Phone phoneChanged = new Phone.Builder()
                .withId(phoneCloned.getId())
                .withName(phoneCloned.getName())
                .withVersion(phoneCloned.getVersion())
                .withQuantity(quantityStock)
                .build();

        if(phones.contains(phoneChanged)) {
            phones.remove(phone);
        }

        phones.add(phoneChanged);

        return phoneChanged;
    }

    public static PhoneStoreServiceImpl getInstance() {

        if(phoneStoreServiceImpl == null) {
            phoneStoreServiceImpl = new PhoneStoreServiceImpl();
        }

        return phoneStoreServiceImpl;
    }
}
