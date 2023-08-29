package br.com.diegocordeiro.patterns.behavior.chain.responsibility;

import br.com.diegocordeiro.patterns.behavior.chain.models.PhoneNumber;

public abstract class ChainResponsibility {

    protected ChainResponsibility nextResponsibility;

    public abstract boolean chainExecute(PhoneNumber phoneNumber);

    public void addNextResponsibility(ChainResponsibility nextResponsibility){

        this.nextResponsibility = nextResponsibility;
    }
}
