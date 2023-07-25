package br.com.diegocordeiro.patterns.structural.flyweight.models;

public class Car {

    private final Integer quantitySpeedUpKM;

    private final Integer quantityBrakeKM;

    public Car(Integer quantitySpeedUpKM, Integer quantityBrakeKM) {

        this.quantitySpeedUpKM = quantitySpeedUpKM;
        this.quantityBrakeKM = quantityBrakeKM;
    }

    public Integer getQuantitySpeedUpKM() {
        return this.quantitySpeedUpKM;
    }

    public Integer getQuantityBrakeKM() {
        return this.quantityBrakeKM;
    }

    public static class Builder {

        private Integer quantitySpeedUpKM;

        private Integer quantityBrakeKM;

        public Builder(){}

        public Builder withQuantitySpeedUpKM(Integer quantitySpeedUpKM){
            this.quantitySpeedUpKM = quantitySpeedUpKM;
            return this;
        }

        public Builder withQuantityBrakeKM(Integer quantityBrakeKM){
            this.quantityBrakeKM = quantityBrakeKM;
            return this;
        }

        public Car build(){
            return new Car(this.quantitySpeedUpKM, this.quantityBrakeKM);
        }
    }
}
