package com.duntest.test;  // 도메인 거꾸로 적는 이유. 바로 프로그래머 끼리 겹칠 수 있기 때문. 도메인(역순).프로젝트명

public class Dun {
    public static void main(String[] args) {
        Item i = new Item();
        i.grade();

        Item i2 = new EpicItem();
        i2.grade();

        Item i3 = new LegendItem();
        i3. grade();

        LegendItem i4 = (LegendItem) i3;
        i4.grade();

        System.out.println(i.i);
        System.out.println(i2.i);
        i.showI();
        i2.showI();

        i.showI2();
        i2.showI2();
    }
}
