package javacore.chapter02.condition.practice;

public class PracticeCondition {
    public static void main(String[] args){
        boolean trueAndTrue = true && true;
        boolean trueAndFalse = true && false;
        boolean falseAndTrue = false && true;
        boolean falseAndFalse = false && false;

        boolean trueOrTtrue = true || true;
        boolean trueOrFalse = true || false;
        boolean falseOrTrue = false || true;
        boolean falseOrFalse = false || false;

        boolean notTrue = !true;
        boolean notFalse = !false;

        boolean trueAndTrueAndTrue = true && true && true;
        boolean trueAndFalseAndTrue = true && false && false;

        boolean trueOrTrueOrTrue = true||true||true;
        boolean trueOrFalseOrTrue = true||false||true;

        boolean notNotTrue = !!true;
        boolean notNotFalse = !!false;

        boolean isLoggedIn = true;

        int age = 25;
        int seatsAvailable = 40;
        boolean isPremiumMember = true;
        boolean isVipFlight = true;

        if(isLoggedIn && age >= 18 && seatsAvailable > 0 && (!isVipFlight || isPremiumMember)){
            System.out.println("réservation éffectuée avec succès");
            seatsAvailable--;
        }
        else{
            System.out.println("Réservation impossible");
        }
    }
}
