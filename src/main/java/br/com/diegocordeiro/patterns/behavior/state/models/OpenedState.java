package br.com.diegocordeiro.patterns.behavior.state.models;

public class OpenedState implements StoreState {

    private static final StoreState storeState = new OpenedState();

    private OpenedState(){}

    @Override
    public void changeStatus(Store store) {

        if(store.getStoreState() instanceof OpenedState){
            store.setOpened(false);
            store.setStoreState(ClosedState.getInstance());
            System.out.println("The store is closed.");
            return;
        }

        System.out.println("The store is opened.");
    }

    public static StoreState getInstance(){
        return storeState;
    }
}
