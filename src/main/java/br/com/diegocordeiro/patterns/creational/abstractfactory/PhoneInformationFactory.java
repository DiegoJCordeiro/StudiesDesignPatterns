package br.com.diegocordeiro.patterns.creational.abstractfactory;

import br.com.diegocordeiro.patterns.creational.abstractfactory.models.Phone;
import br.com.diegocordeiro.patterns.creational.abstractfactory.models.PhoneProperties;

public interface PhoneInformationFactory {

    public PhoneProperties properties();

    public Phone phone();
}
