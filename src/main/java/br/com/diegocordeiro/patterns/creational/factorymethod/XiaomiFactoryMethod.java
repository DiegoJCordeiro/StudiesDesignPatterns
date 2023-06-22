package br.com.diegocordeiro.patterns.creational.factorymethod;

import br.com.diegocordeiro.patterns.creational.factorymethod.models.Phone;
import br.com.diegocordeiro.patterns.creational.factorymethod.models.Xiaomi;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class XiaomiFactoryMethod extends PhoneFactoryMethod {

    @Override
    public Phone create() {
        return new Xiaomi("Xiaomi",
                "X5",
                "Poco",
                new BigDecimal("1.56151").setScale(3, RoundingMode.HALF_EVEN),
                "This cellphone is very fast.");
    }
}
