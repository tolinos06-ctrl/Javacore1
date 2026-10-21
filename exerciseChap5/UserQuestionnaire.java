package javacore.chapter05.object.exercise;
import java.util.Scanner;
public class UserQuestionnaire {

    String prenom;
    int age;
    String question;
    double math;
    int taille;

    public UserQuestionnaire(String prenom,int age, String question, double math, int taille){
        this.prenom = prenom;
        this.age = age;
        this.question = question;
        this.math = math;
        this.taille = taille;
    }

   public void displayInformations(){
        System.out.println("Bonjour " + this.prenom + " Vous avez " + this.age + " ans");
        if(this.question.equals("oui")){
            System.out.print("5/2 = " + this.math +" Selon vous et " + " Vous faites " + this.taille + " cm");
        }
   }

    public static void test1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez votre prénom : ");
        String nameValue = sc.nextLine();
        System.out.print("Entrez votre age : ");
        int ageValue = sc.nextInt();
        sc.nextLine();
        System.out.print("Voulez vous continuer de répondre a des questions ? (Oui/Non) : ");
        String repValue = sc.nextLine();
        if(repValue.equals("Non")){
            System.out.println("Bonjour " + nameValue + " Vous avez " + ageValue + " ans");
        }
        else{
            System.out.print("Entrez le résultat de 5/2 : ");
            float resultValue = sc.nextFloat();
            sc.nextLine();
            System.out.print("Entrez votre taille (en cm) : ");
            String heightValue = sc.nextLine();
            System.out.println("Bonjour " + nameValue + " Vous avez " + ageValue + " ans");
            System.out.println("5/2 = " + resultValue + " Vous faites " + heightValue + " cm");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez votre prénom : ");
        String prenom = sc.nextLine();
        System.out.print("Entrez votre age : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Voulez vous continuer de répondre a des questions ? (Oui/Non) : ");
        String question = sc.nextLine().trim().toLowerCase();
        double math =0;
        int taille = 0;
        if(question.equals("oui")){
            System.out.print("Entrez le résultat de 5/2 : ");
            math = sc.nextFloat();
            sc.nextLine();
            System.out.print("Entrez votre taille (en cm) : ");
            taille = sc.nextInt();
            sc.nextLine();
        }
        UserQuestionnaire questionnaire = new UserQuestionnaire(prenom,age,question,math,taille);
        questionnaire.displayInformations();
    }
}