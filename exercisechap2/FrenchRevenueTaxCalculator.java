package javacore.chapter02.condition.exercise;

public class FrenchRevenueTaxCalculator {
    public static void main(String[] args) {
        double netAnnualSalary = 20000;
        double pourcentage = 0;
        double impot = 0;
        if(netAnnualSalary*0.9 <= 11294 ){
            System.out.println("Pas d'impot sur le revenu");
        }
        else if(netAnnualSalary*0.9 > 11294 && netAnnualSalary*0.9 <= 28797){
            impot = (netAnnualSalary * 0.9 -11294) * 0.11 ;
            pourcentage = impot * 100 / netAnnualSalary ;
            System.out.println(" Imposition net : " + impot + " soit " + pourcentage + " % du salaire");
        }
        else if(netAnnualSalary*0.9>28797 && netAnnualSalary*0.9<=82342) {
            impot = ((netAnnualSalary * 0.9 - 28797) * 0.3 )+ 1925 ;
            pourcentage = impot * 100 / netAnnualSalary ;
            System.out.println(" Imposition net : " + impot + " soit " + pourcentage + " % du salaire");
        }
        else if(netAnnualSalary*0.9>82342 && netAnnualSalary*0.9<=177.106){
            impot = (netAnnualSalary*0.9 - 82342)*0.41 + (82342 - 28979)*0.3 + 1925;
            pourcentage = impot * 100 / netAnnualSalary ;
            System.out.println(" Imposition net : " + impot + " soit " + pourcentage + " % du salaire");
        }
        else{
            impot= (netAnnualSalary*0.9 - 177106)*0.45 + (177106 - 82342)*0.41 + (82342 - 28979)*0.3 + 1925 ;
            pourcentage = impot * 100 / netAnnualSalary ;
            System.out.println(" Imposition net : " + impot + " soit " + pourcentage + " % du salaire");
        }
    }
}