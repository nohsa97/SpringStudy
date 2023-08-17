package com;

// 1~45 숫자 기계 넣고
// 섞고 6개 꺼냄
//

public interface LottoM { // 로또머신은 new로 생성 불가능. 메소드가 존재한다고 명시하는 것.
    public static int MAX_COUNT = 45; //상수임
    public static int RETURN_BALL_COUNT = 6; //모든 필드는 public static 메모리에 자동으로 올라감.
    public abstract void setBalls(Ball[] balls);
    public abstract void mix();
    public abstract Ball[] getBalls();
}

//자바 8부터는 DEFAULT 메소드로 구현 가능.
