package javacore.chapter02.condition.exercise;

public class FrenchRevenueTaxCalculator {
    public static void main(String[] args) {
        double netAnnualSalary = 20000;
        double pourcentage = 0;
        double impot = 0;
        double salaireAbattement = netAnnualSalary * 0.9;
        double limiteMax = 28797;
        if(salaireAbattement<= 11294 ){
            System.out.println("Pas d'impot sur le revenu");
        }
        if(salaireAbattement > 11294){
            if(limiteMax > salaireAbattement){
                limiteMax = salaireAbattement;
            }
            impot += (limiteMax - 11294) * 0.11;
            pourcentage = impot * 100 / netAnnualSalary ;
            System.out.println(" Imposition net : " + impot + " soit " + pourcentage + " % du salaire");
            netAnnualSalary -= impot;
        }
        if(salaireAbattement > 28797) {
            limiteMax = 82342;
            if(limiteMax > salaireAbattement){
                limiteMax = salaireAbattement;
            }
            impot += (limiteMax - 28797) * 0.3 ;
            pourcentage = impot * 100 / netAnnualSalary ;
            System.out.println(" Imposition net : " + impot + " soit " + pourcentage + " % du salaire");
            netAnnualSalary -= impot;
        }
        if(salaireAbattement>82342){
            limiteMax = 177106;
            if(limiteMax > salaireAbattement){
                limiteMax = salaireAbattement;
            }
            impot += (limiteMax - 82342)*0.41;
            pourcentage = impot * 100 / netAnnualSalary ;
            System.out.println(" Imposition net : " + impot + " soit " + pourcentage + " % du salaire");
            netAnnualSalary -= impot;
        }
        if( salaireAbattement > 177106){
            impot= (salaireAbattement - 177106)*0.45;
            pourcentage = impot * 100 / netAnnualSalary ;
            System.out.println(" Imposition net : " + impot + " soit " + pourcentage + " % du salaire");
            netAnnualSalary -= impot;
        }
        System.out.println("Le salaire net est : " + netAnnualSalary);
    }
}