package com.duntest.test;

public class EpicItem  extends Item{
    public int i = 20; // 가급적 private로 선언
    @Override
    public void grade() {
        System.out.println("에픽 아이템");
    }

    public void showI(){
        System.out.println(i);
    }

//    public void showI2(){
//        System.out.println(i*2+5);
//    }
}
