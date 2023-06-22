package br.com.diegocordeiro;

import br.com.diegocordeiro.patterns.ExecutorPatterns;
import br.com.diegocordeiro.patterns.creational.abstractfactory.ExecutorAbstractFactory;
import br.com.diegocordeiro.patterns.creational.builder.ExecutorBuilder;
import br.com.diegocordeiro.patterns.creational.factorymethod.ExecutorFactoryMethod;
import br.com.diegocordeiro.patterns.creational.monostate.ExecutorMonoState;
import br.com.diegocordeiro.patterns.creational.prototype.ExecutorPrototype;
import br.com.diegocordeiro.patterns.creational.singleton.ExecutorSingleton;

/**
 * Hello world!
 *
 */
public class Application
{
    public static void main( String[] args )
    {
        ExecutorPatterns executorFactoryMethod = new ExecutorFactoryMethod();
        executorFactoryMethod.execute();

        System.out.println("   ");

        ExecutorPatterns executorBuilder = new ExecutorBuilder();
        executorBuilder.execute();

        System.out.println("   ");

        ExecutorPatterns executorAbstractFactory = new ExecutorAbstractFactory();
        executorAbstractFactory.execute();

        System.out.println("   ");

        ExecutorPatterns executorSingleton = new ExecutorSingleton();
        executorSingleton.execute();

        System.out.println("   ");

        ExecutorPatterns executorMonoState = new ExecutorMonoState();
        executorMonoState.execute();

        System.out.println("   ");

        ExecutorPatterns executorPrototype = new ExecutorPrototype();
        executorPrototype.execute();
    }
}
