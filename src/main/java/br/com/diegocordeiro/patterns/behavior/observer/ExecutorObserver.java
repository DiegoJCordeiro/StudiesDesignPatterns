package br.com.diegocordeiro.patterns.behavior.observer;

import br.com.diegocordeiro.patterns.ExecutorPatterns;
import br.com.diegocordeiro.patterns.behavior.observer.events.Event;
import br.com.diegocordeiro.patterns.behavior.observer.events.impl.PhoneEvent;
import br.com.diegocordeiro.patterns.behavior.observer.listeners.Listener;
import br.com.diegocordeiro.patterns.behavior.observer.listeners.impl.AppleStoreListener;
import br.com.diegocordeiro.patterns.behavior.observer.listeners.impl.MotorolaStoreListener;
import br.com.diegocordeiro.patterns.behavior.observer.models.Phone;

public class ExecutorObserver implements ExecutorPatterns {

    @Override
    public void execute() {

        System.out.println("----- Start - Using Observer Pattern. -----");
        System.out.println("----- -----");

        Phone phone = new Phone.Builder().build();

        Listener motorolaListener = new MotorolaStoreListener();
        Listener appleListener = new AppleStoreListener();

        Event event = new PhoneEvent();
        event.subscribe(motorolaListener);
        event.subscribe(appleListener);
        event.notify(phone);

        System.out.println("----- -----");
        System.out.println("----- End - Using Observer Pattern. -----");
    }
}
