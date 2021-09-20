package com.company;

public class Main {

    public static void main(String[] args) {

        Character character = new GoalKeeper();

        character.display();
        character.performBall();

        character.setFootballBehavior(new AssistFootballBehavior());

        character.performBall();


    }
}
