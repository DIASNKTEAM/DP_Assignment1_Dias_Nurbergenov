package com.company;

public abstract class Character {

    private FootballBehavior footballBehavior;

    public Character(FootballBehavior footballBehavior){
        this.footballBehavior = footballBehavior;
    }

    public Character() {

    }

    public void performBall(){
        this.footballBehavior.ball();
    }

    abstract void display();

    public FootballBehavior getWeaponBehavior() {
        return footballBehavior;
    }

    public void setFootballBehavior(FootballBehavior footballBehavior) {
        this.footballBehavior = footballBehavior;
    }
}