package javacore.chapter02.condition.exercise;

public class AgeBasedDiscount {
    public static void main(String[] args) {
        //20 28 65
        int age = 28;
        //50 37.5 12.5
        double price = 50.0;
        if(age <= 25){
            price *= 0.75;
            System.out.println("Le prix de l'entrée est de " + price + " soit une réduction de 25%");
        }
        else if( age >= 65){
            price*=0.25;
            System.out.println("Le prix de l'entrée est de " + price + " soit une réduction de 75%");
        }
        else{
            System.out.println("Vous n'êtes pas éligibles a une réduction, Le prix de l'entrée est de " + price);
        }
    }
}
