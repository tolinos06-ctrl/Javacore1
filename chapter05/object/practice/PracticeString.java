package javacore.chapter05.object.practice;

import java.util.Scanner;
import java.util.List;

public class PracticeString {
    public static void main(String[] args){

        String hello1 = "Bonjour";
        String hello2 = new String("Bonjour");

        System.out.println("Comparaison Références : " + (hello1 == hello2));
        System.out.println("Comparaison Equals : " + hello1.equals(hello2));

        String hello3 = "Bonjour";
        hello3 += ", tout le monde ! ";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Quel est votre prénom : ");
        String userFirstName = scanner.nextLine().trim();
        System.out.println("Bonjour " + userFirstName);


        String javaCore = "javaCore";

        System.out.println(javaCore.contains("java"));

        System.out.println(javaCore.startsWith("java"));
        System.out.println(javaCore.endsWith("et"));

        System.out.println(javaCore.toLowerCase());
        System.out.println(javaCore.toUpperCase());


        System.out.println(javaCore.replace("java", "AWS"));
    }
}
