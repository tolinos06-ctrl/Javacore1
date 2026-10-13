package javacore.chapter03.loop.practice;

public class PracticeLoopWhile {
    public static void main (String[] args){
        int age = 15;

        while(age <18){
            System.out.println("Hello world");
            age ++;
        }
        System.out.println("On est sorti de la boucle");
        int n = 0;
        int ad = 0;
        while(n<=100){
            ad +=n;
            n++;
        }
    }
}
