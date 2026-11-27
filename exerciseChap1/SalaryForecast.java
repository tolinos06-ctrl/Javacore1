package javacore.chapter01.variable.exercise;

public class SalaryForecast {
    public static void main(String[] args) {
        double salaireBrutJ = 25 * 7.7;
        System.out.println("Voici le Salaire Brut Journalier " + salaireBrutJ);

        double salaireBrutH = salaireBrutJ * 5;

        double salaireBrutM = salaireBrutH * 4;
        System.out.println("Voici le salaire Brut Mensuel " + salaireBrutM);

        double salaireBrutA = salaireBrutM * 12;
        System.out.println("Voici le salaire Brut Annuel " + salaireBrutA);

        double salaireNetImposableM = salaireBrutM * 0.75;
        System.out.println("Voici le salaire Net Imposable Mensuel " + salaireNetImposableM);

        double salaireNetImposableA = salaireBrutA * 0.75;
        System.out.println("Voici le salaire Net Imposable Annuel " + salaireNetImposableA);

        double salaireNetM = salaireNetImposableM * 0.895;
        System.out.println("Voici le salaire net mensuel " + salaireNetM);

        double salaireNetA = salaireNetImposableA * 0.895;
        System.out.println("Voici le salaire net annuel " + salaireNetA);

        System.out.println(salaireNetM + " * 12 = " +salaireNetM * 12);
    }
}
