package com.company;

public class Person {
    String sex;
    int age;
    String name;

    Person(){

    }
    public Person(String name){
        this.name = name;
    }
    Person(String name, String sex){
        this.name = name;
        this.sex = sex;
    }
    Person(String name, String sex, int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }


    void info(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(sex);
    }
}
