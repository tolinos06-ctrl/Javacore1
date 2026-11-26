package javacore.chapter05.object.practice;

public class PracticeVariableDefault {
    int entier;
    double virgule;
    boolean trueFalse;
    char caracter;

    String textValue;

    public static void main(String[] args){

        PracticeVariableDefault testDefaultValueObject = new PracticeVariableDefault();

        System.out.println("Entier : " + testDefaultValueObject.entier);
        System.out.println("Virgule : " + testDefaultValueObject.virgule);
        System.out.println("Boonéen : " + testDefaultValueObject.trueFalse);
        System.out.println("Char : " + testDefaultValueObject.caracter);
        System.out.println("Texte : " + testDefaultValueObject.textValue);

    }
}
