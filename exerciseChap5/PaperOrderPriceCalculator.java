package javacore.chapter05.object.exercise;
import java.util.Scanner;

public class PaperOrderPriceCalculator {
    public static void main(String[] args) {
        int compteur = 0;
        int paperValue = askPaper();
        if(compteur < 5){
            double prix = calculPrix(paperValue);
            afficherFacture(prix);
        }
        else{
            System.out.println("T'as eu 5 chances, c'est CIAO");
        }    }

    public static int askPaper(){
        int paperValue;
        int compteur = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Le montant est soumis a une TVA de 20%");
            System.out.println("Les frais de livraisons sont de 9.99 euros/ exonéré si commande > 200 euros");
            System.out.println("200 < Nbr de feuille > 200 000");
            System.out.print("Combien de feuilles voulez vous commander ? : ");
            paperValue = sc.nextInt();
            sc.nextLine();
            compteur += 1;
        }while((paperValue < 200 || paperValue > 200000) && compteur < 5);
        return paperValue;
    }

    public static double calculPrix(int paperValue) {
        double prix = 0;
        int limite = 0;
        final int tranche1 = 10000;
        final int tranche2 = 30000;
        if (paperValue > tranche2){
            limite = paperValue - tranche2;
            prix += limite * 0.0025;
            limite = tranche2;
        }
        if (limite > tranche1){
            prix += (limite-tranche1) * 0.005;
            limite = tranche1;
        }
        if(paperValue <= tranche1){
            prix += limite * 0.01;
        }
        return prix;
    }

    public static void afficherFacture(double prix){
        if(prix > 200){
            System.out.println("Le prix HT est de : " + prix);
            System.out.println("Le prix TTC est de : " + prix * 1.2);
        }
        else{
            prix += 9.99;
            System.out.println("Le prix HT est de : " + prix);
            System.out.println("Le prix TTC est de : " + prix * 1.2);
        }
    }
}