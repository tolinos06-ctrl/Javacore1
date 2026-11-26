package javacore.chapter05.object.practice;

public class PracticeStatic {

    public static void main(String[] args){

        PracticeStaticCar car1 = new PracticeStaticCar("Ferrari" , "F458" , 260000);

        PracticeStaticCar car2 = new PracticeStaticCar("Ford" , "Mustang" , 120000);

        System.out.println(PracticeStaticCar.carCounter);

        System.out.println(PracticeStaticCalculator.sum(5,8));

    }


}
