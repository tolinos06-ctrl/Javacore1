package javacore.chapter02.condition.exercise;

public class NumberSignVerifier {
    public static void main(String[] args) {
        double number = -12.5;
        if(number > 0){
            System.out.println(number + " est positif");
        }
        else if(number < 0){
            System.out.println(number + " est négatif");
        }
        else{
            System.out.println(number + " est nul");
        }
    }
}
