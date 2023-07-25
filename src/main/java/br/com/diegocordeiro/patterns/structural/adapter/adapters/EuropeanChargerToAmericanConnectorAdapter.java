package br.com.diegocordeiro.patterns.structural.adapter.adapters;

import br.com.diegocordeiro.patterns.structural.adapter.models.EuropeanCharger;

public class EuropeanChargerToAmericanConnectorAdapter implements AmericanConnector {

    private final EuropeanCharger europeanCharger;

    public EuropeanChargerToAmericanConnectorAdapter(EuropeanCharger europeanCharger) {
        System.out.println("Connected to Adapter European To American.");
        this.europeanCharger = europeanCharger;
    }

    @Override
    public boolean isBiVoltage() {
        return europeanCharger.isBiVoltage();
    }

    @Override
    public String getVoltage() {
        return europeanCharger.getVoltage();
    }
}
