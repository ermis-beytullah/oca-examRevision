package com.beytullahermis;

public class Animal implements IWalk, IRun{

    Animal() {
        super();
    }

    void sound() {
        System.out.println("Makes Noise");
    }

    void run() {
        System.out.println("Animal run");
    }

    public int getSpeed() {
        return 20;
    }

    public static void main(String[] args) {
        Animal an = new Animal();
        System.out.println(an.getSpeed());
    }
}
