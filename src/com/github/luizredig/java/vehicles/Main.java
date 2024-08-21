package com.github.luizredig.java.vehicles;

import com.github.luizredig.java.vehicles.model.classes.abstracts.Vehicle;
import com.github.luizredig.java.vehicles.model.classes.concretes.entities.Driver;
import com.github.luizredig.java.vehicles.model.classes.concretes.vehicles.*;

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.start());
        System.out.println(c.turnOff());

        Vehicle m = new Motorcycle();
        System.out.println(m.start());
        System.out.println(m.turnOff());

        Driver d = new Driver(c);
        d.start();
        d.turnOff();
        d.accelerate(100);
        d.brake(50);

        System.out.println(c.speed);
    }
}
