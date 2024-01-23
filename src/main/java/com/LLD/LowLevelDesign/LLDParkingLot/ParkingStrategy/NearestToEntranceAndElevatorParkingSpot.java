package com.LLD.LowLevelDesign.LLDParkingLot.ParkingStrategy;

import com.LLD.LowLevelDesign.LLDParkingLot.ParkingSpot;
import com.LLD.LowLevelDesign.LLDParkingLot.TwoWheelerParkingSpot;

public class NearestToEntranceAndElevatorParkingSpot implements ParkingStrategy {

    @Override
    public ParkingSpot findParkingSpace() {
        // finds the parking space which is nearest to gate and elevator
        return new TwoWheelerParkingSpot();
    }

}
