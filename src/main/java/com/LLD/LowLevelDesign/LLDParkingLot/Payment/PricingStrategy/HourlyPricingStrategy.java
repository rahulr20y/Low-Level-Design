package com.LLD.LowLevelDesign.LLDParkingLot.Payment.PricingStrategy;

public class HourlyPricingStrategy implements PricingStrategy {

    @Override
    public Double price() {
        int hour = 2;
        return Double.valueOf(20 * hour);
    }

}
