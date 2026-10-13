package javacore.javacore.chapteur04.function.exerciceChap4;

public class RecursiveFibonacci {
        public static void main(String[] args) {
            long u0 = 0;
            long u1 = 1;
            Fibonacci(u0,u1,1);
        }

        public static void Fibonacci(long u0,long u1,int compteur){
            long c = u0 + u1;
            System.out.println(c + " est le terme N°" + compteur + " de la suite");
            if(compteur<=50){
                Fibonacci(u1,c,compteur + 1);
            }
    }

}
