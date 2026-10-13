package javacore.javacore.chapteur04.function.exerciceChap4;

public class RecursiveFunction {
    public static void main(String[] args) {
        affichage(1,1000);
    }

    public static int affichage(int number1, int number2) {
        System.out.println(number1);
        if (number1 < number2) {
            affichage(number1 + 1,number2);
            number1 += 1;
        }
        return 0;
    }
}
