package javacore.chapter02.condition.exercise;

public class MaxOfThree {
    public static void main(String[] args) {
        int a = 3,b=3,c=3;
        if(a<b && a<c){
            System.out.println(a + " Est le plus petits des trois");
        }
        else if(b<a && b<c){
            System.out.println(b + " Est le plus petits des trois");
        }
        else if(c<b && c<a){
            System.out.println(c + " Est le plus petits des trois");
        }
        else if(a==b && a==c){
            System.err.println("Erreur, les trois valeurs sont égales");
        }
        else if(a==b){
            System.out.println("Les valeurs de a et b sont égales");
        }
        else if(a==c){
            System.out.println("Les valeurs de a et c sont égales");
        }
        else{
            System.out.println("Les valeurs de b et c sont égales");
        }
    }
}
