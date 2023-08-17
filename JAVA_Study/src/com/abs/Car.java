package com.abs;

public abstract class Car {
    String Name;

    public Car(String name){
        System.out.println(name);
    }

    public abstract void run();
}
