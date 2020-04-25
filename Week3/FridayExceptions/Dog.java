package com.isaxved.Week1.Week3.FridayExceptions;

public class Dog {
    private String name;
    public boolean isCollarPutOn;
    private boolean isMuzzlePutOn;
    public boolean isLeashPutOn;

    public Dog(String name) {
        this.name = name;
    }

    public void walk() throws DogIsNotReadyException {
        System.out.println("Let's get ready for a walk!");
        if (isCollarPutOn && isLeashPutOn && isMuzzlePutOn) {
            System.out.println("let's go for a walk" + getName());
        } else {
            throw new DogIsNotReadyException("Dog" + getName() + "Is not ready!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCollarPutOn() {
        return isCollarPutOn;
    }

    public void setCollarPutOn(boolean collarPutOn) {
        isCollarPutOn = collarPutOn;
    }

    public boolean isMuzzlePutOn() {
        return isMuzzlePutOn;
    }

    public void setMuzzlePutOn(boolean muzzlePutOn) {
        isMuzzlePutOn = muzzlePutOn;
    }

    public boolean isLeashPutOn() {
        return isLeashPutOn;
    }

    public void setLeashPutOn(boolean leashPutOn) {
        isLeashPutOn = leashPutOn;
    }
}
