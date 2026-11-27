package javacore.chapter06.workshop.Exercicechap06;
import java.util.Scanner;
import org.apache.commons.validator.routines.EmailValidator;


public class TestEmail {
    public static void main(String[] args) {
        EmailValidator validator = EmailValidator.getInstance();
        Scanner sc = new Scanner(System.in);
        String mail = " ";
        do{
            System.out.print("Entrez votre adresse mail : ");
            mail = sc.nextLine();
            while(!validator.isValid(mail)){
                System.out.println("Adresse pas valide.");
                System.out.print("Entrez votre adresse mail : ");
                mail = sc.nextLine();
            }
        }while(!validator.isValid(mail));
        System.out.print("Adresse valide : " + mail);

    }

}
