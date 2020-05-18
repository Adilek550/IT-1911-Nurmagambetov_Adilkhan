package com.company;

import com.company.PassengerWagon;
import com.company.WithSocket;
import java.lang.System;

public abstract class RichCar extends PassengerWagon implements WithSocket {

    private final int placeCount = 20;

    @Override
    public int getPlaceCount() {
        return placeCount;
    }

    @Override
    public String getType() {
        return "Rich Class wagon";
    }

    @Override
    public void withSoc() {
        System.out.println("Your place with a socket");
    }

    @Override
    public void withoutSoc() {
        System.out.println("Your place without a socket");
    }
}
