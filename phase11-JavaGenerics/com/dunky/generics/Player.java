package com.dunky.generics;
public abstract class Player {
    private String name;

    public Player(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
