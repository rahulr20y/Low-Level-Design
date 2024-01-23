package com.LLD.LowLevelDesign.LLDParkingLot;

import com.LLD.LowLevelDesign.LLDParkingLot.ParkingSlotFactory.ParkingSlotFactory;
import com.LLD.LowLevelDesign.LLDParkingLot.Payment.Payment;
import com.LLD.LowLevelDesign.LLDParkingLot.Payment.CostComputation;

public class ExitGate {
    ParkingSlotFactory parkingSlotFactory;
    Ticket ticket;
    ParkingSpotManager parkingSpotManager;
    CostComputation costComputation;
    Payment payment;

    public ExitGate(ParkingSlotFactory parkingSlotFactory, Ticket ticket, ParkingSpotManager parkingSpotManager,
            CostComputation costComputation, Payment payment) {
        this.parkingSlotFactory = parkingSlotFactory;
        this.ticket = ticket;
        this.parkingSpotManager = parkingSpotManager;
        this.costComputation = costComputation;
        this.payment = payment;
    }

    public Double getPrice() {
        return costComputation.price();
    }

    public void payment() {

    }

    public void removeVehicle() {

    }
}
