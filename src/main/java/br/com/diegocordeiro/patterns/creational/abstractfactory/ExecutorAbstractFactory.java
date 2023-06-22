package br.com.diegocordeiro.patterns.creational.abstractfactory;

import br.com.diegocordeiro.patterns.ExecutorPatterns;

public class ExecutorAbstractFactory implements ExecutorPatterns {

    @Override
    public void execute() {

        System.out.println("----- Start - Using Abstract Factory Pattern. -----");

        PhoneInformationFactory iphoneInformation = new IPhoneInformationFactory();
        System.out.println(iphoneInformation.phone());
        System.out.println(iphoneInformation.properties());

        System.out.println("----- -----");

        PhoneInformationFactory motorolaInformation = new MotorolaInformationFactory();
        System.out.println(motorolaInformation.phone());
        System.out.println(motorolaInformation.properties());

        System.out.println("----- -----");

        PhoneInformationFactory nokiaInformation = new NokiaInformationFactory();
        System.out.println(nokiaInformation.phone());
        System.out.println(nokiaInformation.properties());

        System.out.println("----- -----");

        PhoneInformationFactory samsungInformation = new SamsungInformationFactory();
        System.out.println(samsungInformation.phone());
        System.out.println(samsungInformation.properties());

        System.out.println("----- -----");

        PhoneInformationFactory xiaomiInformation = new XiaomiInformationFactory();
        System.out.println(xiaomiInformation.phone());
        System.out.println(xiaomiInformation.properties());

        System.out.println("----- End - Using Abstract Factory Pattern. -----");
    }
}
