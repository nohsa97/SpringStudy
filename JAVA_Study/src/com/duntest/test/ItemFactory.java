package com.duntest.test;

public class ItemFactory {
    private static ItemFactory instance = new ItemFactory();

    private ItemFactory(){

    }
    public static ItemFactory getInstance(){
        return instance;
    }
}
