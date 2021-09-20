package com.company;

public class Midfielder extends Character {

    public Midfielder() {
        super(new AssistFootballBehavior());
    }

    @Override
    void display() {
        System.out.println("I am Midfielder!");
    }
}
