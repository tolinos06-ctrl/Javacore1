package javacore.chapter02.condition.exercise;

public class AgeCategorization {
    public static void main(String[] args) {
        //9 12 22 48 72
        int age = 9;
        if(age < 10){
            System.out.println("Enfant");
        }
        else if(age >= 10 && age < 18){
            System.out.println("Ado");
        }
        else if(age >= 18 && age < 25){
            System.out.println("Jeune adulte");
        }
        else if(age>=25 && age <65){
            System.out.println("Adulte");
        }
        else{
            System.out.println("Sénior");
        }
    }
}
