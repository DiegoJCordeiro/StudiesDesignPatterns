package br.com.diegocordeiro.patterns.creational.abstractfactory.models;

import java.math.BigDecimal;

public class Phone {

    private final String name;

    private final String model;

    private final String level;

    private final BigDecimal value;

    private final String information;

    public Phone(String name, String model, String level, BigDecimal value, String information) {
        this.name = name;
        this.model = model;
        this.level = level;
        this.value = value;
        this.information = information;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getLevel() {
        return level;
    }

    public BigDecimal getValue() {
        return value;
    }

    public String getInformation() {
        return information;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", level='" + level + '\'' +
                ", valor=" + value +
                ", information='" + information + '\'' +
                '}';
    }

    public static class Builder {

        private String name;

        private String model;

        private String level;

        private BigDecimal value;

        private String information;

        public Builder(){}

        public Builder withName(String name){
            this.name = name;
            return this;
        }
        public Builder withModel(String model){
            this.model = model;
            return this;
        }
        public Builder withLevel(String level){
            this.level = level;
            return this;
        }
        public Builder withValue(BigDecimal value){
            this.value = value;
            return this;
        }
        public Builder withInformation(String information){
            this.information = information;
            return this;
        }

        public Phone build(){

            return new Phone(this.name, this.model, this.level, this.value, this.information);
        }
    }
}
