package com.company;

public interface PassengerCar extends Car {
    void addPassenger(Passanger passenger) throws Exception;
    int getPassengerCount();
    int getPlaceCount();
    boolean isFull();
}
