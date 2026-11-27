package javacore.chapter05.object.exerciseChap5;
import java.util.Scanner;

public class ExoPerso {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String longueur = " ";
        boolean hasNumber = false;
        boolean hasUpperCase = false;
        do{
             hasNumber = false;
             hasUpperCase = false;
            System.out.print("Entrez votre mot de passe ?(Il doit contenir 1 chiffre et 1 Majuscule) : ");
            longueur = sc.nextLine();
            while (longueur.length()<8){
                System.out.print("Taille minimum de 8 caractères, réeessayer : ");
                longueur = sc.nextLine();
            }
            for(int i = 0; i<=longueur.length() - 1 ;i++){
                if(longueur.charAt(i) <= '9' && longueur.charAt(i) >= '0'){
                    hasNumber = true;
                }
                if(longueur.charAt(i) >= 'A' && longueur.charAt(i) <= 'Z'){
                    hasUpperCase = true;
                }
            }
        }while(!hasNumber || !hasUpperCase);
        System.out.println(longueur + " est votre mot de passe");
        for(int i = 0; i<longueur.length();i++){
            System.out.print('*');
        }

    }

    public static void Palydromme(){
        Scanner sc = new Scanner(System.in);
        boolean Palyndome = true;
        System.out.print("Entrez un mot : ");
        String mot = sc.nextLine();
        for(int i = 0;i<mot.length()/2;i++){
            if(mot.charAt(i) != mot.charAt(mot.length() -i -1)){
                Palyndome = false;
            }
        }
        if(Palyndome){
            System.out.print(mot + " est un palyndromme");
        }
        else{
            System.out.print(mot + " n'est pas un palyndromme");
        }

    }
}
