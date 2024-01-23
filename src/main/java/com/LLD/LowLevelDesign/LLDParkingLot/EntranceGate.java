package com.LLD.LowLevelDesign.LLDParkingLot;

import com.LLD.LowLevelDesign.LLDParkingLot.ParkingSlotFactory.ParkingSlotFactory;

public class EntranceGate {

    ParkingSlotFactory parkingSlotFactory;
    // ParkingSpotManager parkingSpotManager;
    Ticket ticket;

    public EntranceGate(ParkingSlotFactory parkingSlotFactory, Ticket ticket) {
        this.parkingSlotFactory = parkingSlotFactory;
        this.ticket = ticket;
    }

    public void findSpace(VehicleType vehicleType, int gateNumber) {

    }

    public void bookSpot(Vehicle vehicle) {

    }

    public void generateTicket(Vehicle vehicle) {

    }
}
