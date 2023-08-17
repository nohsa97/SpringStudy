package com.abs;

public class Bus extends Car{
    public Bus(String name){
        super(name);
        System.out.println("생성");
    }

    @Override
    public void run() {
        System.out.println("Bus");
    }
}
