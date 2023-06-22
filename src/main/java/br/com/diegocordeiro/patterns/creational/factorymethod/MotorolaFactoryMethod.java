package br.com.diegocordeiro.patterns.creational.factorymethod;

import br.com.diegocordeiro.patterns.creational.factorymethod.models.Motorola;
import br.com.diegocordeiro.patterns.creational.factorymethod.models.Phone;

import java.math.BigDecimal;

public class MotorolaFactoryMethod extends PhoneFactoryMethod {

    @Override
    public Phone create() {

        return new Motorola("Motorola",
                "5",
                "G",
                new BigDecimal("2.500"),
                "This cellphone is very cool.");
    }
}
