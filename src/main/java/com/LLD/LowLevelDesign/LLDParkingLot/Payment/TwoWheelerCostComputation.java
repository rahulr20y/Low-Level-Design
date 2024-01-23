package com.LLD.LowLevelDesign.LLDParkingLot.Payment;

import com.LLD.LowLevelDesign.LLDParkingLot.Payment.PricingStrategy.MinutePricingStrategy;

public class TwoWheelerCostComputation extends CostComputation {

    public TwoWheelerCostComputation() {
        super(new MinutePricingStrategy());
    }

}
