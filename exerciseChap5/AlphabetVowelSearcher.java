package javacore.chapter05.object.exercise;
import java.util.Scanner;

public class AlphabetVowelSearcher {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une phrase/mot de votre choix : ");
        String message = sc.nextLine().trim().toLowerCase();
        String vowels = "aeiouy";
        // Ecrivez le code ci-dessous
        for(int i = 0;i<message.length();i++){
            char test = message.charAt(i);
            for(int j = 0; j<vowels.length();j++){
                char test2 = vowels.charAt(j);
                if(test == test2){
                    System.out.println(test + " en position " + (i+1));;
                }
            }
        }
        for (int i = 0; i < message.length(); i++) {
            char lettre = message.charAt(i);

            if (vowels.indexOf(lettre) != -1) {
                System.out.println("Voyelle trouvée : '" + lettre + "' à la position " + (i + 1));
            }
        }

        for(int i = 0;i<vowels.length();i++){
            char lettre = vowels.charAt(i);
            int compteur2 = 0;
            for(int j = 0;j<message.length();j++){
                char test = message.charAt(j);
                if (test == lettre){
                    compteur2 +=1;
                }
            }
            System.out.println(lettre + " trouvé " + compteur2 + " fois");
        }
        for(int i = 0;i<vowels.length();i++){
            char lettre = vowels.charAt(i);
            int compteur = 0;
            int index = message.indexOf(lettre,0);
            while(index != -1){
                compteur += 1;
                index = message.indexOf(lettre,index + 1);
            }
            System.out.println(lettre+" trouvée " + compteur + " fois");
        }


    }
}
