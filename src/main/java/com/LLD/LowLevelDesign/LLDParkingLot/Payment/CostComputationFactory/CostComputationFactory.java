package com.LLD.LowLevelDesign.LLDParkingLot.Payment.CostComputationFactory;

import com.LLD.LowLevelDesign.LLDParkingLot.VehicleType;
import com.LLD.LowLevelDesign.LLDParkingLot.Payment.CostComputation;
import com.LLD.LowLevelDesign.LLDParkingLot.Payment.FourWheelerCostComputation;
import com.LLD.LowLevelDesign.LLDParkingLot.Payment.TwoWheelerCostComputation;

public class CostComputationFactory {
    public CostComputation getParkingSpotManger(VehicleType vehicleType) {
        switch (vehicleType) {
            case TWO_WHEELER:
                return new TwoWheelerCostComputation();
            case FOUR_WHEELER:
                return new FourWheelerCostComputation();
            default:
                return null;
        }
    }
}
