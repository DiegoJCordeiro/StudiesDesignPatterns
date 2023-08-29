package br.com.diegocordeiro.patterns.behavior.observer.models;

import java.math.BigDecimal;

public class Phone {
    private final String name;
    private final String model;
    private final String usbType;
    private final String tag;
    private final BigDecimal value;
    private final Double tax;

    public Phone(String name, String model, String usbType, String tag, BigDecimal value, Double tax) {
        this.name = name;
        this.model = model;
        this.usbType = usbType;
        this.tag = tag;
        this.value = value;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getUsbType() {
        return usbType;
    }

    public String getTag() {
        return tag;
    }

    public BigDecimal getValue() {
        return value;
    }

    public Double getTax() {
        return tax;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", usbType='" + usbType + '\'' +
                ", tag='" + tag + '\'' +
                ", value=" + value +
                ", tax=" + tax +
                '}';
    }

    public static class Builder {

        private String name;
        private String model;
        private String usbType;
        private String tag;
        private BigDecimal value;
        private Double tax;

        public Builder() {
        }

        public Builder withName(String name){
            this.name = name;
            return this;
        }

        public Builder withModel(String model){
            this.model = model;
            return this;
        }

        public Builder withUsbType(String usbType){
            this.usbType = usbType;
            return this;
        }

        public Builder withTag(String tag){
            this.tag = tag;
            return this;
        }

        public Builder withValue(BigDecimal value){
            this.value = value;
            return this;
        }

        public Builder withTax(Double tax){
            this.tax = tax;
            return this;
        }

        public Phone build(){
            return new Phone(this.name,
                    this.model,
                    this.usbType,
                    this.tag,
                    this.value,
                    this.tax);
        }
    }
}
