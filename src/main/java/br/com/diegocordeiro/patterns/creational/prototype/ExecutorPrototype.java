package br.com.diegocordeiro.patterns.creational.prototype;

import br.com.diegocordeiro.patterns.ExecutorPatterns;
import br.com.diegocordeiro.patterns.creational.prototype.models.Connection;

public class ExecutorPrototype implements ExecutorPatterns {

    @Override
    public void execute() {

        System.out.println("----- Start - Using Prototype Pattern. -----");

        Connection connection = Connection.getInstance();
        Connection connectionCloned = connection.clone();

        System.out.println("connection without clone: " + connection);
        System.out.println("connection with clone: " + connectionCloned);

        System.out.println("----- End - Using Prototype Pattern. -----");
    }
}
