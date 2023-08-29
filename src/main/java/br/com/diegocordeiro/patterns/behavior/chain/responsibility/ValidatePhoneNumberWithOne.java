package br.com.diegocordeiro.patterns.behavior.chain.responsibility;

import br.com.diegocordeiro.patterns.behavior.chain.models.PhoneNumber;

public class ValidatePhoneNumberWithOne extends ChainResponsibility {

    private static final String NUMBER = "1";

    @Override
    public boolean chainExecute(PhoneNumber phoneNumber) {

        if(phoneNumber.getNumber().contains(NUMBER)){
            System.out.println("Has number 1.");
            return true;
        }

        return this.nextResponsibility.chainExecute(phoneNumber);
    }
}
