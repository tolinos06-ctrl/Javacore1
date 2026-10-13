package javacore.javacore.chapteur04.function.exerciceChap4;

public class FactorizationExercise {

    public static void main(String[] args) {

        affichage(6);

        multiplication(3);

        carre(1,10);

    }
    public static void affichage(int number){
        System.out.println(number);
        if(number > 1){
            affichage(number - 1);
            number -= 1;
        }
    }
    public static void multiplication(int number){
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
    public static void carre(int number1, int number2){
        System.out.println("Carrés des nombres de " + number1 +" à " + number2);
        for (int i = number1; i <= number2; i++) {
            System.out.println(i + " au carré = " + (i * i));
        }
    }
}
