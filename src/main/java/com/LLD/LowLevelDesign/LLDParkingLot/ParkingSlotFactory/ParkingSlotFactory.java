package com.LLD.LowLevelDesign.LLDParkingLot.ParkingSlotFactory;

import com.LLD.LowLevelDesign.LLDParkingLot.FourWheelerParkingSpotManager;
import com.LLD.LowLevelDesign.LLDParkingLot.ParkingSpotManager;
import com.LLD.LowLevelDesign.LLDParkingLot.TwoWheelerParkingSpotManager;
import com.LLD.LowLevelDesign.LLDParkingLot.VehicleType;
import com.LLD.LowLevelDesign.LLDParkingLot.ParkingStrategy.DefaultParkingStrategy;
import com.LLD.LowLevelDesign.LLDParkingLot.ParkingStrategy.NearestToEntranceParkingStrategy;

public class ParkingSlotFactory {
    public ParkingSpotManager getParkingSpotManger(VehicleType vehicleType) {
        switch (vehicleType) {
            case TWO_WHEELER:
                return new TwoWheelerParkingSpotManager(new DefaultParkingStrategy());
            case FOUR_WHEELER:
                return new FourWheelerParkingSpotManager(new NearestToEntranceParkingStrategy());
            default:
                return null;
        }
    }
}
