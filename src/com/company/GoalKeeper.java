package com.company;

public class GoalKeeper extends Character {

    public GoalKeeper(FootballBehavior footballBehavior) {
        super(new SaveBehavior());
    }

    public GoalKeeper() {
        super(new SaveBehavior());
    }

    @Override
    void display() {
        System.out.println("I am GoalKeeper");
    }
}
