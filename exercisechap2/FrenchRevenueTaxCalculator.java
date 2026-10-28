package javacore.chapter02.condition.exercise;

public class FrenchRevenueTaxCalculator {
    public static void main(String[] args){

        double netAnnualSalary = 200000;
        double pourcentage = 0;
        double impot = 0;
        double salaireAbattement = netAnnualSalary * 0.9;

        // mettre dans l'ordre décroissant au lieu de croissant ( pour les if )
        if( salaireAbattement > 177106){
            impot += (salaireAbattement - 177106) * 0.45;
            salaireAbattement = 177106;
        }

        if(salaireAbattement > 82342){
            impot += (salaireAbattement - 82342)*0.41;
            salaireAbattement = 82342;
        }

        if(salaireAbattement > 28797) {
            impot += (salaireAbattement - 28797) * 0.3 ;
            salaireAbattement = 28797;
        }

        if(salaireAbattement > 11294){
            impot += (salaireAbattement - 11294) * 0.11;
            salaireAbattement = 11294;
        }

        if(salaireAbattement<= 11294 ){
            System.out.println("Pas d'impot sur le revenu");
        }

        pourcentage = impot * 100 / netAnnualSalary ;
        netAnnualSalary -= impot;
        System.out.println(" Imposition net : " + impot + " soit " + pourcentage + " % du salaire");

        System.out.println("Le salaire net est : " + netAnnualSalary);


    }
}
