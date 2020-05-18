package com.company;
import java.util.List;
import java.util.LinkedList;


public interface Train {
    void startMoving();
    void stopMoving();

    List<Car> getCars();
    void addCar(Car car);

}
