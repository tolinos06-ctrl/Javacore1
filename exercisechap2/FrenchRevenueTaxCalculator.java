package javacore.chapter02.condition.exercise;

public class FrenchRevenueTaxCalculator {
    public static void main(String[] args){

        double netAnnualSalary = 200000;
        double pourcentage = 0;
        double impot = 0;
        double salaireAbattement = netAnnualSalary * 0.9;
        final int tranche1 = 11294;
        final int tranche2 = 28797;
        final int tranche3 = 82342;
        final int tranche4 = 177106;

        // mettre dans l'ordre décroissant au lieu de croissant ( pour les if )
        // rajouter des constantes de type finals pour toutes les tranches
        if( salaireAbattement > tranche4){
            impot += (salaireAbattement - tranche4) * 0.45;
            salaireAbattement = tranche4;
        }

        if(salaireAbattement > tranche3){
            impot += (salaireAbattement - tranche3)*0.41;
            salaireAbattement = tranche3;
        }

        if(salaireAbattement > tranche2) {
            impot += (salaireAbattement - tranche2) * 0.3 ;
            salaireAbattement = tranche2;
        }

        if(salaireAbattement > tranche1){
            impot += (salaireAbattement - tranche1) * 0.11;
            salaireAbattement = tranche1;
        }

        if(salaireAbattement<= tranche1 ){
            System.out.println("Pas d'impot sur le revenu");
        }

        pourcentage = impot * 100 / netAnnualSalary ;
        netAnnualSalary -= impot;


        System.out.println(" Imposition net : " + impot + " soit " + pourcentage + " % du salaire");
        System.out.println("Le salaire net est : " + netAnnualSalary);


    }
}
