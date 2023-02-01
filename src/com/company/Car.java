package com.company;
//5. Створити клас Car з публічним методом start. Метод start викликає у собі методи:
//- startElectricity()
//- startCommand()
//- startFuelSystem()

public class Car implements carActions {

    public void start() {
        Car car = new Car();
        car.startElectricity();
        car.startCommand();
        car.startFuelSystem();
    }

    @Override
    public String startElectricity() {
        System.out.println("Electricity started");
        return "ok";
    }

    @Override
    public String startCommand() {
        System.out.println("Go");
        return "ok";
    }

    @Override
    public String startFuelSystem() {
        System.out.println("Fuel system started");
        return "ok";
    }
}
