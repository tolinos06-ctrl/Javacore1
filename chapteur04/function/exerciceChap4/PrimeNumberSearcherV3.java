package javacore.javacore.chapteur04.function.exerciceChap4;

public class PrimeNumberSearcherV3 {
    public static void main(String[] args) {
        int nombrePremier = 1;
        int PotentialNombrePremier = 2;
        while(nombrePremier <= 50){
            boolean premier = isPrimeNumber(PotentialNombrePremier);
            if (premier){
                System.out.println(PotentialNombrePremier + " est le nombre premier numéro " + nombrePremier);
                nombrePremier ++;
            }
            PotentialNombrePremier ++;

        }
    }
    public static boolean isPrimeNumber(int number){
        boolean premier = true;
        for(int i = 2; i <= number/2;i++){
            if (number % i == 0){
                premier = false;
                break;
            }
        }
        return premier;
    }
}


