package com.LLD.LowLevelDesign.LLDParkingLot.ParkingStrategy;

import com.LLD.LowLevelDesign.LLDParkingLot.ParkingSpot;
import com.LLD.LowLevelDesign.LLDParkingLot.TwoWheelerParkingSpot;

public class NearestToEntranceParkingStrategy implements ParkingStrategy {

    @Override
    public ParkingSpot findParkingSpace() {
        // finds the parking space which is nearest to enterance gate of parking
        return new TwoWheelerParkingSpot();
    }

}
