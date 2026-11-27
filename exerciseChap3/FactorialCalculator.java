package javacore.chapter03.loop.exerciseChap3;

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

        System.out.print(factorielle(3));
    }


    public static int factorielle(int number){
        if(number<=1){
            return 1;
        }
        return number * factorielle(number-1);
    }
}
