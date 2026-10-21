package javacore.chapter05.object.exercise;
import java.util.Scanner;

public class BinaryConverter {

    public static void main(String[] args){
        String rep = "";
        Scanner sc = new Scanner(System.in);
        boolean valid = false;
        do{
            System.out.print("Entrez un binaire : ");
            rep = sc.nextLine();
            valid = true;
            for(int i = 0; i<rep.length();i++){
                if (rep.charAt(i) != '1' && rep.charAt(i) != '0'){
                    valid = false;
                    System.out.println("Ce binaire n'est pas bon !!!");
                    break;
                }
            }

        }while(valid == false);
        int compteur = 0;
        for(int i = 0;i<rep.length();i++){
            if(rep.charAt(i) == '1'){
                compteur += Math.pow(2,(rep.length() - i-1));
            }

        }
        System.out.print(rep + " = " +compteur + " en décimal");

        // Pour vérifier int verif = Integer.parseInt("10110110", 2); // Renvoie directement 182
    }

}

