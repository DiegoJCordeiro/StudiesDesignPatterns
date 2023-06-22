package br.com.diegocordeiro.patterns.creational.factorymethod;

import br.com.diegocordeiro.patterns.ExecutorPatterns;
import br.com.diegocordeiro.patterns.creational.factorymethod.models.Phone;
import br.com.diegocordeiro.patterns.creational.factorymethod.models.PhoneType;

public class ExecutorFactoryMethod implements ExecutorPatterns {

    @Override
    public void execute() {

        System.out.println("----- Start -  Using Factory Method Pattern. -----");

        Phone iphone = PhoneFactoryMethod.request(PhoneType.IPHONE);
        Phone nokia = PhoneFactoryMethod.request(PhoneType.NOKIA);
        Phone samsung = PhoneFactoryMethod.request(PhoneType.SAMSUNG);
        Phone xiaomi = PhoneFactoryMethod.request(PhoneType.XIAOMI);
        Phone motorola = PhoneFactoryMethod.request(PhoneType.MOTOROLA);

        System.out.println(iphone.toString());
        System.out.println(motorola.toString());
        System.out.println(nokia.toString());
        System.out.println(samsung.toString());
        System.out.println(xiaomi.toString());
        System.out.println("----- End - Using Factory Method Pattern. -----");
    }
}
