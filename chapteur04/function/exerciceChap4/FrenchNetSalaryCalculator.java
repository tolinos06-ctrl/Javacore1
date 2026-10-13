package javacore.javacore.chapteur04.function.exerciceChap4;

public class FrenchNetSalaryCalculator {
    public static void main(String[] args) {
        double AnnualGrossSalary = calculateAnnualGrossSalary(35);
        double AnnualNetSalary = applySocialCharges(AnnualGrossSalary,0.15);
        double Revenue = applyTaxAllowance(AnnualNetSalary,0.10);
        applyRevenueTax(Revenue);
    }
    public static double calculateAnnualGrossSalary(double hourlyGrossSalary){
        System.out.println(hourlyGrossSalary * 7.7 * 5 * 4 * 12 + " est le salaire annuel brut");
        return hourlyGrossSalary * 7.7 * 5 * 4 * 12;
    }
    public static double applySocialCharges(double annualGrossSalary, double socialChargePercentage){
        System.out.println(annualGrossSalary * ( 1 - socialChargePercentage) + " est le salaire net imposable");
        return annualGrossSalary * ( 1 - socialChargePercentage);
    }
    public static double applyTaxAllowance(double annualNetSalary, double taxAllowancePercentage){
        System.out.println( annualNetSalary* (1-taxAllowancePercentage) + " est le salaire net imposable après abattement");
        return annualNetSalary*(1-taxAllowancePercentage);
    }
    public static double applyRevenueTax(double annualNetSalary){
        double impot = 0;
        double limiteMax = 28797;
        if(annualNetSalary<= 11294 ){
            System.out.println("Pas d'impot sur le revenu");
        }
        if(annualNetSalary > 11294){
            if(limiteMax > annualNetSalary){
                limiteMax = annualNetSalary;
            }
            impot += (limiteMax - 11294) * 0.11;
            System.out.println("Imposition net : " + impot );
            annualNetSalary -= impot;
        }
        if(annualNetSalary > 28797) {
            limiteMax = 82342;
            if(limiteMax > annualNetSalary){
                limiteMax = annualNetSalary;
            }
            impot += (limiteMax - 28797) * 0.3 ;
            System.out.println("Imposition net : " + impot );
            annualNetSalary -= impot;
        }
        if(annualNetSalary>82342){
            limiteMax = 177106;
            if(limiteMax > annualNetSalary){
                limiteMax = annualNetSalary;
            }
            impot += (limiteMax - 82342)*0.41;
            System.out.println("Imposition net : " + impot );
            annualNetSalary -= impot;
        }
        if( annualNetSalary > 177106){
            impot= (annualNetSalary - 177106)*0.45;
            System.out.println("Imposition net : " + impot);
            annualNetSalary -= impot;
        }
        System.out.println("Salaire net annuel " + annualNetSalary);
        return annualNetSalary;
    }
}

