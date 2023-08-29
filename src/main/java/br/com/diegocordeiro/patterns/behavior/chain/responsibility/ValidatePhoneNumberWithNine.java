package br.com.diegocordeiro.patterns.behavior.chain.responsibility;

import br.com.diegocordeiro.patterns.behavior.chain.models.PhoneNumber;

public class ValidatePhoneNumberWithNine extends ChainResponsibility {

    private static final String NUMBER = "9";

    @Override
    public boolean chainExecute(PhoneNumber phoneNumber) {

        if(phoneNumber.getNumber().contains(NUMBER)){
            System.out.println("Has number 9.");
            return true;
        }

        return false;
    }
}
