package edu.sdccd.cisc191;

public class GasCar extends Car implements Combustible{

    int fuelLevel;
    public void tankUp() {
        fuelLevel=100;

    }

    @Override
    public int getFuelLevel() {
        return fuelLevel;
    }

    public GasCar(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Option[] options, int numberOfDoors) {
        super(manufacturerName, milesOnVehicle, price, numberOfSeats, options, numberOfDoors);

        this.fuelLevel = fuelLevel;
    }



}
