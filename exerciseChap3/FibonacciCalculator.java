package javacore.chapter03.loop.exercise;

public class FibonacciCalculator {
    public static void main(String[] args) {
        long u0 = 0;
        long u1 = 1;
        long c = u0 + u1;
        for(int i = 2;i<=50;i++){
            c = u0 + u1;
            if(c%2 == 0){
                System.out.println(c);
            }
            u0 = u1;
            u1 = c;
        }
    }
}
