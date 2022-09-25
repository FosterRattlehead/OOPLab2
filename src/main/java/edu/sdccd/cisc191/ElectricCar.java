package edu.sdccd.cisc191;

public class ElectricCar extends Car implements Chargeable{
    int batteryCharge;
    public void chargeUp() {
        batteryCharge=100;

    }

    public ElectricCar(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Option[] options, int numberOfDoors) {
        super(manufacturerName, milesOnVehicle, price, numberOfSeats, options, numberOfDoors);
        this.batteryCharge = batteryCharge;
    }

    public int getBatteryCharge() {
        return batteryCharge;
    }
}
