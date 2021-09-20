package com.company;

public class Atacker extends Character{


    public Atacker() {
        super(new GoalBehavior());
    }

    @Override
    void display() {
        System.out.println("I am Atacker!");
    }
}
