package com.company;

abstract class Animal {
    String size;
    String vid;
    String area;

    abstract void info();

    void info(int a, int b){
        System.out.println(a+b);
    }
}
