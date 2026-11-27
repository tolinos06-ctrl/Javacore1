package javacore.chapter03.loop.exerciseChap3;

public class PrimeNumberSearcherV2 {
    public static void main(String[] args) {
        int potentialPrimeNumber = 1;
        int primeNumberFound = 1;
        int compteur = 0;
        System.out.println("Liste des 50 premiers nombres Premiers :");
        while(primeNumberFound<=100){
            boolean isCurrentNumberPrime = true;
            for(int potentialDivisor = 2;potentialDivisor<=potentialPrimeNumber/2;potentialDivisor++){
                if(potentialPrimeNumber%potentialDivisor ==0){
                    isCurrentNumberPrime = false;
                    break;
                }
                compteur += 1;

            }
            if(isCurrentNumberPrime){
                System.out.println("->" + potentialPrimeNumber + " est le Nombre Premier N° " + primeNumberFound);
                primeNumberFound ++;
            }
            potentialPrimeNumber++;
        }
        System.out.print(compteur + " nombres d'itérations");
    }
}
