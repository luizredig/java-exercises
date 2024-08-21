package com.github.luizredig.java.vehicles.model.interfaces;

public interface IVehicle {
    String start();

    String turnOff();

    void accelerate(double acceleration);

    void brake(double percentage);
}
