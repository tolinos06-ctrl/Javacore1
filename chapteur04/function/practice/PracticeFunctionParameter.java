package javacore.javacore.chapteur04.function.practice;

public class PracticeFunctionParameter {
    public static void main(String[] args){
        displaySection(1, "Contenue de la section");
        System.out.println();
        displaySection(2,"Contenue de la section");
        System.out.println();
        displaySection(3,"Contenue de la section");
    }
    public static void displaySection(int sectionNumber, String sectionContent){
        System.out.println("-- Début de la section " + sectionNumber);
        System.out.println("------------------------");
        System.out.println("-Contenu de la section : " + sectionContent);
        System.out.println("------------------------");
        System.out.println("-- Fin de la section " + sectionNumber);
    }
}
