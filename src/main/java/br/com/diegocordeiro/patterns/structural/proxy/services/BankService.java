package br.com.diegocordeiro.patterns.structural.proxy.services;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class BankService implements Operations {

    private static Map<String, BigDecimal> data = new HashMap<>();

    @Override
    public boolean deposit(String account, BigDecimal value) {

        if(data.get(account) == null) {
            data.put(account, value);
            return true;
        }

        BigDecimal actualValue = data.get(account);

        data.remove(account);
        data.put(account, actualValue.add(value));

        System.out.println(data.toString());

        return true;
    }

    @Override
    public boolean transfer(String accountSource, String accountTarget, BigDecimal value) {

        BigDecimal sourceValue = data.get(accountSource);
        BigDecimal targetValue = data.get(accountTarget);

        data.remove(accountSource);
        data.remove(accountTarget);

        data.put(accountSource, sourceValue.subtract(value));
        data.put(accountTarget, targetValue.add(value));

        System.out.println(data.toString());

        return true;
    }

    @Override
    public boolean grab(String account, BigDecimal value) {

        BigDecimal sourceValue = data.get(account);
        data.remove(account);
        data.put(account, sourceValue.subtract(value));

        System.out.println(data.toString());

        return true;
    }
}
