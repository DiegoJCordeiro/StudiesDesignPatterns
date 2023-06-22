package br.com.diegocordeiro.patterns.creational.factorymethod;

import br.com.diegocordeiro.patterns.creational.factorymethod.models.Phone;
import br.com.diegocordeiro.patterns.creational.factorymethod.models.IPhone;

import java.math.BigDecimal;

public class IPhoneFactoryMethod extends PhoneFactoryMethod {

    @Override
    public Phone create() {

        return new IPhone("Iphone",
                "14",
                "Plus",
                new BigDecimal("10.000"),
                "This cellphone is very fast.");
    }
}
