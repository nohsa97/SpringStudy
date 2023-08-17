package com;

public class LottoM_1 implements LottoM{
    private Ball [] balls;
    @Override
    public void setBalls(Ball[] balls) {
        this.balls = balls;
    }

    @Override
    public void mix() {
        for (int i = 0; i<10000;i++){
            int rand1 = (int)(Math.random()*45);
            int rand2 = (int)(Math.random()*45);
            if(rand1 != rand2){
                Ball temp = balls[rand1];
                balls[rand1] = balls[rand2];
                balls[rand2] = temp;
            }
        }

    }

    @Override
    public Ball[] getBalls() {
        Ball[] result = new Ball[6];
        for (int i =0;i<6;i++){
            result[i] = balls[i];
        }
        return result;
    }
}
