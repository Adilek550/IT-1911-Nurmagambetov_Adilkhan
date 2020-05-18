package com.company;

import java.util.ArrayList;
import java.util.List;

public abstract class PassengerWagon implements PassengerCar {
    private List<Passanger> passangers = new ArrayList<>();

    @Override
    public void addPassenger(Passanger passenger) throws Exception {
        if (isFull()) throw new Exception("Wagon is full!");
        passangers.add(passenger);
    }

    @Override
    public int getPassengerCount() {
        return passangers.size();
    }

    @Override
    public boolean isFull() {
        return passangers.size() == getPlaceCount();
    }
}
