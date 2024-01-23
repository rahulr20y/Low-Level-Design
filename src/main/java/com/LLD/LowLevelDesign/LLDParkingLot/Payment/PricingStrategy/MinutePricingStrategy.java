package com.LLD.LowLevelDesign.LLDParkingLot.Payment.PricingStrategy;

public class MinutePricingStrategy implements PricingStrategy{

    @Override
    public Double price() {
        int minutes = 20;
        return Double.valueOf(minutes * 20);
    }
    
}
