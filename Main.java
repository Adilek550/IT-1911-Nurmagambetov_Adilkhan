package com.company;

import com.company.AdilekTrain;
import com.company.EconomCar;
import com.company.RichCar;

public class Main {

    public static void main(String[] args) {


        AdilekTrain train = new AdilekTrain();
        train.addCar(new EconomCar());
        train.addCar(new EconomCar());
        train.addCar(new RichCar());


        train.getCars().forEach(c -> System.out.println(c.getType()));

    }
}
