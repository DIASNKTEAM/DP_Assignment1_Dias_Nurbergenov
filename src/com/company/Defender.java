package com.company;

public class Defender extends Character{

    public Defender(FootballBehavior footballBehavior) {
        super(new TackleFootballBehavior());
    }

    public Defender() {
        super(new TackleFootballBehavior());
    }

    @Override
    void display() {
        System.out.println("I am Defender!");
    }
}
