package br.com.diegocordeiro.patterns.structural.decorator;

import br.com.diegocordeiro.patterns.ExecutorPatterns;
import br.com.diegocordeiro.patterns.structural.decorator.models.Computer;
import br.com.diegocordeiro.patterns.structural.decorator.models.Phone;
import br.com.diegocordeiro.patterns.structural.decorator.models.Product;
import br.com.diegocordeiro.patterns.structural.decorator.services.ISellService;
import br.com.diegocordeiro.patterns.structural.decorator.services.impl.SellService;

public class ExecutorDecorator implements ExecutorPatterns {
    @Override
    public void execute() {

        System.out.println("----- Start - Using Decorator Pattern. -----");

        Product cellIPhoneXR = new Phone(6200.0, "Iphone XR", 2);
        Product cellIPhone11 = new Phone(8150.0, "Iphone 11", 1);
        Product computer = new Computer(11200.0, "Dell XPS", 1);

        ISellService sellService = new SellService();
        Double totalPercent = sellService.calculate(cellIPhoneXR, cellIPhone11, computer);

        System.out.println("Total Percent is: " + totalPercent);

        System.out.println("----- End - Using Decorator Pattern. -----");
    }
}
