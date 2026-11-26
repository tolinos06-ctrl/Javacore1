package javacore.chapter05.object.practice;

public class PracticeObject {
    public static void main(String[] args){

        PracticeObjectCar car1 = new PracticeObjectCar("JJANDI","Ferrari","418","red",460000);

        car1.run(2000);
        car1.displayInformations();

        PracticeObjectCar car2 = new PracticeObjectCar("HGHJAV","Ford","Mustang","Jaune",120000);

        car2.run(150);
        car2.displayInformations();

    }
    public static double run(double distance){
        System.out.println("La voiture roule pendant " + distance + " kms");
        return distance;
    }
}


