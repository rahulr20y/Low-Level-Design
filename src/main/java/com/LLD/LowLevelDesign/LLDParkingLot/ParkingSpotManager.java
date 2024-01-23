package com.LLD.LowLevelDesign.LLDParkingLot;

import java.util.List;

public abstract class ParkingSpotManager {
    List<ParkingSpot> listParkingSpots; // has-a relationship with ParkingSpot

    ParkingSpotManager(List<ParkingSpot> list) {
        this.listParkingSpots.addAll(list);
    }

    public abstract void findParkingSpace();

    public void addParkingSpace() {

    }

    public void removeParkingSpace() {

    }

    public void parkVehicle() {

    }

    public void removeVehicle() {

    }
}
