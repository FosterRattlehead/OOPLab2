package edu.sdccd.cisc191;

public class HybridCar extends Car implements Combustible,Chargeable{

    int fuelLevel;
    int batteryCharge;


    public void tankUp() {
        fuelLevel=100;

    }

    public void chargeUp() {
        batteryCharge=100;

    }

    public HybridCar(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Option[] options, int numberOfDoors) {
        super(manufacturerName, milesOnVehicle, price, numberOfSeats, options, numberOfDoors);
        this.fuelLevel = fuelLevel;
        this.batteryCharge = batteryCharge;
    }


    public int getFuelLevel() {
        return fuelLevel;
    }

    public int getBatteryCharge() {
        return batteryCharge;
    }
}
