package javacore.chapter03.loop.practice;

public class PracticeLoopFor {
    public static void main(String[] args){
        int n = 0;
        int ad = 0;

        for (int cNumber = 1; cNumber <= 100 ; cNumber++){
            System.out.println("Result = " + ad + " + " + cNumber);
            ad += cNumber;
            System.out.println("-----> " + ad);
        }

        int resultForIf = 0;
        for (int a = 1; a<=100;a++){
            if(a%2 == 0){
                for(int b = 1; b<= a;b++){
                    resultForIf += b;
                }
                System.out.println("Somme des nombres entre 1 et " + a + " : " + resultForIf);
            }
            else{
                System.out.println("Le nombre est impair");
            }
        }
    }
}
