package com.LLD.LowLevelDesign.LLDParkingLot.Payment;

import com.LLD.LowLevelDesign.LLDParkingLot.Payment.PricingStrategy.PricingStrategy;

public class CostComputation {
    PricingStrategy pricingStrategy;

    public CostComputation(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public Double price() {
        return pricingStrategy.price();
    }
}
