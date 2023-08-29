package br.com.diegocordeiro.patterns.behavior.state.models;

public class Store {

    private StoreState storeState;

    private boolean isOpened;

    private final String name;

    private final String description;

    public Store(StoreState storeState, String name, String description, boolean isOpened) {
        this.storeState = storeState;
        this.name = name;
        this.description = description;
        this.isOpened = isOpened;
    }

    public StoreState getStoreState() {
        return storeState;
    }

    public void changeState() {
        this.storeState.changeStatus(this);
    }

    protected void setStoreState(StoreState storeState) {
        this.storeState = storeState;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setOpened(boolean opened) {
        isOpened = opened;
    }

    public boolean isOpened() {
        return isOpened;
    }
}
