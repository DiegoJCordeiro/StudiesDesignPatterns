package br.com.diegocordeiro.patterns.structural.flyweight.services;

import br.com.diegocordeiro.patterns.structural.flyweight.models.Vehicle;

public interface VehicleService {

    public void acelerate();

    public void brake();

    public Integer totalVelocity();
}