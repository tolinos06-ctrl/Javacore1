package javacore.chapter05.object.practice;
import java.util.Scanner;

public class CalculTempsTravail {
    public static void main(String[] args){
        String rep = "";
        int compteur = 0;
        int heure = 0;
        int heure2 = 1;
        int minute = 0;
        String rep2 = "";
        int tempsTravailHeure = 7;
        int tempsTravailMinute = 48;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("A quelle heure avez vous commencé ?(heure sans minute) : ");
            while(!sc.hasNextInt()){
                System.out.print("A quelle heure avez vous commencé ?(heure sans minute) : ");
                sc.nextLine();
            }
            heure = sc.nextInt();
            sc.nextLine();
        }while(heure < 0 || heure >= 24);
        do {
            System.out.print("A quelle heure avez vous commencé ?(minutes) : ");
            while(!sc.hasNextInt()){
                System.out.print("A quelle heure avez vous commencé ?(MINUTES) : ");
                sc.nextLine();
            }
            minute = sc.nextInt();
            sc.nextLine();
        }while(minute < 0 || minute >= 60);
        do{
            System.out.print("Avez vous pris une pause pour manger ? : ");
            rep = sc.nextLine().trim().toLowerCase();
        }while(!rep.equals("oui") && !rep.equals("non"));
        if(rep.equals("oui")){
            do{
                System.out.print("De combien a-t-elle dépassé l'heure obligatoire ? (en minute) : ");
                while(!sc.hasNextInt()){
                    System.out.print("De combien a-t-elle dépassé l'heure obligatoire ? (en MINUTE) : ");
                    sc.nextLine();
                }
                compteur = sc.nextInt();
                sc.nextLine();
            }while(compteur < 0);
            while(compteur >= 60){
                heure2 += 1;
                compteur -= 60;
            }
            System.out.print("Vous avez pris une pause de " + heure2 + "h " + compteur + "min !!");
        }
        else{
            do {
                System.out.println("Durée minimum de 60min !!");
                System.out.print("Combien de temps va-t'elle durer ? (en minute) : ");
                while(!sc.hasNextInt()){
                    System.out.print("Combien de temps ? (en MINUTES) : ");
                    sc.nextLine();
                }
                compteur = sc.nextInt();
                sc.nextLine();
            }while(compteur<60);
            heure2 = 0;
            while(compteur >= 60){
                heure2 += 1;
                compteur -= 60;
            }
            System.out.print("Vous comptez prendre une pause de " + heure2 + "h " + compteur + "min !!");
        }
        System.out.println();
        compteur += tempsTravailMinute + minute;
        heure += tempsTravailHeure + heure2;
        if(compteur>=60){
            compteur -= 60;
            heure += 1;
        }
        heure = heure % 24;
        System.out.println("Vous finirez à : " + heure + "h " + compteur + "min !!!");
        System.out.print("Quelle heure est il (heure) ? : ");
        int testHeure = sc.nextInt();
        sc.nextLine();
        System.out.print("Quelle heure est il (minute) ? : ");
        int testMin = sc.nextInt();
        sc.nextLine();
        if (SoustractionHeureMinute.sub(compteur,testMin)<0){
            testHeure += 1;
            compteur += 60;
        }
        if(rep.equals("oui")){
            System.out.print("Il vous reste " + (heure-testHeure) + "h " + (compteur - testMin) + "min !!!");
        }
        else{
            System.out.print("Encore " + (heure-testHeure) + "h " + (compteur - testMin) + "min à tenir !!! (pause comprise)");
        }
    }
}
