package br.com.diegocordeiro.patterns.structural.facade;

import br.com.diegocordeiro.patterns.ExecutorPatterns;
import br.com.diegocordeiro.patterns.structural.facade.model.Phone;
import br.com.diegocordeiro.patterns.structural.facade.services.StoreServiceFacade;
import br.com.diegocordeiro.patterns.structural.facade.services.impl.StoreServiceImpl;

import java.util.UUID;

public class ExecutorFacade implements ExecutorPatterns {

    @Override
    public void execute() {

        System.out.println("----- Start - Using Facade Pattern. -----");

        Phone iphoneXR = new Phone.Builder()
                .withId(UUID.randomUUID().toString())
                .withName("Iphone")
                .withVersion("XR")
                .build();

        Phone iphone11 = new Phone.Builder()
                .withId(UUID.randomUUID().toString())
                .withName("Iphone")
                .withVersion("11")
                .build();

        Phone iphone14Pro = new Phone.Builder()
                .withId(UUID.randomUUID().toString())
                .withName("Iphone")
                .withVersion("14 Pro")
                .build();

        StoreServiceFacade storeService = new StoreServiceImpl();

        iphoneXR = storeService.stock(iphoneXR, 5L);
        iphone11 = storeService.stock(iphone11, 5L);
        iphone14Pro = storeService.stock(iphone14Pro, 5L);

        System.out.println(iphoneXR);
        System.out.println(iphone11);
        System.out.println(iphone14Pro);

        Phone iphoneXRCloned = iphoneXR.clone();
        Phone iphone11Cloned = iphone11.clone();
        Phone iphone14ProCloned = iphone14Pro.clone();

        Phone iphoneXRChanged = new Phone.Builder()
                .withId(iphoneXRCloned.getId())
                .withName(iphoneXRCloned.getName() + " - Vitrine")
                .withVersion(iphoneXRCloned.getVersion())
                .withQuantity(iphoneXRCloned.getQuantity())
                .build();

        iphoneXR = storeService.change(iphoneXRChanged);

        Phone iphone11Changed = new Phone.Builder()
                .withId(iphone11Cloned.getId())
                .withName(iphone11Cloned.getName() + " - Vitrine")
                .withVersion(iphone11Cloned.getVersion())
                .withQuantity(iphone11Cloned.getQuantity())
                .build();

        iphone11 = storeService.change(iphone11Changed);

        Phone iphone14ProChanged = new Phone.Builder()
                .withId(iphone14ProCloned.getId())
                .withName(iphone14ProCloned.getName() + " - Vitrine")
                .withVersion(iphone14ProCloned.getVersion())
                .withQuantity(iphone14ProCloned.getQuantity())
                .build();

        iphone14Pro = storeService.change(iphone14ProChanged);

        iphoneXR = storeService.buy(iphoneXR);
        iphone11 = storeService.buy(iphone11);
        iphone14Pro = storeService.buy(iphone14Pro);

        System.out.println(iphoneXR);
        System.out.println(iphone11);
        System.out.println(iphone14Pro);

        System.out.println("----- End - Using Facade Pattern. -----");
    }
}
