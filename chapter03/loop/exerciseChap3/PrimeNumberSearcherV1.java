package javacore.chapter03.loop.exerciseChap3;

public class PrimeNumberSearcherV1 {
    public static void main(String[] args) {
        int potentialPrimeNumber = 1;
        int primeNumberFound = 1;
        System.out.println("Liste des 50 premiers nombres Premiers :");
        while(primeNumberFound<=50){
            boolean isCurrentNumberPrime = true;
            for(int potentialDivisor = 2;potentialDivisor<=potentialPrimeNumber/2;potentialDivisor++){
                if(potentialPrimeNumber%potentialDivisor ==0){
                    isCurrentNumberPrime = false;
                }

            }
            if(isCurrentNumberPrime){
                System.out.println("->" + potentialPrimeNumber + " est le Nombre Premier N° " + primeNumberFound);
                primeNumberFound ++;
            }
            potentialPrimeNumber++;
        }

        primary();
    }
    // réalisé après avoir finis chap 5 mais en utilisant la logique chap3 tjr
    public static void primary(){
        int compteur = 1;
        while(compteur <= 50) {
            for (int i = 2; compteur <= 50; i++) {
                boolean estPremier = true;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        estPremier = false;
                    }
                }
                if (estPremier) {
                    System.out.println(i + " est le nombre premier N°" + compteur);
                    compteur += 1;
                }

            }
        }
    }

}