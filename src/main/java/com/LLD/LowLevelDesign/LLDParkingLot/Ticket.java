package com.LLD.LowLevelDesign.LLDParkingLot;

public class Ticket {
    Long entryTime;
    Vehicle vehicle;
    ParkingSpot parkingSpot; // has-a relationship with parkingSpot

    public Ticket(Long entryTime, Vehicle vehicle, ParkingSpot parkingSpot) {
        this.entryTime = entryTime;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
    }

    public Long getEntryTime() {
        return entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setEntryTime(Long entryTime) {
        this.entryTime = entryTime;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

}
