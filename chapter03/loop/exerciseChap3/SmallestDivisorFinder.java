package javacore.chapter03.loop.exercise;

public class SmallestDivisorFinder {
    public static void main(String[] args) {
        //
        int number = 17;
        int diviseur = 2;
        while (number % diviseur != 0) {
            diviseur++;
        }
        if (number == diviseur) {
            System.out.println(number + " est un nombre premier");
        } else {
            System.out.println("Le plus petit diviseur est " + diviseur);
        }
    }
}