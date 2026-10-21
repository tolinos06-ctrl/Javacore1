package javacore.chapter05.object.exercise;

public class ReversedString {

    public static void main(String[] args) {

        String text = "! ecicrexe'l issuér zeva suov ,ovarB";
        // Ecrivez le code ci-dessous
        char[] lettre = text.toCharArray();
        int i = 0;
        for (i = lettre.length - 1 - i; i >= 0; i--){
            System.out.print(lettre[i]);
        }
    }
}
