package br.com.diegocordeiro.patterns.creational.singleton;

import br.com.diegocordeiro.patterns.ExecutorPatterns;
import br.com.diegocordeiro.patterns.creational.singleton.models.Connection;

public class ExecutorSingleton implements ExecutorPatterns {

    @Override
    public void execute() {

        System.out.println("----- Start - Using Singleton Pattern. -----");

        Connection connection = Connection.getInstance();
        System.out.println(connection);

        System.out.println("----- End - Using Singleton Pattern. -----");
    }
}
