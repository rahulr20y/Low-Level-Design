package com.LLD.LowLevelDesign.LLDParkingLot.ParkingStrategy;

import com.LLD.LowLevelDesign.LLDParkingLot.ParkingSpot;
import com.LLD.LowLevelDesign.LLDParkingLot.TwoWheelerParkingSpot;

public class DefaultParkingStrategy implements ParkingStrategy{

    @Override
    public ParkingSpot findParkingSpace() {
        // default strategy
        return new TwoWheelerParkingSpot();
    }
    
}
