package javacore.chapter02.condition.exercisechap2;

public class AgeValidation {

    public static void main(String[] args) {

        /**
         * Début d'un code que nous ne comprenons pas à ce stade de la formation...
         */

        // Récupération de la date courante de la machine exécutant ce programme
        java.time.LocalDate currentDate = java.time.LocalDate.now();

        int currentDay   = currentDate.getDayOfMonth(); // Jour courant (entre 1 et 31)
        int currentMonth = currentDate.getMonthValue(); // Mois courant (entre 1 et 12)
        int currentYear  = currentDate.getYear();       // Année courante (202X)
        //29 28
        int birthDay = 15;
        //9 10 8
        int birthMonth = 5;
        //2008 2009
        int birthYear = 2009;
        int majeurDay = birthDay - currentDay ;
        int majeurMonth = birthMonth - currentMonth ;
        int majeurYear = 18 - (currentYear - birthYear);
        System.out.println("Nous somme le " + currentDay + "/" + currentMonth + "/" + currentYear);

        /**
         * Fin d'un code que nous ne comprenons pas, mais dont nous pouvons utiliser les variables !
         */

        // Écrivez votre code ci-dessous...
        if(birthYear<(currentYear-18)){
            System.out.println("Tout est bon, vous pouvez installer");
        }
        else if (birthYear==(currentYear-18) && birthMonth<currentMonth){
            System.out.println("Tout est bon, vous pouvez installer");
        }
        else if (birthYear==(currentYear-18) && birthMonth==currentMonth && birthDay<=currentDay){
            System.out.println("Tout est bon, vous pouvez installer");
        }
        else{
            if(majeurDay<0){
                majeurMonth--;
                majeurDay+=31;
            }
            if(majeurMonth<0){
                majeurYear--;
                majeurMonth+=12;
            }
            System.out.println("Vous ne pouvez pas installer vous êtes mineur. Vous serez majeur dans " + majeurYear +"ans, " + majeurMonth +"mois, "+ majeurDay +"jours");
        }


    }
}
