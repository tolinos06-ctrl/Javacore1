package javacore.chapter05.object.exercise;
import java.util.Scanner;
import java.util.List;
public class TestResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dayValue;
        List<String> days = List.of("lundi","mardi","mercredi","jeudi","vendredi","samedi","dimanche");
        do{
            System.out.print("Quel jour de la semaine somme-nous ? : ");
            dayValue = sc.nextLine().trim().toLowerCase();
        }while(!days.contains(dayValue));
        System.out.println("Parfait, vous avez choisi : " + dayValue);


    }
}
