package com.isaxved.Week1.Week1.Friday;

public class Gun {

    private int bulletCountInMagazine;
    private int size;

    public Gun(int size) {
        this.size = size;
        reload();
    }

    public void fire() {
        bulletCountInMagazine--;
    }

    public void reload() {
        bulletCountInMagazine = size;
    }

    public int getBulletCountInMagazine() {
        return bulletCountInMagazine;
    }

    public void setBulletCountInMagazine(int bulletCountInMagazine) {
        this.bulletCountInMagazine = bulletCountInMagazine;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
