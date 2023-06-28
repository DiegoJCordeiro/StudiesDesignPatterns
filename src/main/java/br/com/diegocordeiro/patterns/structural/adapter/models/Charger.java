package br.com.diegocordeiro.patterns.structural.adapter.models;

public class Charger {

    protected String voltage;

    protected boolean biVoltage;

    public Charger(String voltage, boolean biVoltage) {
        this.voltage = voltage;
        this.biVoltage = biVoltage;
    }

    public String getVoltage() {
        return voltage;
    }

    public boolean isBiVoltage() {
        return biVoltage;
    }
}
