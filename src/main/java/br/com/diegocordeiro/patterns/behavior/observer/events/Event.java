package br.com.diegocordeiro.patterns.behavior.observer.events;

import br.com.diegocordeiro.patterns.behavior.observer.listeners.Listener;
import br.com.diegocordeiro.patterns.behavior.observer.models.Phone;

public interface Event {

    public void notify(Phone phone);

    public void subscribe(Listener listener);
}
