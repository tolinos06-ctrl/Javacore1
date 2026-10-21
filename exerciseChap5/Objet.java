package javacore.chapter05.object.exercise;

import javacore.chapter05.object.practice.PracticeObjectCar;

public class Objet {
    public static void main(String[] args){




        CarImprovement car1 = new CarImprovement("JJANDI","Ferrari","418","red",460000);

        car1.run(2000);
        car1.start();
        car1.run(2000);
        car1.displayInformations();


    }
}
