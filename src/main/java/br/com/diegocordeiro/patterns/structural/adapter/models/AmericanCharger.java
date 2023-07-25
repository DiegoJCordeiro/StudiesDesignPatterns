package br.com.diegocordeiro.patterns.structural.adapter.models;

import br.com.diegocordeiro.patterns.structural.adapter.adapters.AmericanConnector;

public class AmericanCharger extends Charger implements AmericanConnector {

    public AmericanCharger(String voltage, boolean isBivoltage) {
        super(voltage, isBivoltage);
    }

    @Override
    public boolean isBiVoltage() {
        return biVoltage;
    }

    @Override
    public String getVoltage() {
        return voltage;
    }
}
