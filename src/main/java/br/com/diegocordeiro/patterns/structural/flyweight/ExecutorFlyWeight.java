package br.com.diegocordeiro.patterns.structural.flyweight;

import br.com.diegocordeiro.patterns.ExecutorPatterns;
import br.com.diegocordeiro.patterns.structural.flyweight.models.Car;
import br.com.diegocordeiro.patterns.structural.flyweight.models.Vehicle;
import br.com.diegocordeiro.patterns.structural.flyweight.services.VehicleService;
import br.com.diegocordeiro.patterns.structural.flyweight.services.impl.VehicleServiceImpl;

public class ExecutorFlyWeight implements ExecutorPatterns {

    @Override
    public void execute() {

        System.out.println("----- Start - Using FlyWeight Pattern. -----");

        Car car = new Car.Builder()
                .withQuantitySpeedUpKM(1)
                .withQuantityBrakeKM(2)
                .build();

        Vehicle vehicle = new Vehicle.Builder()
                .withName("Ford")
                .withModel("Ka")
                .withTotalSpeed(0)
                .withQuantity(1)
                .withCar(car)
                .build();

        VehicleService vehicleService = new VehicleServiceImpl(vehicle);
        vehicleService.acelerate();
        vehicleService.acelerate();
        vehicleService.acelerate();
        vehicleService.brake();

        System.out.println("Total vehicle's velocity is: " + vehicleService.totalVelocity() + " Km/h");

        System.out.println("----- End - Using FlyWeight Pattern. -----");
    }
}
