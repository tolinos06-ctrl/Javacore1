package javacore.chapter05.object.exercise;

public class LibraryBook {

    String titre;
    String resume;
    String auteur;


    boolean dispo;

    int annéePublication;
    int ISBN;

    public void displayInformation(){
        System.out.println("Titre : " + titre + " |Auteur" + auteur + " |Année de publication " + annéePublication + "|ISBN " + ISBN  + " |Résumé " + resume);
        if(dispo){
            System.err.println("|Disponibile ");
        }
        else{
            System.err.println("|Indisponibile ");
        }
    }
}
