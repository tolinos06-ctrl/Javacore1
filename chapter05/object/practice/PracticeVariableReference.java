package javacore.chapter05.object.practice;

public class PracticeVariableReference {
    public static void main(String[] args){

        PracticeObjectCar car1 = new PracticeObjectCar("XXX" , "Ferrari" , "F458","Red" , 1);
        PracticeObjectCar car2 = car1;

        displayCar(car2);

        System.out.println("Troisième valeur (N° série de car1 " + car1.serialNumber);
        System.out.println("Troisième valeur (N° série de car2 " + car2.serialNumber);

        car2 = new PracticeObjectCar("XXX" , "Ferrari" , "F458","Red" , 1);
        car1 = new PracticeObjectCar("XXX" , "Ferrari" , "F458","Red" , 1);

        System.out.println("Seconde valeur Reférence de car1 " + car1);
        System.out.println("Seconde valeur Reférence de ca21 " + car2);

        System.out.println("4e valeur (N° série de car1 " + car1.serialNumber);
        System.out.println("4e valeur (N° série de car2 " + car2.serialNumber);

        car1.serialNumber = "KNJNA X";
        System.out.println("5e valeur (N° série de car1 " + car1.serialNumber);
        System.out.println("5e valeur (N° série de car2 " + car2.serialNumber);


    }

    public static void displayCar(PracticeObjectCar car){
        car.serialNumber = "123456789";
        System.out.println("Valeur (fonction) du N° " + car.serialNumber);
        System.out.println("Reference (fonction) de la voiture " + car);

    }
}
