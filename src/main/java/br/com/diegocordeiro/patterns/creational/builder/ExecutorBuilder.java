package br.com.diegocordeiro.patterns.creational.builder;

import br.com.diegocordeiro.patterns.ExecutorPatterns;
import br.com.diegocordeiro.patterns.creational.builder.models.Phone;

import java.math.BigDecimal;

public class ExecutorBuilder  implements ExecutorPatterns {

    @Override
    public void execute() {

        System.out.println("----- Start - Using Builder Pattern. -----");

        Phone phone = new Phone.Builder().withName("")
                .withModel("")
                .withUsbType("")
                .withTag("")
                .withValue(new BigDecimal("10.000"))
                .withTax(0.0)
                .build();

        System.out.println(phone);

        System.out.println("----- End - Using Builder Pattern. -----");
    }
}
