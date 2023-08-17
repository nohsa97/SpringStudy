package com.exam;

public abstract class Controller {
    protected void init(){
        System.out.println("실행");
    }

    public abstract void run();

    protected void exit(){
        System.out.println("종료");
    }

    public void start(){
        init();
        run();
        exit();
    }
}
