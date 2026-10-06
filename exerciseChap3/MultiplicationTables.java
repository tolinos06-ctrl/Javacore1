package javacore.chapter03.loop.exercise;

public class MultiplicationTables {
    public static void main(String[] args) {
        int resultat = 0;
        for(int i = 1;i<=9;i++){
            int verif = i;
            for(int j = 1;j<=9;j++){
                resultat = i*j;
                if (verif == i){
                    System.out.print("Table de " + i + " = ");
                    System.out.print(" " + resultat);
                    verif += 1;
                }
                else{
                    System.out.print(" " +resultat);
                }
            }
            System.out.println();
        }
    }
}
