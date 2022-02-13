package com.company;

public class Main {
    public static void main(String[] args) {

        Turtle turtle = new Turtle();
        Shark shark = new Shark();
        Eagle eagle = new Eagle();

        Animal[] animals = {new Shark(), new Eagle(), new Turtle()};

        for (Animal ani : animals) {

            if (ani instanceof Shark) {
                ((Shark)ani).attack();
            }
            if (ani.getClass().getName().equals("com.company.Shark")){
                ((Shark)ani).attack();
            }

            if (ani instanceof Turtle) {
                ((Turtle)ani).swim();
            }
            if (ani.getClass().getName().equals("com.company.Turtle")){
                ((Turtle)ani).swim();
            }
            if (ani instanceof Eagle){
                ((Eagle)ani).fly();
            }
            if ((ani.getClass().getName().equals("com.company.Eagle"))){
                ((Eagle)ani).fly();
            }
        }
        Animal[] reptiles = {turtle};
        Animal[] fishes = {shark};
        Animal[] birds = {eagle};
    }
}
