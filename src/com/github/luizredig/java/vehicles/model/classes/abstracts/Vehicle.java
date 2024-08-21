package com.github.luizredig.java.vehicles.model.classes.abstracts;

import com.github.luizredig.java.vehicles.model.interfaces.IVehicle;

public abstract class Vehicle implements IVehicle {
    public double speed = 0;

    @Override
    public String start() {
        return String.format("%s just started.", this.getClass().getSimpleName());
    }

    @Override
    public String turnOff() {
        return String.format("%s just turned off.", this.getClass().getSimpleName());
    }

    @Override
    public void accelerate(double acceleration) {
        this.speed += acceleration;
    }

    @Override
    public void brake(double percentage) {
        double percent = percentage / 100.0;
        this.speed -= percent * this.speed;
    }
}
