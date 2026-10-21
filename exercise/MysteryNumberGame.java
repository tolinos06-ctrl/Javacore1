package javacore.chapter05.object.exercise;
import java.util.Random;
import java.util.Scanner;

public class MysteryNumberGame {
    public static void main(String[] args){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int nbrATrouver = random.nextInt(101);
        int compteur = 0;
        int rep;
        boolean trouve = false;
        System.out.println("Tentez de deviner mon nombre secret compris entre 0 et 100");
        do{
            do{
                System.out.print("Rentrez un nombre compris entre 0 et 100 : ");
                rep = sc.nextInt();
            }while(rep<0 || rep>100);
            sc.nextLine();
            compteur += 1;
            if(rep > nbrATrouver){
                System.out.println("C'est moins ");
                System.out.println("Attention, plus que " + (7-compteur) + " chances");
            }
            else if(rep < nbrATrouver){
                System.out.println("C'est plus ");
                System.out.println("Attention, plus que " + (7-compteur) + " chances");
            }
            else{
                trouve = true;
            }


        }while(!trouve && compteur <= 7);

        if(trouve){
            System.out.print("Bien joué, tu as réussi");
        }
        else{
            System.out.print("Dommage bien tenté");
        }
    }
}
