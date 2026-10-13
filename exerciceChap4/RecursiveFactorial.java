package javacore.javacore.chapteur04.function.exerciceChap4;

public class RecursiveFactorial {
    public static void main(String[] args) {
        int number = 3;
        System.out.println(Factorielle(number));
    }

    public static int Factorielle(int number){
        int c =1;
        if(number > 0){
            c = number * Factorielle(number - 1);
        }
        return c ;
    }
}
