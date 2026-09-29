package javacore.chapter01.variable.exercise;

public class SalaryForecast {
    public static void main(String[] args) {
        double salaireBrutJ = 25 * 7.7;
        double salaireBrutH = salaireBrutJ * 5;
        double salaireBrutM = salaireBrutH * 4;
        double salaireBrutA = salaireBrutM * 12;
        double salaireNetImposableM = salaireBrutM * 0.75;
        double salaireNetImposableA = salaireBrutA * 0.75;
        double salaireNetM = salaireNetImposableM * 0.895;
        double salaireNetA = salaireNetImposableA * 0.895;
        System.out.println("Voici le Salaire Brut Journalier " + salaireBrutJ);
        System.out.println("Voici le salaire Brut Mensuel " + salaireBrutM);
        System.out.println("Voici le salaire Brut Annuel " + salaireBrutA);
        System.out.println("Voici le salaire Net Imposable Mensuel " + salaireNetImposableM);
        System.out.println("Voici le salaire Net Imposable Annuel " + salaireNetImposableA);
        System.out.println("Voici le salaire net mensuel " + salaireNetM);
        System.out.println("Voici le salaire net annuel " + salaireNetA);
        System.out.println(salaireNetM + " * 12 = " +salaireNetM * 12);
    }
}
