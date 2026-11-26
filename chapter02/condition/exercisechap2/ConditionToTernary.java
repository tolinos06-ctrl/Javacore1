package javacore.chapter02.condition.exercisechap2;

public class ConditionToTernary {
    public static void main(String[] args) {

        /**
         * Le code doit s'adapter aux différentes valeurs que vous mettrez à la variable age.
         */
        Integer age = 18;

        int pourcentageReduction = age < 18 ? 50:10;
        System.out.println(pourcentageReduction + "% de réduction");
    }
}
