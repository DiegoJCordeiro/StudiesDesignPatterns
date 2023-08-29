package br.com.diegocordeiro.patterns.behavior.mediator;

import br.com.diegocordeiro.patterns.ExecutorPatterns;
import br.com.diegocordeiro.patterns.behavior.mediator.rules.MediatorRule;
public class ExecutorMediator implements ExecutorPatterns {

    @Override
    public void execute() {

        try {

            System.out.println("----- Start - Using Mediator Pattern. -----");
            System.out.println("----- -----");

            MediatorRule mediatorRuleSaveFile = new MediatorRule("design-pattern-mediator-example");
            mediatorRuleSaveFile.save();
            mediatorRuleSaveFile.delete();

            System.out.println("----- -----");
            System.out.println("----- End - Using Mediator Pattern. -----");

        } catch (Exception exception) {
            System.out.println("Error in execution Mediator Pattern.");
        }
    }
}
