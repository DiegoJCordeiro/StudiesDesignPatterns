package br.com.diegocordeiro.patterns.behavior.state;

import br.com.diegocordeiro.patterns.ExecutorPatterns;
import br.com.diegocordeiro.patterns.behavior.state.models.ClosedState;
import br.com.diegocordeiro.patterns.behavior.state.models.Store;
import br.com.diegocordeiro.patterns.behavior.state.models.StoreState;

public class ExecutorState implements ExecutorPatterns {

    @Override
    public void execute() {

        System.out.println("----- Start - Using State Pattern. -----");
        System.out.println("----- -----");

        Store store = new Store(ClosedState.getInstance(), "Store One", "Toy's store", true);

        try {
            store.changeState();
            Thread.sleep(1000);
            store.changeState();
            Thread.sleep(1000);
            store.changeState();
            Thread.sleep(1000);
            store.changeState();
            Thread.sleep(1000);
            store.changeState();
            Thread.sleep(1000);
            store.changeState();
        } catch(Exception ex) {
            System.out.println("Error: is not possible change state.");
        }

        System.out.println("----- -----");
        System.out.println("----- End - Using State Pattern. -----");
    }
}
