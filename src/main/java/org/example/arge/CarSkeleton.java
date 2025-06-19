package org.example.arge;

public class CarSkeleton {
    public String name;
    public String description;


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public String startEngine() {
        System.out.println(name + ": Engine is starting...");
        return getName()+"starting engine";
    }

    public String drive() {
        runEngine(this);
        return getName() + name + "is driving";

    }

    protected void runEngine(CarSkeleton carSkeleton) {
        System.out.println(name + ": Engine is running internally...");
    }



}
