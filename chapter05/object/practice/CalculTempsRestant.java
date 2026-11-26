package javacore.chapter05.object.practice;
import java.util.Scanner;
public class CalculTempsRestant {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Quelle heure est il ?(heure sans minute) : ");
        int heure = sc.nextInt();
        sc.nextLine();
        System.out.print("Quelle heure est il ?(minute) : ");
        int minute = sc.nextInt();
        sc.nextLine();
        System.out.print("Combien de temps devez vous travailler ?(heure sans minute) : ");
        int heure2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Combien de temps devez vous travailler ?(minute) : ");
        int minute2 = sc.nextInt();
        sc.nextLine();
        System.out.print("De combien de temps votre pause a/va dépasser l'heure obligatoire (en minute) ? : ");
        int pause = sc.nextInt();
        sc.nextLine();
        int pauseHeure = 1;
        if(pause>=60){
            pause -= 60;
            pauseHeure += 1;
        }
        if(AdditionHeureMinute.sum(minute,minute2,pause)>=60){
            minute -= 60;
            heure += 1;
        }
        System.out.print("Vous finirez à : "+AdditionHeureMinute.sum(heure,heure2,pauseHeure) + "h " + AdditionHeureMinute.sum(minute,minute2,pause) + "min");
    }
}
