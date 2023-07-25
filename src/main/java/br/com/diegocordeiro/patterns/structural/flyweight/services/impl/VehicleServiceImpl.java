package br.com.diegocordeiro.patterns.structural.flyweight.services.impl;

import br.com.diegocordeiro.patterns.structural.flyweight.models.Vehicle;
import br.com.diegocordeiro.patterns.structural.flyweight.services.VehicleService;

public class VehicleServiceImpl implements VehicleService {

    private Vehicle vehicle;

    public VehicleServiceImpl(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    @Override
    public void acelerate() {

        Integer quantitySpeedUpKM = this.vehicle.getCar().getQuantitySpeedUpKM();

        this.vehicle = new Vehicle.Builder()
                .withName(this.vehicle.getName())
                .withModel(this.vehicle.getModel())
                .withQuantity(this.vehicle.getQuantity())
                .withTotalSpeed(this.vehicle.getTotalSpeed() + quantitySpeedUpKM)
                .withCar(this.vehicle.getCar())
                .build();
    }

    @Override
    public void brake() {

        Integer quantityBrakeKM = this.vehicle.getCar().getQuantityBrakeKM();

        this.vehicle = new Vehicle.Builder()
                .withName(this.vehicle.getName())
                .withModel(this.vehicle.getModel())
                .withQuantity(this.vehicle.getQuantity())
                .withTotalSpeed(this.vehicle.getTotalSpeed() - quantityBrakeKM)
                .withCar(this.vehicle.getCar())
                .build();
    }

    @Override
    public Integer totalVelocity() {

        return this.vehicle.getTotalSpeed();
    }
}
