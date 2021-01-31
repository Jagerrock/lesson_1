package com.company;

public class MyCar extends Car {

    @Override
    void description(){
        System.out.println(model);
        System.out.println(speed);
        System.out.println(color);
    }
}
