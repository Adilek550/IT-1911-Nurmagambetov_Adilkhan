package com.company;

import com.company.Car;
import com.company.Train;

import java.util.LinkedList;
import java.util.List;

public class AdilekTrain implements Train {
    private String destination;
    private List<Car> cars = new LinkedList<>();

    @Override
    public void startMoving() {
        System.out.println("Train started to move");
    }

    @Override
    public void stopMoving() {
        System.out.println("Train stopped");
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public void addCar(Car car) {
        cars.add(car);
    }
}
