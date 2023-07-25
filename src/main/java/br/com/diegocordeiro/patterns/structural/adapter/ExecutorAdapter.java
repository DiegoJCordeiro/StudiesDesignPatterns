package br.com.diegocordeiro.patterns.structural.adapter;

import br.com.diegocordeiro.patterns.ExecutorPatterns;
import br.com.diegocordeiro.patterns.structural.adapter.adapters.EuropeanChargerToAmericanConnectorAdapter;
import br.com.diegocordeiro.patterns.structural.adapter.models.AmericanCharger;
import br.com.diegocordeiro.patterns.structural.adapter.models.ElectricalOutlet;
import br.com.diegocordeiro.patterns.structural.adapter.models.EuropeanCharger;

public class ExecutorAdapter implements ExecutorPatterns {

    @Override
    public void execute() {

        System.out.println("----- Start - Using Adapter Pattern. -----");

        ElectricalOutlet electricalOutlet = new ElectricalOutlet("110 VW", false);

        AmericanCharger americanCharger = new AmericanCharger("100 VW | 220 VW", true);
        EuropeanCharger europeanCharger = new EuropeanCharger("110 VW", false);

        electricalOutlet.connect(americanCharger);
        electricalOutlet.disconnect();

        EuropeanChargerToAmericanConnectorAdapter europeanToConnectorAmericanAdapter = new EuropeanChargerToAmericanConnectorAdapter(europeanCharger);
        electricalOutlet.connect(europeanToConnectorAmericanAdapter);
        electricalOutlet.disconnect();

        System.out.println("----- End - Using Adapter Pattern. -----");
    }
}
