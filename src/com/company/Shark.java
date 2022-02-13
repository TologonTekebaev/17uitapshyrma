package com.company;

public class Shark extends Animal{
    @Override
    public void eat() {
        System.out.println("Shark is eating");
    }
    public void attack(){
        System.out.println("Shark is attacking");
    }
}
