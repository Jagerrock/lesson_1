package com.company;

public class ITguy extends Person {
    String company;
    int salary;
    String role;


    ITguy(String name){
        super(name);
    }


    @Override
    void info(){
        System.out.println(company);
        System.out.println(salary);
        System.out.println(role);
    }
}
