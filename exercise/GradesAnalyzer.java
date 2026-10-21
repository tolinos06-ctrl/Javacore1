package javacore.chapter05.object.exercise;
import java.util.Scanner;

public class GradesAnalyzer {
    public static void main(String[] args){
        int[] gradesArray = note();

        System.out.println("La moyenne est " + getAverage(gradesArray));

        System.out.println("La note min est " + getMinGrade(gradesArray));

        System.out.println("La note max est " + getMaxGrade(gradesArray));

        System.out.println("Vous avez " + getGradeCountAboveThreshold(gradesArray,12) + " notes au dessus de 12");


        getGradeCountBetweenRange(gradesArray,5,10);
        double pourcentage = getGradeCountBetweenRange(gradesArray,5,10)/gradesArray.length;
        System.out.println("Soit "+pourcentage*100 + "%");

    }
    public static int[] note(){
        Scanner sc = new Scanner(System.in);
        //int nbrNotes = 0;
        String rep = "";
        //do{
        //    System.out.print("Combien de notes voulez vous rentrer ? : ");
        //    while(!sc.hasNextInt()) {
       //         System.out.print("Combien de notes voulez vous rentrer ? : ");
        //        sc.nextLine();
        //    }
        //    nbrNotes = sc.nextInt();
       //     sc.nextLine();

        //}while(nbrNotes<2 || nbrNotes>30 && rep.equals("non"));
        int compteur = 0;
        int [] note = new int[30];
        do{
            do{
                System.out.print("Voulez vous rentrer une note ? (Oui/Non) : ");
                rep = sc.nextLine().trim().toLowerCase();
            }while(!rep.equals("oui") && !rep.equals("non"));

            if(rep.equals("non")){
                break;
            }
            else{
                    System.out.print("Veuillez rentrer la note numéro " + (compteur+1) + " : ");
                    while(!sc.hasNextInt()){
                        System.out.print("Veuillez rentrer la note numéro " + (compteur+1) + " : ");
                        sc.nextLine();
                    }
                    note[compteur] = sc.nextInt();
                    sc.nextLine();
                    compteur +=1;
            }
            if(compteur == 30){
                break;
            }
        }while(true);

        return note;
    }

    public static double getAverage(int[] gradesArray){
        double compteur = 0;
        for(int i = 0;i<gradesArray.length;i++){
            compteur += gradesArray[i];
        }
        return compteur/gradesArray.length;
    }

    public static double getMinGrade(int[] gradesArray){
        double min = gradesArray[0];
        for(int i = 1;i<gradesArray.length;i++){
            if(gradesArray[i]<min){
                min = gradesArray[i];
            }
        }
        return min;
    }

    public static double getMaxGrade(int[] gradesArray){
        double max = gradesArray[0];
        for(int i = 1;i<gradesArray.length;i++){
            if(gradesArray[i]>max){
                max = gradesArray[i];
            }
        }
        return max;
    }

    public static double getGradeCountAboveThreshold(int[] gradesArray, int threshold){
        int compteur = 0;
        for(int i =0;i<gradesArray.length;i++){
            if(gradesArray[i]>threshold){
                compteur += 1;
            }
        }
        return compteur;
    }

    public static int getGradeCountBetweenRange(int[] gradesArray, int from, int to){
        int compteur = 0;
        for(int i =0;i<gradesArray.length;i++){
            if(gradesArray[i]>from && gradesArray[i]<=to){
                compteur += 1;
            }
        }
        System.out.println("Nombre de notes ["+(from+1)+"-"+to+"] = " +compteur);
        return compteur;
    }
}
