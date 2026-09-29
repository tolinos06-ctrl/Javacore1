package javacore.chapter02.condition.exercise;

public class NumberComparison {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 12;
        if (number1>number2){
            System.out.println(number1 + " est plus grand que " + number2);
        }
        else if (number2 > number1 ){
            System.out.println(number2 + " est plus grand que " + number1);
        }
        else{
            System.out.println(number1 + " est égale à " + number2);
        }
    }
}
