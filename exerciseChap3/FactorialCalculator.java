package javacore.chapter03.loop.exercise;

public class FactorialCalculator {
    public static void main(String[] args) {
        int number = -0;
        int test = number;
        long result = 1;
        if(number<0){
            System.out.println("Erreur");
        }
        else if (number == 0){
            System.out.println("La factorielle de 0 est 1");
        }
        else {
            while (number >= 1) {
                result *= number;
                number--;
            }
            System.out.println("La factorielle de " + test + " est " + result);
        }
    }
}
