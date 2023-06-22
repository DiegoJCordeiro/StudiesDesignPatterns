package br.com.diegocordeiro.patterns.creational.factorymethod;

import br.com.diegocordeiro.patterns.creational.factorymethod.models.Phone;
import br.com.diegocordeiro.patterns.creational.factorymethod.models.Samsung;

import java.math.BigDecimal;

public class SamsungFactoryMethod extends PhoneFactoryMethod {
    @Override
    public Phone create() {

        return new Samsung("Samsung",
                "23",
                "Galaxy",
                new BigDecimal("8.759"),
                "This cellphone is very fast.");
    }
}
