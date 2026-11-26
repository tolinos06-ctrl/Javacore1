package javacore.chapter05.object.practice;
import java.util.Scanner;
public class PracticeArray {
    public static void main(String[] args){
        int[] integerArray = {1, 2, 3, 4, 5};
        for (int i = 0; i < integerArray.length ;i++){

            System.out.print(integerArray[i]);
        }
        System.out.println();
        for (int j = integerArray.length - 1;j>=0;j-- ){
            System.out.print(integerArray[j]);
        }


        Scanner sc = new Scanner(System.in);
        System.out.print("Combien d'éléments voulez vous additionner ? ");
        int desiredUserSize = sc.nextInt();
        int[] integerArray2 = new int[desiredUserSize] ;
        int compteur = 0;
        for(int i = 0; i < integerArray2.length;i++ ){
            System.out.print("Choisissez un nombre pour l'addition : ");
            int addition = sc.nextInt();
            compteur += addition;
        }
        System.out.print("Le résultat de l'addition est " + compteur);
    }
}
