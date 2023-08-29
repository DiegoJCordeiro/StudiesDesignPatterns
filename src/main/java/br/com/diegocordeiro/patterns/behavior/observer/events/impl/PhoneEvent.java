package br.com.diegocordeiro.patterns.behavior.observer.events.impl;

import br.com.diegocordeiro.patterns.behavior.observer.events.Event;
import br.com.diegocordeiro.patterns.behavior.observer.listeners.Listener;
import br.com.diegocordeiro.patterns.behavior.observer.models.Phone;

import java.util.ArrayList;
import java.util.List;

public class PhoneEvent implements Event {

    private static final List<Listener> listeners = new ArrayList<>();

    @Override
    public void notify(Phone phone) {
        listeners.forEach(listener -> listener.notify(phone));
    }

    @Override
    public void subscribe(Listener listener) {
        listeners.add(listener);
    }
}
