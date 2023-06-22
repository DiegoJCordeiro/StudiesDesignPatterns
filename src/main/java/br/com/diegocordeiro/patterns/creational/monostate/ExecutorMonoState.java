package br.com.diegocordeiro.patterns.creational.monostate;

import br.com.diegocordeiro.patterns.ExecutorPatterns;
import br.com.diegocordeiro.patterns.creational.monostate.models.Connection;

public class ExecutorMonoState implements ExecutorPatterns {

    @Override
    public void execute() {

        System.out.println("----- Start - Using MonoState Pattern. -----");

        Connection connection = new Connection().get();
        System.out.println(connection);

        System.out.println("----- End - Using MonoState Pattern. -----");
    }
}
