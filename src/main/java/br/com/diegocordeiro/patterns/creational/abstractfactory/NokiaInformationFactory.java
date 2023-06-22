package br.com.diegocordeiro.patterns.creational.abstractfactory;

import br.com.diegocordeiro.patterns.creational.abstractfactory.models.Phone;
import br.com.diegocordeiro.patterns.creational.abstractfactory.models.PhoneProperties;

import java.math.BigDecimal;

public class NokiaInformationFactory implements PhoneInformationFactory {

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
                .withName("Nokia")
                .withValue(new BigDecimal("2.500"))
                .withLevel("21")
                .withModel("G")
                .build();
    }
}
