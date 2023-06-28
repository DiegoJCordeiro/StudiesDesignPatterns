package br.com.diegocordeiro.patterns.structural.adapter.models;

import br.com.diegocordeiro.patterns.structural.adapter.AmericanConnector;

public class ElectricalOutlet {

    private String voltage;

    private boolean inUse;

    public ElectricalOutlet(String voltage, boolean inUse) {
        this.voltage = voltage;
        this.inUse = inUse;
    }

    public void connect(AmericanConnector connector) {

        if(connector == null)
            throw new RuntimeException("It's not have connector.");

        if(inUse)
            throw new RuntimeException("It's not possible connect.");

        if(!connector.isBiVoltage() && !this.voltage.equals(connector.getVoltage()))
            throw new RuntimeException("It's not possible connect.");

        System.out.println("Connected Charger.");

        this.inUse = true;
    }

    public void disconnect() {
        System.out.println("Disconnected Charger.");
        this.inUse = false;
    }
}
