package javacore.chapter02.condition.exercise;

public class ScholarshipEligibility {
    public static void main(String[] args) {
        //<3.5
        float studenGpa = 3.0f;
        //<40000 && >60000
        int householdIncome = 12;
        //true
        boolean hasExtracurricular = true;
        if(studenGpa>=3.5 && householdIncome<40000 && hasExtracurricular== true){
            System.out.println("Vous avez le droit a une bourse complete");
        }
        else if(studenGpa>=3.5 && householdIncome>=40000 && householdIncome<=60000 && hasExtracurricular== true){
            System.out.println("Vous avez le droit a une bourse partielle");
        }
        else{
            System.out.println("Vous n'êtes pas éligibles a une bourse");
        }
    }
}
