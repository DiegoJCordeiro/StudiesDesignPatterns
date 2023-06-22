package br.com.diegocordeiro.patterns.creational.factorymethod;

import br.com.diegocordeiro.patterns.creational.factorymethod.models.Nokia;
import br.com.diegocordeiro.patterns.creational.factorymethod.models.Phone;

import java.math.BigDecimal;

public class NokiaFactoryMethod extends PhoneFactoryMethod {

    @Override
    public Phone create() {

        return new Nokia("Nokia",
                "21",
                "G",
                new BigDecimal("2.500"),
                "This cellphone is very cool.");
    }
}
