package com.isaxved.Week1.Week1.Friday;

public class Transformer {

    private int position;
    Gun leftHandGun;
    Gun rightHandGun;



    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void fire() {
        rightHandGun.fire();
        leftHandGun.fire();
    }

    public Transformer(int position) {
        this.position = position;
    }

    public void run() {
        position = position + 1;
    }

}
