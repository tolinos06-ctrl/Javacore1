package javacore.chapter03.loop.exerciseChap3;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        int number = 153;
        int original = number;
        int number2 = number;
        int puissance = 0;
        int chiffre;
        int test = 0;
        int calculPuissance = 1;
        while(number2 > 0){
            number2 /= 10;
            puissance +=1;
        }
        while ( number > 0 ){
            chiffre = number % 10;
            calculPuissance = 1;
            for(int i = 0; i < puissance ;i++){
                calculPuissance *= chiffre;
            }
            test += calculPuissance;
            number/=10;
        }
        if(test == original){
            System.out.print(original + " est un nombre d'Amstrong");
        }
        else{
            System.out.print(original + " n'est pas un nombre d'Amstrong");
        }
        ArmstrongNumbers.armstrongNumbers();
    }


    public static void armstrongNumbers(){
        int number = 100;
        int numberVerif = number;
        int numberVerif2 = number;
        int puissance = 0;
        int compteur = 0;
        while(number>0){
            number /= 10;
            puissance += 1;
        }
        while(numberVerif>0){
            int chiffre = numberVerif % 10;
            int resultPuissance = 1;
            for(int i = 0;i<=puissance;i++){
                resultPuissance *= chiffre;
            }
            compteur += chiffre;
            numberVerif /= 10;
        }
        if(compteur == numberVerif2){
            System.out.print(numberVerif2 + " est un nombre d'Armstrong");
        }
        else{
            System.out.print(numberVerif2 + " n'est pas un nombre d'Armstrong");

        }
    }
}
