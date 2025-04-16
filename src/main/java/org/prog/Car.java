package org.prog;

//TODO: Add owner field
//TODO: modify goTo method to display ${color} belonging to ${owner} goes to ${destination}
public class Car {

    public Engine engine;
    public String color;
    public int milage;
    public String owner;

    public void goTo(String destination) {
        System.out.println(color + "belonging to" + owner + "goes to" + destination);
    }

    public void fuelCarWithGasoline(String gasType, int liters) {
        if (engine.fuelType.equals("diesel")) {
            System.out.println("This cannot be fueled with gas!");
        }
    }
}
