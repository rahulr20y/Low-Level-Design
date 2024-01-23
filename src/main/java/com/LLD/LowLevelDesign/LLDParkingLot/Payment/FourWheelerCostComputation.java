package com.LLD.LowLevelDesign.LLDParkingLot.Payment;

import com.LLD.LowLevelDesign.LLDParkingLot.Payment.PricingStrategy.HourlyPricingStrategy;

public class FourWheelerCostComputation extends CostComputation {

    public FourWheelerCostComputation() {
        super(new HourlyPricingStrategy());
    }

}
