package br.com.diegocordeiro.patterns.creational.factorymethod;

import br.com.diegocordeiro.patterns.creational.factorymethod.models.Phone;
import br.com.diegocordeiro.patterns.creational.factorymethod.models.PhoneType;

public abstract class PhoneFactoryMethod {

    public static Phone request(PhoneType phoneType){

        Phone phone;

        switch (phoneType){
            case IPHONE -> {
                phone = new IPhoneFactoryMethod().create();
                break;
            }
            case NOKIA -> {
                phone = new NokiaFactoryMethod().create();
                break;
            }
            case XIAOMI -> {
                phone = new XiaomiFactoryMethod().create();
                break;
            }
            case SAMSUNG -> {
                phone = new SamsungFactoryMethod().create();
                break;
            }
            default -> {
                phone = new MotorolaFactoryMethod().create();
                break;
            }
        }

        return phone;
    }

    protected abstract Phone create();
}
