package com;

public class LottoM_Main {
    public static void main(String[] args) {
        LottoM_1 m1 = new LottoM_1();
        Ball[] balls = new Ball[m1.MAX_COUNT]; // 얘는 생성자가 아님. 그냥 배열리스트만 선언 NULL상태.
        for (int i = 0; i <m1.MAX_COUNT; i++){
            balls[i] = new Ball(i+1);
        }


        m1.setBalls(balls);
        m1.mix();
        Ball[] result = m1.getBalls();

        for(int i=0; i<result.length;i++){
            System.out.println(result[i].getNumber());
        }

    }
}
