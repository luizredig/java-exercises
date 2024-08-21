package com.github.luizredig.java.vehicles.model.classes.concretes.entities;

import com.github.luizredig.java.vehicles.model.classes.abstracts.Vehicle;

public class Driver {
    Vehicle vehicle;

    public Driver(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void start() {
        vehicle.start();
    }

    public void turnOff() {
        vehicle.turnOff();
    }

    public void accelerate(double acceleration) {
        vehicle.accelerate(acceleration);
    }

    public void brake(double percentage) {
        vehicle.brake(percentage);
    }
}
