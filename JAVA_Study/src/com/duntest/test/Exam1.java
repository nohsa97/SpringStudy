package com.duntest.test;

public class Exam1 {
    public static void main(String[] args) {
        ItemABS Ex1 = new ItemABS(){

            @Override
            public void a() {
                System.out.println("익명");
            }
        };

        ItemInter a = new ItemInter() {
            @Override
            public void a() {
                System.out.println("asdasd");
            }
        };

        Ex1.a();

        a.a();
    }
}
