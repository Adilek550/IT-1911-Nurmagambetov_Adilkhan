package com.company;

import com.company.PassengerWagon;

public class EconomCar extends PassengerWagon {

    private final int placeCount = 40;


    @Override
    public int getPlaceCount() {
        return placeCount;
    }

    @Override
    public String getType() {
        return "Econom Class wagon";
    }
}
