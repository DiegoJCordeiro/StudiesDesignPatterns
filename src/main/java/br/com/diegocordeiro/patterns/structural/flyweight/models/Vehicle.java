package br.com.diegocordeiro.patterns.structural.flyweight.models;

public class Vehicle {

    private String name;

    private String model;

    private Integer quantity;

    private Integer totalSpeed;

    private Car car;

    public Vehicle(String name, String model, Integer quantity, Car car, Integer totalSpeed) {
        this.name = name;
        this.model = model;
        this.quantity = quantity;
        this.totalSpeed = totalSpeed;
        this.car = car;
    }

    public String getName() {
        return this.name;
    }

    public String getModel() {
        return this.model;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public Car getCar() {
        return this.car;
    }

    public Integer getTotalSpeed() {
        return this.totalSpeed;
    }

    public static class Builder {

        private String name;

        private String model;

        private Integer quantity;

        private Car car;

        private Integer totalSpeed;

        public Builder(){}

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withModel(String model) {
            this.model = model;
            return this;
        }

        public Builder withQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder withCar(Car car) {
            this.car = car;
            return this;
        }

        public Builder withTotalSpeed(Integer totalSpeed) {
            this.totalSpeed = totalSpeed;
            return this;
        }

        public Vehicle build(){
            return new Vehicle(this.name, this.model, this.quantity, this.car, this.totalSpeed);
        }
    }
}
