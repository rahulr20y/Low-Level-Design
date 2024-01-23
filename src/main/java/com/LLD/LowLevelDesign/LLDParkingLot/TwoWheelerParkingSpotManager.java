package com.LLD.LowLevelDesign.LLDParkingLot;

import java.util.ArrayList;
import java.util.List;

import com.LLD.LowLevelDesign.LLDParkingLot.ParkingStrategy.ParkingStrategy;

public class TwoWheelerParkingSpotManager extends ParkingSpotManager {

    static List<ParkingSpot> listParkingSpots = new ArrayList<>();
    ParkingStrategy parkingStrategy;

    public TwoWheelerParkingSpotManager(ParkingStrategy parkingStrategy) {
        super(listParkingSpots);
        this.parkingStrategy = parkingStrategy;
    }

    @Override
    public void findParkingSpace() {
        parkingStrategy.findParkingSpace();
    }

}
