package br.com.diegocordeiro.patterns.creational.abstractfactory;

import br.com.diegocordeiro.patterns.creational.abstractfactory.models.Phone;
import br.com.diegocordeiro.patterns.creational.abstractfactory.models.PhoneProperties;

import java.math.BigDecimal;

public class IPhoneInformationFactory implements PhoneInformationFactory {

    @Override
    public PhoneProperties properties() {

        return new PhoneProperties.Builder()
                .withMemory("8 GB")
                .withCpu("8 CPU")
                .build();
    }

    @Override
    public Phone phone() {

        return new Phone.Builder()
                .withName("Iphone")
                .withValue(new BigDecimal("10.125"))
                .withLevel("14")
                .withModel("Plus")
                .build();
    }
}
