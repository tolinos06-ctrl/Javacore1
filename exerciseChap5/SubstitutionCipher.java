package javacore.chapter05.object.exercise;
import java.util.Locale;
import java.util.Scanner;
public class SubstitutionCipher {

    public static void main(String[] args) {

        /**
         * Alphabet Standard (Latin)
         */
        String latinAlphabet = "abcdefghijklmnopqrstuvwxyz";

        /**
         *  Alphabet de Substitution
         */
        String substitutionAlphabet = "ntrhwbgeyjzlsoaqdmcuvfpxik";

        /**
         *  Texte à chiffrer
         */

        String textToEncrypt = "";
        String action = "";
        int iteration = 0;
        Scanner sc = new Scanner(System.in);
        do{System.out.print("Entrez le message a coder/décoder : ");
        textToEncrypt = sc.nextLine().trim().toLowerCase();}
        while(textToEncrypt.isEmpty());
        do{System.out.print("Voulez Déchiffrer ou chiffrer ? (D/C) : ");
        action = sc.nextLine().trim().toLowerCase();}
        while(!action.equals("c") &&  !action.equals("d"));
        do{System.out.print("Combien de fois voulez vous chiffrer ? : ");
            while(!sc.hasNextInt()){
                System.out.print("Combien de fois voulez vous chiffrer ? : ");
                sc.next();
            }
            iteration = sc.nextInt();
            sc.nextLine();
        }
        while(iteration<=0);

        //String textToEncrypt = "ce message secret ne doit pas arriver entre de mauvaises mains !";

        //for(int i = 0;i <= substitutionAlphabet.length()-1;i++){
        //    char lettre = substitutionAlphabet.charAt(i);
        //    for(int j = 0;j<=latinAlphabet.length()-1;j++){
        //        char alphabet = latinAlphabet.charAt(j);
        //        if (i == j){
        //            System.out.println(alphabet + " correspond a " + lettre);
        //        }
        //    }
        //}
        if(action.equals("c")){
            System.out.println(cipher(textToEncrypt,latinAlphabet,substitutionAlphabet,iteration));
        }
        else{
            System.out.println(biCipher(textToEncrypt,latinAlphabet,substitutionAlphabet,iteration));
        }


        // Ecrivez le code ci-dessous
        String encryption = "";
        for(int i = 0;i < textToEncrypt.length();i++){
            char lettre = textToEncrypt.charAt(i);
            for(int j = 0;j<latinAlphabet.length();j++){
                char alphabet = latinAlphabet.charAt(j);
                if ((lettre == alphabet)){
                    encryption += substitutionAlphabet.charAt(j);
                }
            }
        }
        String ponctuation = textToEncrypt.replaceAll("[a-z]", "");
        encryption += ponctuation;

        System.out.print(encryption);


    }

    public static String biCipher(String textToDecrypt, String alphabet, String substitutionAlphabet, int cipherIterations){
        for(int k = 0;k<cipherIterations;k++){
            String text = "";
            for(int i = 0;i < textToDecrypt.length();i++) {
                char lettre = textToDecrypt.charAt(i);
                for (int j = 0; j < substitutionAlphabet.length(); j++) {
                    char lettre2 = substitutionAlphabet.charAt(j);
                    if (lettre == lettre2) {
                        text += alphabet.charAt(j);
                    }
                }
            }
            String ponctuation = textToDecrypt.replaceAll("[a-z]", "");
            text += ponctuation;
            textToDecrypt = text;
        }

        return textToDecrypt;
    }


    public static String cipher(String textToEncrypt, String alphabet, String substitutionAlphabet, int cipherIterations){
        for(int k = 0;k<cipherIterations;k++){
            String text = "";
            for(int i = 0;i < textToEncrypt.length();i++) {
                char lettre = textToEncrypt.charAt(i);
                for (int j = 0; j < alphabet.length(); j++) {
                    char lettre2 = alphabet.charAt(j);
                    if (lettre == lettre2) {
                        text += substitutionAlphabet.charAt(j);
                    }
                }
            }
            String ponctuation = textToEncrypt.replaceAll("[a-z]", "");
            text += ponctuation;
            textToEncrypt = text;
        }

        return textToEncrypt;
    }

    String latinAlphabet = "abcdefghijklmnopqrstuvwxyz";

    /**
     *  Alphabet de Substitution
     */
    String substitutionAlphabet = "ntrhwbgeyjzlsoaqdmcuvfpxik";

    public SubstitutionCipher(String alphabet, String subAlphabet) {
        this.latinAlphabet = alphabet;
        this.substitutionAlphabet = subAlphabet;
    }
}
