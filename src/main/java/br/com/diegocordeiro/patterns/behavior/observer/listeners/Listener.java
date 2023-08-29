package br.com.diegocordeiro.patterns.behavior.observer.listeners;

import br.com.diegocordeiro.patterns.behavior.observer.models.Phone;

public interface Listener {

    public void notify(Phone phone);
}
