package br.com.diegocordeiro.patterns.structural.proxy.services;

import java.math.BigDecimal;

public interface Operations {

    boolean deposit(String account, BigDecimal value);

    boolean transfer(String accountSource, String accountTarget, BigDecimal value);

    boolean grab(String account, BigDecimal value);
}
