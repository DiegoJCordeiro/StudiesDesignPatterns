package br.com.diegocordeiro.patterns.behavior.state.models;

public class ClosedState implements StoreState {

    private static final StoreState storeState = new ClosedState();

    private ClosedState(){}

    @Override
    public void changeStatus(Store store) {

        if(store.getStoreState() instanceof ClosedState){
            store.setOpened(false);
            store.setStoreState(OpenedState.getInstance());
            System.out.println("The store is opened.");
            return;
        }

        System.out.println("The store is closed.");
    }

    public static StoreState getInstance(){
        return storeState;
    }
}
