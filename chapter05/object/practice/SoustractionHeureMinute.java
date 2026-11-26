package javacore.chapter05.object.practice;
import java.util.Scanner;

public class SoustractionHeureMinute {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int minute = 0;
        int minute2 = 0;
        int heure3 = 0;
        int heure = 0;
        int heure2 = 0;
        int jour = 0;
        do {
            do {
                System.out.print("Rentrer une heure :  ");
                while (!sc.hasNextInt()) {
                    System.out.print("Rentrer une heure : ");
                    sc.nextLine();
                }
                heure = sc.nextInt();
                sc.nextLine();
            } while (heure < 0 || heure >= 24);
            do {
                System.out.print("Rentrer une heure a soustraire (assurez vous que la soustraction soit >=0) : ");
                while (!sc.hasNextInt()) {
                    System.out.print("Rentrer une heure a soustraire (assurez vous que la soustraction soit >=0) : ");
                    sc.nextLine();
                }
                heure2 = sc.nextInt();
                sc.nextLine();
            } while (heure2 < 0 || heure2 >= 24);
        }while(sub(heure,heure2)<0);


            do {
                System.out.print("Entrez les minutes actuelle : ");
                while (!sc.hasNextInt()) {
                    System.out.print("Entrez les minutes actuelle : ");
                    sc.nextLine();
                }
                minute = sc.nextInt();
                sc.nextLine();
            } while (minute < 0 || minute >= 60);
            do {
                System.out.print("Entrez les minutes que vous voulez soustraire : ");
                while (!sc.hasNextInt()) {
                    System.out.print("Entrez les minutes que vous voulez soustraire : ");
                    sc.nextLine();
                }
                minute2 = sc.nextInt();
                sc.nextLine();
            } while (minute2 < 0 || minute2 >= 60);

        long compteur = sub(minute,minute2);
        if(compteur < 0){
            heure3 = 1;
            compteur += 60;
        }
        int compteur2 = heure-heure2-heure3;
        if(compteur2 >= 24){
            jour = 1;
            compteur2 -= 24;
        }
        if(jour>0){
            System.out.print(heure + "h " + minute + "min " + " - " + heure2 + "h " + minute2 + "min" + " = " + jour + " jour " + compteur2 + " heure " + compteur + " min");
        }
        else{
            System.out.print(heure + "h " + minute + "min " + " - " + heure2 + "h " + minute2 + "min" + " = " + compteur2 + " heures " + compteur + " min");
        }




    }

    public static long sub(long a ,long b){
        return a - b ;
    }
}
