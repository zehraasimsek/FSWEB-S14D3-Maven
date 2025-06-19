package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
    public double avgKmPerLitre;
    public int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String drive() {
        return super.drive();
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }
}
