package javacore.chapter05.object.practice;
import java.util.Scanner;

public class AdditionHeureMinute {
    public static void main(String[] args){
        int[] array = {1,2,3,4};

        for( int currentValue : array){
            System.out.println(currentValue);
        }

        Scanner sc = new Scanner(System.in);
        int minute = 0;
        int minute2 = 0;
        int heure3 = 0;
        do{
            System.out.print("Entrez les minutes actuelle : ");
            while(!sc.hasNextInt()){
                System.out.print("Entrez les minutes actuelle : ");
                sc.nextLine();
            }
            minute = sc.nextInt();
            sc.nextLine();
        }while(minute<0 || minute >=60);
        do{
            System.out.print("Entrez les minutes que vous voulez additionner : ");
            while (!sc.hasNextInt()){
                System.out.print("Entrez les minutes que vous voulez additionner : ");
                sc.nextLine();
            }
            minute2 = sc.nextInt();
            sc.nextLine();
        }while(minute2<0 || minute2 >=60);

        int compteur = minute+minute2;
        if(compteur >= 60){
            heure3 = 1;
            compteur -= 60;
        }
        if(heure3>0){
            System.out.println(minute + " min + " + minute2 + " min = " + heure3 + " h " + compteur + " min ");
        }
        else{
            System.out.println(minute + " min + " + minute2 + " min = " + compteur + " min");
        }

        int heure = 0;
        int heure2 = 0;
        int jour = 0;
        do{
            System.out.print("Rentrer une heure : ");
            while(!sc.hasNextInt()){
                System.out.print("Rentrer une heure : ");
                sc.nextLine();
            }
            heure = sc.nextInt();
            sc.nextLine();
        }while(heure < 0 || heure>=24);
        do{
            System.out.print("Rentrer une heure a additionner: ");
            while(!sc.hasNextInt()){
                System.out.print("Rentrer une heure a additionner: ");
                sc.nextLine();
            }
            heure2 = sc.nextInt();
            sc.nextLine();
        }while(heure2 < 0 || heure2>=24);

        int compteur2 = heure+heure2+heure3;
        if(compteur2 >= 24){
            jour = 1;
            compteur2 -= 24;
        }
        if(jour>0){
            System.out.print(heure + " heure + " + heure2 + " heure = " + jour + " jour " + compteur2 + " heure " + compteur + " min");
        }
        else{
            System.out.print(heure + " heure + " + heure2 + " heure = " + compteur2 + " heures " + compteur + " min");
        }

    }
    public static double calculMinuteDecimal(int minute, int minute2){
        double Heure = minute/60;
        double Heure2 = minute2/60;
        return Heure - Heure2;
    }

    public static void calculHeure(int heure,int heure2, double minute){
        double resultTotal = heure + heure2 + minute;
        System.out.print(resultTotal);
    }

    public static int sum(int a,int b,int c){
        return a + b + c;
    }
}
