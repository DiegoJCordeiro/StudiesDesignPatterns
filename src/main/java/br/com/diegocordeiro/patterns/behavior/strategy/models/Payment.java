package br.com.diegocordeiro.patterns.behavior.strategy.models;

import java.math.BigDecimal;

public class Payment {

    private final String label;

    private final Method paymentMethod;

    private final BigDecimal value;

    protected Payment(String label, Method paymentMethod, BigDecimal value) {

        this.label = label;
        this.paymentMethod = paymentMethod;
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public Method getPaymentMethod() {
        return paymentMethod;
    }

    public BigDecimal getValue() {
        return value;
    }

    public static class Builder {

        private String label;

        private Method paymentMethod;

        private BigDecimal value;

        public Builder(){}

        public Builder withLabel(String label) {
            this.label = label;
            return this;
        }

        public Builder withPaymentMethod(Method paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Builder withValue(BigDecimal value) {
            this.value = value;
            return this;
        }

        public Payment build(){
            return new Payment(this.label, this.paymentMethod, this.value);
        }
    }
}
