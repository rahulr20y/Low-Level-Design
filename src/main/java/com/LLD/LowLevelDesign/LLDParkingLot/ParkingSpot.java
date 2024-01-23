package com.LLD.LowLevelDesign.LLDParkingLot;

public abstract class ParkingSpot {
    int id;
    boolean isEmpty;
    Vehicle vehicle;
    double price;

    public abstract double price();

    public void parkVehicle() {

    }

    public void removeVehicle() {

    }
}
