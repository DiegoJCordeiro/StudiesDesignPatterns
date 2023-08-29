package br.com.diegocordeiro.patterns.behavior.observer.listeners.impl;

import br.com.diegocordeiro.patterns.behavior.observer.listeners.Listener;
import br.com.diegocordeiro.patterns.behavior.observer.models.Phone;

public class MotorolaStoreListener implements Listener {

    @Override
    public void notify(Phone phone) {
        System.out.println("Executing MotorolaStoreListener Observer.");
    }
}
