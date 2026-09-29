package javacore.chapter02.condition.exercise;

public class ConditionError {
    public static void main(String[] args) {

        int age = 80;

        if(age <= 16) {
            System.out.println("Vous êtes mineur.");
        }
        else if(age == 17) {
            System.out.println("Vous êtes bientôt majeur !");
        }
        else if(age == 18) {
            System.out.println("Vous êtes majeur.");
        }
        //Le code se lit de haut en bas en C, cela implique donc que si tu as une boucle age > 18, c'est cette boucle qui sera utiliser pour tout age dépassant 18.
        else if(age > 18 && age <= 60) {
            System.out.println("Vous êtes un adulte.");
        }
        else if(age > 60 && age < 100) {
            System.out.println("Vous n'êtes plus tout jeune.");
        }
        else {
            System.out.println("Vous êtes une exception dans ce monde !");
        }

    }
}
