package com.isaxved.Week1.Week1.Friday;

public class Main {
    public static void main(String[] args) {
        Gun glock = new Gun(20);
        Gun ak47 = new Gun(30);
        Transformer optimus_Prime = new Transformer(0);
        optimus_Prime.leftHandGun = glock;
        optimus_Prime.rightHandGun = ak47;
        optimus_Prime.run();
        System.out.println(optimus_Prime.getPosition());
    }
}
