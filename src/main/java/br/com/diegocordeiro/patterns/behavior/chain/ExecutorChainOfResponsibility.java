package br.com.diegocordeiro.patterns.behavior.chain;

import br.com.diegocordeiro.patterns.ExecutorPatterns;
import br.com.diegocordeiro.patterns.behavior.chain.models.PhoneNumber;
import br.com.diegocordeiro.patterns.behavior.chain.responsibility.ChainResponsibility;
import br.com.diegocordeiro.patterns.behavior.chain.responsibility.ValidatePhoneNumberWithNine;
import br.com.diegocordeiro.patterns.behavior.chain.responsibility.ValidatePhoneNumberWithOne;

import java.util.List;

public class ExecutorChainOfResponsibility implements ExecutorPatterns {

    @Override
    public void execute() {

        System.out.println("----- Start - Using Chain Of Responsibility Pattern. -----");

        PhoneNumber firstPhoneNumber = new PhoneNumber.Builder()
                .withCode(55)
                .withDdd(11)
                .withNumber("99999-9999")
                .build();

        PhoneNumber secondPhoneNumber = new PhoneNumber.Builder()
                .withCode(55)
                .withDdd(11)
                .withNumber("11111-1111")
                .build();

        PhoneNumber thirdPhoneNumber = new PhoneNumber.Builder()
                .withCode(55)
                .withDdd(11)
                .withNumber("33333-3333")
                .build();

        List<PhoneNumber> phoneNumbers = List.of(firstPhoneNumber, secondPhoneNumber, thirdPhoneNumber);

        ChainResponsibility firstChainResponsibility = new ValidatePhoneNumberWithOne();
        ChainResponsibility secondChainResponsibility = new ValidatePhoneNumberWithNine();

        firstChainResponsibility.addNextResponsibility(secondChainResponsibility);
        firstChainResponsibility.chainExecute(firstPhoneNumber);
        firstChainResponsibility.chainExecute(secondPhoneNumber);
        firstChainResponsibility.chainExecute(thirdPhoneNumber);

        System.out.println("----- End - Using Chain Of Responsibility Pattern. -----");
    }
}
